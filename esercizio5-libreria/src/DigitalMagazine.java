import java.time.LocalDate;
import java.util.Objects;

public class DigitalMagazine extends DigitalContent {
    //attributi
    private int issueNumber;
    private LocalDate publicationDate;
    private String category;
    //costruttore

    public DigitalMagazine(int id, String title, String author, float basePrice, float currentDiscount, String category, int issueNumber, LocalDate publicationDate) {
        super(id, title, author, basePrice, currentDiscount);
        this.category = category;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    //metodi
    public String DigitalContent() {
        return "DigitalContent";
    }

    public String getDescription() {
        return "Description";
    }

    public String isRecentIssue() {
        LocalDate adesso = LocalDate.now().minusDays(30);
        if (publicationDate.isBefore(adesso)) {
            super.setBasePrice(getBasePrice()*0.1f);
            return "Il libro e stato pubblicato dopo di 30 giorni";
        } else {
            return "Il libro e stato pubblicato prima di 30 giorni";
        }


    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DigitalMagazine that = (DigitalMagazine) o;
        return issueNumber == that.issueNumber && Objects.equals(publicationDate, that.publicationDate) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber, publicationDate, category);
    }

    @Override
    public String toString() {
        return "DigitalMagazine{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", basePrice=" + getBasePrice() +
                ", currentDiscount=" + getCurrentDiscount() +
                "issueNumber=" + issueNumber +
                ", publicationDate=" + publicationDate +
                ", category='" + category + '\'' +
                '}';
    }
}

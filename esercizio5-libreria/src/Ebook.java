import java.util.Objects;

public class Ebook extends DigitalContent{
    //attributi
    private Genre genre;
    private int pageCount;
    private boolean isllustrated;
    //costruttore

    public Ebook(int id, String title, String author, float basePrice, float currentDiscount, Genre genre) {
        super(id, title, author, basePrice, currentDiscount);
        this.genre = genre;
        this.pageCount = 0;
        this.isllustrated = false;
    }

    //metodi
    public String DigitalContent(){
        return genre.toString() + " " + pageCount + " " + isllustrated;
    }
    public String getDescription(){
        return "Description";
    }
    public float getReadingTime(){
        return pageCount*10;
    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ebook ebook = (Ebook) o;
        return pageCount == ebook.pageCount && isllustrated == ebook.isllustrated && genre == ebook.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre, pageCount, isllustrated);
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", basePrice=" + getBasePrice() +
                ", currentDiscount=" + getCurrentDiscount() +
                "genre=" + genre +
                ", pageCount=" + pageCount +
                ", isllustrated=" + isllustrated +
                '}';
    }
}

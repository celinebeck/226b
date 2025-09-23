import java.util.Objects;

public abstract class DigitalContent implements Purchasable {
    //attributi
    private int id;
    private String title;
    private String author;
    private float basePrice;
    private float currentDiscount;
    //costruttore

    public DigitalContent(int id, String title, String author, float basePrice, float currentDiscount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = currentDiscount;
    }
    //getter setter


    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(float currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    //metodi
    public abstract String DigitalContent();
    public abstract String getDescription();
    public float calculatePrice(){
        if(currentDiscount > 0){
            return basePrice * currentDiscount;
        }
        else {
            return basePrice;
        }
    }
    public void applyDiscount(double percentage){
        System.out.println(currentDiscount -= percentage);
    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DigitalContent that = (DigitalContent) o;
        return id == that.id && Float.compare(basePrice, that.basePrice) == 0 && Float.compare(currentDiscount, that.currentDiscount) == 0 && Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, basePrice, currentDiscount);
    }

    @Override
    public String toString() {
        return "DigitalContent{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", basePrice=" + basePrice +
                ", currentDiscount=" + currentDiscount +
                '}';
    }
}

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

}

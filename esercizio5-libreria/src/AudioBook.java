public class AudioBook extends DigitalContent{
    //attributi
    private String narrator;
    private int duration;
    private String language;
    //costruttore

    public AudioBook(int id, String title, String author, float basePrice, float currentDiscount, String narrator) {
        super(id, title, author, basePrice, currentDiscount);
        this.narrator = narrator;
        this.duration = 0;
        this.language = "en";
    }

    //metodi
    public String DigitalContent(){
        return "DigitalContent";
    }
    public String getDescription(){
        return "Description";
    }
    
    //metodi base

}

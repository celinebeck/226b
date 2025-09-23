import java.util.Objects;

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
    public String getFormattedDuration(){
        if(duration > 60){
            int hours = duration % 60;
            int minutes = duration - hours;
            return String.format("%02d:%02d", hours, minutes);
        }
        else{
            return String.format("%02d", duration);
        }
    }
    @Override
    public float calculatePrice(){
        if(duration > 60*8){
            return duration*0.2f;
        }
        else{
            return super.calculatePrice();
        }
    }
    //metodi base


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AudioBook audioBook = (AudioBook) o;
        return duration == audioBook.duration && Objects.equals(narrator, audioBook.narrator) && Objects.equals(language, audioBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(narrator, duration, language);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", basePrice=" + getBasePrice() +
                ", currentDiscount=" + getCurrentDiscount() +
                "narrator='" + narrator + '\'' +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                '}';
    }
}

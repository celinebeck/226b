import java.util.Objects;

final public class OnlineCourse extends DigitalContent {
    //attributi
    private String instructor;
    private Enum difficulty;
    private int estimatedHours;

    //costruttore


    public OnlineCourse(int id, String title, String author, float basePrice, float currentDiscount, String instructor, Enum difficulty, int estimatedHours) {
        super(id, title, author, basePrice, currentDiscount);
        this.instructor = instructor;
        this.difficulty = difficulty;
        this.estimatedHours = estimatedHours;
    }

    //metodi
    public String DigitalContent() {
        return "DigitalContent";
    }

    public String getDescription() {
        return "Description";
    }
    public boolean getCertificationEligible(){
        if(this.estimatedHours>10){
            return true;
        }
        else{
            return false;
        }

    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OnlineCourse that = (OnlineCourse) o;
        return estimatedHours == that.estimatedHours && Objects.equals(instructor, that.instructor) && Objects.equals(difficulty, that.difficulty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), instructor, difficulty, estimatedHours);
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", basePrice=" + getBasePrice() +
                ", currentDiscount=" + getCurrentDiscount() +
                "instructor='" + instructor + '\'' +
                ", difficulty=" + difficulty +
                ", estimatedHours=" + estimatedHours +
                '}';
    }
}

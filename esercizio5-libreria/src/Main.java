import java.time.LocalDate;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AudioBook audioBook1 = new AudioBook(1, "tramonto", "paolo", 13.4f, 0, "paolo");
        AudioBook audioBook2 = new AudioBook(2, "luna", "nico", 15.4f, 0, "nico");

        Ebook ebook1 = new Ebook(1, "mare", "franco", 12.0f, 0.1f, Genre.SCIENCE);
        Ebook ebook2 = new Ebook(2, "alba", "pippo", 10.0f, 0f, Genre.SCIENCE);

        DigitalMagazine digitalmagazine1  = new DigitalMagazine(1, "saturno", "pippo", 0.5f, 0f, "astronomia", 0, LocalDate.now());
        DigitalMagazine digitalmagazine2  = new DigitalMagazine(2, "marte", "baldo", 0f, 0f, "astronomia", 0, LocalDate.now().minusDays(40));

        OnlineCourse onlinecourse1 = new OnlineCourse(1, "terra", "tom", 20.0f, 0f, "tom", Difficulty.BEGINNER, 10 );
        OnlineCourse onlinecourse2 = new OnlineCourse(2, "giove", "dome", 70.0f, 0f, "dome", Difficulty.INTERMEDIATE, 3 );

        HashSet<Purchasable> purchasables = new HashSet<>();
        purchasables.add(audioBook1);
        purchasables.add(audioBook2);
        purchasables.add(audioBook2);
        purchasables.add(ebook1);
        purchasables.add(ebook2);
        purchasables.add(digitalmagazine1);
        purchasables.add(digitalmagazine2);
        purchasables.add(onlinecourse1);
        purchasables.add(onlinecourse2);
        for (Purchasable purchasable : purchasables) {
            System.out.println(purchasable);
        }
    }
}
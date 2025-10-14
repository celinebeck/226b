import java.util.Comparator;

public class ComparatorSport implements Comparator<Team> {
    public int compare(Team o1, Team o2) {
        return o1.getSport().compareTo(o2.getSport());
    }
}

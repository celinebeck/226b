import java.util.Comparator;

public class ComparatorSchoolName implements Comparator<Team> {
    public int compare(Team o1, Team o2) {
        return o1.getSchoolName().compareTo(o2.getSchoolName());
    }
}

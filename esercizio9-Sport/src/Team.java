public class Team implements Comparable<Team>{
    //attributi
    private String name;
    private String schoolName;
    private String sport;
    private int score;
    //costruttore

    public Team(String name, String schoolName, String sport, int score) {
        this.name = name;
        this.schoolName = schoolName;
        this.sport = sport;
        this.score = score;
    }
    //getter e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //metodi
    @Override
    public int compareTo(Team o) {
        return this.name.compareTo(o.name);
    }
    //metodi base

    @Override
    public String toString() {
        return this.name + " (" + this.schoolName + ") - Sport:" + this.sport + " " + this.score;
    }
}

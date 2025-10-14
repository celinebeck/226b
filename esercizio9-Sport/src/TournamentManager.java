import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TournamentManager {
    //attributi
    private ArrayList<Team> teams;
    private HashMap<Team, Integer> teamsScore;
    //costruttore
    public TournamentManager() {
        teamsScore = new HashMap<>();
    }
    //metodi
    public void addTeam(Team team) {
        if(teams.contains(team)) {
            System.out.println("Team " + team.getName() + " DUPLICATO e non aggiunto al torneo di "+ team.getSport());
        }
        else{
            int score = team.getScore();
            teams.add(team);
            teamsScore.put(team, score);
            System.out.println("Team " + team.getName() + " aggiunto al torneo di "+ team.getSport());
        }

    }
    public void updateScore(Team team, int delta) {
        teamsScore.put(team,+ delta);
    }
    public void printTeamsSortedByNatural(){
    Collections.sort(teams);
        System.out.println("*** Squadre in ordine naturale (punteggio decrescente) ***");
    for(Team team : teams){
        System.out.println(team);
    }
    }
    public void printTeamsSortedBySchool(){
        System.out.println("*** Squadre ordinate per scuola ***");
        Collections.sort(teams, new ComparatorSchoolName());
        for(Team team : teams){
            System.out.println(team);
        }
    }
    public void printTeamsSortedBySport(){
        System.out.println("*** Squadre ordinate per sport ***");
        Collections.sort(teams, new ComparatorSport());
        for(Team team : teams){
            System.out.println(team);
        }
    }
    public void printScores(){
        System.out.println("*** Punteggi attuali ***");
        for(Map.Entry<Team, Integer> team : teamsScore.entrySet()){
            System.out.println(team.getKey().getName()+"="+team.getValue()+", ");
        }
    }
    //metodi base
}

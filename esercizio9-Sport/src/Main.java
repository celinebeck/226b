//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Team t1 = new Team("Lupi Verdi", "Scuola Alfa","Calcio", 1);
        Team t2 = new Team("Tigri Blu", "Scuola Beta","Pallavolo", 0);
        Team t3 = new Team("Falchi Rossi", "Scuola Alfa","Calcio", 1);
        Team t4 = new Team("Pantere Nere", "Scuola Gamma","Basket", 2);
        Team t5 = new Team("Lupi Verdi", "Scuola Alfa","Basket", 1);
        TournamentManager tm = new TournamentManager();
        tm.addTeam(t1);
        tm.addTeam(t2);
        tm.addTeam(t3);
        tm.addTeam(t4);
        tm.addTeam(t5);
        System.out.println();
        tm.printTeamsSortedByNatural();
        System.out.println();
        tm.printTeamsSortedBySchool();
        System.out.println();
        tm.printTeamsSortedBySport();
        tm.printScores();
    }

}
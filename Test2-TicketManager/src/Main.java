//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketConcert tc1 = new TicketConcert("C001","Rock Festival 2025","15/06/2025","Parco eventi", 101, false, Sector.GRANDSTAND, "The Rolling Stones");
        TicketConcert tc2 = new TicketConcert("C002","Rock Festival 2025","18/06/2025","Arena Concerti", 201, false, Sector.CURVE, "The Rolling Stones");
        TicketConcert tc3 = new TicketConcert("C003","Jazz Night","20/07/2025","Arena concerti", 50, false, Sector.GRANDSTAND, "Miles Davis Tribute");

        TikcetTheater tt1 = new TikcetTheater("T001","Serate alla scala","10/08/2025","Teatro alla scala", 15, false, "La traviata",8,false);
        TikcetTheater tt2 = new TikcetTheater("T002","Serate alla scala","10/08/2025","Teatro alla scala", 25, false, "La traviata",3,true);
        TikcetTheater tt3 = new TikcetTheater("T003","Riscopriamo il teatro","05/09/2025","Teatro comunale", 40, false, "Amleto",12,true);
        TikcetTheater tt4 = new TikcetTheater("T004","Riscopriamo il teatro","05/09/2025","Teatro comunale", 41, false, "Amleto",12,false);

        TicketSport ts1 = new TicketSport("S001", "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 150, false, Sector.GRANDSTAND);
        TicketSport ts2 = new TicketSport("S002", "Serie A - Inter vs Milan", "25/09/2025", "Stadio San Siro", 250, false, Sector.CURVE);
        TicketSport ts3 = new TicketSport("S003", "NBA Finals", "15/10/2025", "Madison Square Garden", 75, false, Sector.GRANDSTAND);

        TicketManager tm = new TicketManager();
        System.out.println("--- TEST 1: Aggiunta di 10 biglietti al sistema ---");
        tm.addTicket(tc1);
        tm.addTicket(tc2);
        tm.addTicket(tc3);
        tm.addTicket(tt1);
        tm.addTicket(tt2);
        tm.addTicket(tt3);
        tm.addTicket(tt4);
        tm.addTicket(ts1);
        tm.addTicket(ts2);
        tm.addTicket(ts3);

        System.out.println();
        System.out.println("--- TEST 2: Stampa di tutti i biglietti ---");
        tm.printTickets();

        System.out.println();
        System.out.println("--- TEST 3: Vendita di 5 biglietti ---");
        tm.sellTickets(tc3);
        tm.sellTickets(tt1);
        tm.sellTickets(tc1);
        tm.sellTickets(ts1);
        tm.sellTickets(ts3);

        System.out.println();
        System.out.println("--- TEST 4: NBA Finals - Biglietti terminati ---");
        ts3.sellTicket();

        System.out.println();
        System.out.println("--- TEST 5: Lista dei biglietti ancora disponibili ---");
        tm.availableTickets();

        System.out.println();
        System.out.println("--- TEST 6: Calcolo incasso totale ---");
        tm.totalPrice();

        System.out.println();
        System.out.println("--- TEST 7: Biglietti per 'Rock Festival 2025' ---");
        tm.forEvent("Rock Festival 2025");

        System.out.println();
        System.out.println("--- TEST 8: Biglietti ordinati per prezzo crescente ---");
        tm.orderList();

        System.out.println();
        System.out.println("--- TEST 9a: Tutti i biglietti per concerti ---");
        tm.orderByType("CONCERTO");

        System.out.println();
        System.out.println("--- TEST 9b: Tutti i biglietti sportivi ---");
        tm.orderByType("SPORT");

        System.out.println();
        System.out.println("--- TEST 10: Prezzo medio di tutti i biglietti ---");
        tm.getAverage();


        // metodi polimorfici:
        //getEventType() , calculateTicketPrice() , getTicketDescription()

        //metodi ereditati:
        // sellTicket()
    }
}
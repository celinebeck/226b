import java.util.Objects;

 public class Ticket implements AllTickets{
    //attributi
    private String ticketCode;
    private String eventName;
    private String date;
    private String place;
    private int seatNumber;
    private boolean Sold;

    //costruttore


    public Ticket(String ticketCode, String eventName, String date, String place, int seatNumber, boolean sold) {
        this.ticketCode = ticketCode;
        this.eventName = eventName;
        this.date = date;
        this.place = place;
        this.seatNumber = seatNumber;
        Sold = sold;
    }
    //getter  e setter

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSold(boolean sold) {
        Sold = sold;
    }

    //metodi
    public double calculateTicketPrice(){
        return 10;
    }

    public void sellTicket(){
        if(isSold()){
            System.out.println("Sono terminati i biglietti per " + eventName);
        }
        else{
            Sold = true;
            System.out.println("Biglietto " + ticketCode + " per " + eventName + " venduto con successo!");
        }
    }

    public String getEventType(){
        return "GENERICO";
    }

    public boolean isSold(){
        return Sold;
    }

     public String getTicketDescription(){
        return getEventType()+ " - "+ getEventName() + " | " + calculateTicketPrice();
     }
    //metodi base

    @Override
    public String toString() {
        String disp = "";
        if(Sold){disp = "NON DISPONIBILE";}else{disp = "DISPONIBILE";}
        return "Codice: " + ticketCode + " | " +
                "Evento: " + eventName + " | " +
                "Data: " + date + " | " +
                "Luogo: " + place + " | " +
                "Posto: " + seatNumber + " | " +
                "Prezzo: €" + calculateTicketPrice() + " | " +
                "Stato: " + disp;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return seatNumber == ticket.seatNumber && Sold == ticket.Sold && Objects.equals(ticketCode, ticket.ticketCode) && Objects.equals(eventName, ticket.eventName) && Objects.equals(date, ticket.date) && Objects.equals(place, ticket.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketCode, eventName, date, place, seatNumber, Sold);
    }
}

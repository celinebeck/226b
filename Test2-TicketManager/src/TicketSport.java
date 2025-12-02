public class TicketSport extends Ticket {
    //attributi
    private Sector sector;

    //costruttore

    public TicketSport(String ticketCode, String eventName, String date, String place, int seatNumber, boolean sold, Sector sector) {
        super(ticketCode, eventName, date, place, seatNumber, sold);
        this.sector = sector;
    }


    //metodi
    @Override
    public double calculateTicketPrice(){
        if(sector.equals(Sector.CURVE)){
            return 20;
        } else {
            return 40;
        }
    }
    @Override
    public String getEventType(){
        return "SPORT";
    }

    @Override
    public String getTicketDescription(){
        return getEventType()+ " - "+ getEventName() + " | Evento: " + getEventName() + "| Settore: " + sector + "| Posto: " + getSeatNumber() +  " | Prezzo: €" + calculateTicketPrice() ;
    }
    //metodi base
}

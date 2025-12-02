public class TicketConcert extends Ticket {
    //attributi
    private Sector sector;
    private String mainArtist;

    //costruttore

    public TicketConcert(String ticketCode, String eventName, String date, String place, int seatNumber, boolean sold, Sector sector, String mainArtist) {
        super(ticketCode, eventName, date, place, seatNumber, sold);
        this.sector = sector;
        this.mainArtist = mainArtist;
    }

    //metodi
    public String getMainArtist() {
        return mainArtist;
    }
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
            return "CONCERTO";
    }

    @Override
    public String getTicketDescription(){
        return getEventType()+ " - "+ getEventName() + " | Artista: " + getMainArtist() + "| Settore: " + sector + " | Prezzo: €" + calculateTicketPrice() ;
    }

    //metodi base
}

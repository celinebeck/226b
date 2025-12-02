public class TikcetTheater extends Ticket {
    //attributi
    private String showTitle;
    private int row;
    private boolean studentDiscount;

    //costruttore


    public TikcetTheater(String ticketCode, String eventName, String date, String place, int seatNumber, boolean sold, String showTitle, int row, boolean studentDiscount) {
        super(ticketCode, eventName, date, place, seatNumber, sold);
        this.showTitle = showTitle;
        this.row = row;
        this.studentDiscount = studentDiscount;
    }
public String getShowTitle() {
        return showTitle;
}

    //metodi
    @Override
    public double calculateTicketPrice(){
        if (studentDiscount){
            return 30 - 30*0.2;
        }
        else{
            return 30;
        }
    }
    @Override
    public String getEventType(){
        return "TEATRO";
    }

    @Override
    public String getTicketDescription(){
        return getEventType()+ " - "+ getEventName() + " | Spettacolo: " + getShowTitle() + "| Fila: " + row +  " | Prezzo: €" + calculateTicketPrice() ;
    }
    //metodi base
}

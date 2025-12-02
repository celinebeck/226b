import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TicketManager {
    //attributi
    private List<AllTickets> listTickets;
    //costruttore

    public TicketManager() {
        this.listTickets =new ArrayList<AllTickets>() ;
    }

    //metodi
    public void addTicket(AllTickets ticket) {
        this.listTickets.add(ticket);
        System.out.println("Aggiunto biglietto con codice " + ticket.getTicketCode() + " per evento " + ticket.getEventName());
    }

    public void printTickets() {
        listTickets.stream().
                forEach((t) -> System.out.println(t.toString()));
    }

    public void sellTickets(AllTickets ticket) {
        ticket.sellTicket();
    }

    public void availableTickets() {
        System.out.println("Numero di biglietti disponibili: "+listTickets.stream().filter((t) -> t.isSold() == false).count());
        listTickets.stream().
                filter((t) -> !t.isSold()).
                forEach((t) -> System.out.println(t.getTicketDescription()));
    }
    public void totalPrice() {
        double sum = 0;
        for(AllTickets t: listTickets){
            if(t.isSold()){
                sum += t.calculateTicketPrice();
            }
        }
        System.out.println("Incasso totale da biglietti venduti: "+sum);
    }

    public void forEvent(String event){
        listTickets.stream().
                filter(t -> t.getEventName().equals(event)).
                forEach((t) -> System.out.println(t.getTicketDescription()));

    }

    public void orderList(){
        listTickets.stream().
                sorted(Comparator.comparingDouble(AllTickets::calculateTicketPrice)).
                forEach((t) -> System.out.println(t.getTicketDescription()));
    }

    public void orderByType(String type){
        listTickets.stream().
                filter((t )-> t.getEventType() == type).
                forEach(t -> System.out.println(t.getTicketDescription()));

    }

    public void getAverage(){
        System.out.println("Prezzo medio: €"+listTickets.stream().mapToDouble(AllTickets::calculateTicketPrice).average().orElse(0));
    }
}

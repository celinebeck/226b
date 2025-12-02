public interface AllTickets {
    double calculateTicketPrice();
    void sellTicket();
    boolean isSold();
    String getEventType();

    String getTicketCode();
    String getEventName();
    String getTicketDescription();
}

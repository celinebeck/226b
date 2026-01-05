public class Customer {

    private final int itemsCount;
    // durata del servizio in millisecondi
    private final long serviceTimeMillis;
    private final double amount;

    public Customer(int itemsCount, long serviceTimeMillis, double amount) {
        this.itemsCount = itemsCount;
        this.serviceTimeMillis = serviceTimeMillis;
        this.amount = amount;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public long getServiceTimeMillis() {
        return serviceTimeMillis;
    }

    public double getAmount() {
        return amount;
    }
}
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class CashierStatistics {

    private AtomicInteger servedCustomers = new AtomicInteger(0);
    private AtomicInteger totalItems = new AtomicInteger(0);
    private AtomicReference<Double> totalAmount = new AtomicReference<>(0.0);

    public int getServedCustomers() {
        return servedCustomers.get();
    }

    public int getTotalItems() {
        return totalItems.get();
    }

    public double getTotalAmount() {
        return totalAmount.get();
    }

    public void incrementServedCustomers() {
        servedCustomers.incrementAndGet();
    }

    public void addItems(int items) {
        totalItems.addAndGet(items);
    }

    public void addAmount(double amount) {
        totalAmount.accumulateAndGet(amount, Double::sum);
    }
}

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SupermarketSimulator {

    private final ExecutorService executorService;
    private final CashierStatistics statistics = new CashierStatistics();

    public SupermarketSimulator(int numberOfThreads) {
        this.executorService = Executors.newFixedThreadPool(numberOfThreads);
    }

    public CashierStatistics runSimulation(List<Customer> customers) throws InterruptedException {
        for (Customer customer : customers) {
            executorService.submit(() -> serveCustomer(customer));
        }

        executorService.shutdown();
        boolean correctlyTerminated = executorService.awaitTermination(60, TimeUnit.SECONDS);
        if (!correctlyTerminated) {
            System.out.println("A timeout has occurred before all thread termination!");
        }
        return statistics;
    }

    private void serveCustomer(Customer customer) {

        try {
            Thread.sleep(customer.getServiceTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("Error while serving customer " +  customer);
        }

        statistics.incrementServedCustomers();
        statistics.addItems(customer.getItemsCount());
        statistics.addAmount(customer.getAmount());
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SupermarketMain {

    public static final int CUSTOMERS_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {
        List<Customer> customers = generateCustomers();

        SupermarketSimulator simulator = new SupermarketSimulator(10);
        System.out.println("\nLancio la simulazione...");
        CashierStatistics stats = simulator.runSimulation(customers);
        System.out.println("Ho servito 100 clienti: " + customers.size());
        System.out.println("Clienti conteggiati : " + stats.getServedCustomers());

        System.out.println("Totale articoli venduti : " + stats.getTotalItems());
        System.out.println("Somma totale : " + stats.getTotalAmount());
    }

    private static List<Customer> generateCustomers() {
        Random random = new Random();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < CUSTOMERS_COUNT; i++) {
            int item = random.nextInt(1,11);
            long serviceTime = random.nextLong(5, 21); // tra 5 e 20 ms
            double amount = random.nextDouble(100.0);
            customers.add(new Customer(item, serviceTime, amount));
        }
        return customers;
    }

}
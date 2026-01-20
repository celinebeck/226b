import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SupermarketSimulatorTest {

    @Test
    void testAddition() throws InterruptedException {
        // given
        List<Customer> customers = new ArrayList<>();
        SupermarketSimulator simulator = new SupermarketSimulator(20);
        for (int i = 1; i <= 500; i++) {
            customers.add(new Customer(10,20,30));
        }

        // when
        CashierStatistics stats = simulator.runSimulation(customers);

        // then
        Assertions.assertEquals(500, stats.getServedCustomers());
        Assertions.assertEquals(5000, stats.getTotalItems());
        Assertions.assertEquals(15000, stats.getTotalAmount());
    }
}

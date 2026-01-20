import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainWarehouseTest {


    private Warehouse warehouse = new Warehouse();
    private ExecutorService service;

    @BeforeEach
    public void setup() {
        warehouse.populateWarehouse();
        service = Executors.newFixedThreadPool(5);
    }

    @Test
    public void testMainWarehouse1() throws InterruptedException {

        // when
        for (int i = 0; i < 30; i++) {
            service.submit(() -> warehouse.placeOrder(1, 1));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        // then
        Assertions.assertEquals("Penna quantità=0", warehouse.get(1));
    }

    @Test
    public void testMainWarehouse2() throws InterruptedException {

        // when
        for (int i = 0; i < 9; i++) {
            service.submit(() -> warehouse.placeOrder(2, 2));
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        // then
        Assertions.assertEquals("Matita quantità=2", warehouse.get(2));
    }

}

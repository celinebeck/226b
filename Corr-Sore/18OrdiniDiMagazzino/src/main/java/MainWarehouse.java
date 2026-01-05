import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainWarehouse {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        Warehouse warehouse = new Warehouse();
        warehouse.populateWarehouse();

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            service.submit(() -> warehouse.placeOrder(random.nextInt(1, 7), random.nextInt(1, 11)));
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("\nprodotti restanti in magazzino " + warehouse);
    }

}


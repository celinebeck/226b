package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Esercizio15c {
    int thread = 1;
    BankAccount2 account = new BankAccount2();
    ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws InterruptedException {
        Esercizio15c esercizio = new Esercizio15c();
        esercizio.start();
    }

    public void start() throws InterruptedException {
        executor.submit(() -> account.versa(10));
        executor.submit(() -> account.preleva(10));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }

}
class BankAccount2 {
    private AtomicInteger conto = new AtomicInteger(0);

    //aggiungendo synchronized per farlo arrivare a mille
    public void versa(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto.incrementAndGet();
            System.out.println(conto);
        }
    }

    public void preleva(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto.decrementAndGet();
            System.out.println(conto);
        }
    }
    public AtomicInteger getConto() {
        return conto;
    }
}



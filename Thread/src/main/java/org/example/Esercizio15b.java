package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Esercizio15b {
    int thread = 1;
    BankAccount account;
    ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> account.versa()());
        executor.submit(() -> timeCounter());
        executor.shutdown();


}
class BankAccount {
    private AtomicInteger conto = new AtomicInteger(0);

    //aggiungendo synchronized per farlo arrivare a mille
    public void versa(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto.incrementAndGet();
        }
    }

    public void preleva(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto.decrementAndGet();
        }
    }
}
package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Esercizio15b {
    int thread = 1;
    BankAccount account = new BankAccount();
    ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        Esercizio15b esercizio = new Esercizio15b();
        esercizio.start();

    }

    public void start() {
        executor.submit(() -> account.versa(20));
        executor.submit(() -> account.preleva(10));
        executor.shutdown();
    }

}

class BankAccount {
    private int conto = 0;

    //aggiungendo synchronized per farlo arrivare a mille
    public synchronized void versa(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto++;
            System.out.println(conto);
        }
    }

    public synchronized void preleva(int quanto) {
        for (int i = 0; i < quanto; i++) {
            conto--;
            System.out.println(conto);
        }
    }
    public int getConto() {
        return conto;
    }
}
package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Esercizio15a {
    public static void main(String[] args) throws InterruptedException{
        simulateBigFileDwonload();
        timeCounter();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> simulateBigFileDwonload());
        executor.submit(() -> timeCounter());
        executor.shutdown();
    }

    public static void simulateBigFileDwonload()
    {
        System.out.println("Begin");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
    private static void timeCounter()  {
        try {
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("4");
            Thread.sleep(1000);
            System.out.println("5");
            Thread.sleep(1000);
            System.out.println("6");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

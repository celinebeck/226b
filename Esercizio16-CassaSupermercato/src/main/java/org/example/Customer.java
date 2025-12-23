package org.example;

import java.util.Random;

public class Customer {
    private int itemsCount;
    private int serviceTimeMillis;
    private int amount;

    public Customer(int itemsCount, int serviceTimeMillis, int amount) {
        this.itemsCount = itemsCount;
        this.serviceTimeMillis = serviceTimeMillis;
        this.amount = amount;
    }
    public Customer() {
        Random rand = new Random();
        this.itemsCount = rand.nextInt(20) + 1 ;
        this.serviceTimeMillis = rand.nextInt(3000) + 1 ;
        this.amount = rand.nextInt(200) + 1 ;
    }
}

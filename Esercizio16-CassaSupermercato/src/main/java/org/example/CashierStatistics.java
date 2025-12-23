package org.example;

public class CashierStatistics {
    private int servedCustomers;
    private int totalItems;
    private int totalAmount;

    public CashierStatistics(int servedCustomers, int totalItems, int totalAmount) {
        this.servedCustomers = servedCustomers;
        this.totalItems = totalItems;
        this.totalAmount = totalAmount;
    }
}

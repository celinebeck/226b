package ch.samt.restaurant.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RestaurantManager {
    private HashMap<String, MenuItem> menu;
    private HashSet<String> todaysCustomers;
    private HashMap<String, Integer> orderCounts;

    public RestaurantManager() {
        menu = new HashMap<>();
        todaysCustomers = new HashSet<>();
        orderCounts = new HashMap<>();
    }

    public void addToMenu(String dishName, MenuItem item) {
        menu.put(dishName, item);
    }

    public void registerOrder(String customerName, String dishName) {
        if (!menu.containsKey(dishName)) {
            System.out.println("Errore: il piatto '" + dishName + "' non esiste nel menu!");
            return;
        }

        todaysCustomers.add(customerName);

        if (orderCounts.containsKey(dishName)) {
            orderCounts.put(dishName, orderCounts.get(dishName) + 1);
        } else {
            orderCounts.put(dishName, 1);
        }

        System.out.println("Ordine registrato: " + customerName + " - " + dishName);
    }

    public void printDailyStats() {
        System.out.println("\n========== STATISTICHE GIORNALIERE ==========");
        System.out.println("Clienti unici oggi: " + todaysCustomers.size());

        System.out.println("\nClienti:");
        for (String customer : todaysCustomers) {
            System.out.println("  - " + customer);
        }

        // Trova il piatto più ordinato
        String mostPopular = null;
        int maxOrders = 0;
        for (Map.Entry<String, Integer> entry : orderCounts.entrySet()) {
            if (entry.getValue() > maxOrders) {
                maxOrders = entry.getValue();
                mostPopular = entry.getKey();
            }
        }

        if (mostPopular != null) {
            System.out.println("\nPiatto più popolare: " + mostPopular + " (" + maxOrders + " ordini)");
        }

        // Calcola tempo medio di preparazione
        int totalTime = 0;
        int totalOrders = 0;
        for (Map.Entry<String, Integer> entry : orderCounts.entrySet()) {
            MenuItem item = menu.get(entry.getKey());
            totalTime += item.getPreparationTime() * entry.getValue();
            totalOrders += entry.getValue();
        }

        if (totalOrders > 0) {
            double avgTime = (double) totalTime / totalOrders;
            System.out.println("Tempo medio di preparazione: " + String.format("%.2f", avgTime) + " minuti");
        }

        System.out.println("=============================================\n");
    }

    public double calculateTotalRevenue() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : orderCounts.entrySet()) {
            MenuItem item = menu.get(entry.getKey());
            total += item.calculatePrice() * entry.getValue();
        }
        return total;
    }

    public void printMenuWithPrices()   {
        System.out.println("\n=============== MENU DEL RISTORANTE ===============");

        // Polimorfismo: trattiamo tutti gli oggetti come MenuItem
        for (Map.Entry<String, MenuItem> entry : menu.entrySet()) {
            MenuItem item = entry.getValue();  // Polimorfismo!
            System.out.println("\n" + entry.getKey().toUpperCase());
            System.out.println("  " + item.getDescription());
            System.out.println("  Prezzo: €" + String.format("%.2f", item.calculatePrice()));
            System.out.println("  Tempo preparazione: " + item.getPreparationTime() + " min");
        }

        System.out.println("\n===================================================\n");
    }
}
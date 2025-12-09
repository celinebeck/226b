package ch.samt.restaurant;

import ch.samt.restaurant.model.Dessert;
import ch.samt.restaurant.model.Pasta;
import ch.samt.restaurant.model.Pizza;
import ch.samt.restaurant.model.RestaurantManager;
import ch.samt.restaurant.model.MenuItem;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        // Creazione pizze
        ArrayList<String> margheritaToppings = new ArrayList<>();
        margheritaToppings.add("mozzarella");
        margheritaToppings.add("pomodoro");
        margheritaToppings.add("basilico");

        ArrayList<String> quattroStagioniToppings = new ArrayList<>();
        quattroStagioniToppings.add("mozzarella");
        quattroStagioniToppings.add("prosciutto");
        quattroStagioniToppings.add("funghi");
        quattroStagioniToppings.add("carciofi");
        quattroStagioniToppings.add("olive");

        Pizza margherita = new Pizza("Margherita", 6.0, margheritaToppings);
        Pizza quattroStagioni = new Pizza("Quattro Stagioni", 7.0, quattroStagioniToppings);

        // Creazione paste
        Pasta carbonara = new Pasta("Carbonara", 9.0, false);
        Pasta arrabbiata = new Pasta("Arrabbiata", 8.0, true);

        // Creazione dessert
        Dessert tiramisu = new Dessert("Tiramisù", 5.0, false);
        Dessert pannacotta = new Dessert("Panna Cotta", 4.5, true);

        // Aggiunta al menu
        manager.addToMenu("Margherita", margherita);
        manager.addToMenu("Quattro Stagioni", quattroStagioni);
        manager.addToMenu("Carbonara", carbonara);
        manager.addToMenu("Arrabbiata", arrabbiata);
        manager.addToMenu("Tiramisù", tiramisu);
        manager.addToMenu("Panna Cotta", pannacotta);

        // Stampa menu
        manager.printMenuWithPrices();

        // Simulazione ordini
        System.out.println("========== REGISTRAZIONE ORDINI ==========");
        manager.registerOrder("Mario Rossi", "Margherita");
        manager.registerOrder("Luca Bianchi", "Carbonara");
        manager.registerOrder("Anna Verdi", "Quattro Stagioni");
        manager.registerOrder("Giovanni Neri", "Tiramisù");
        manager.registerOrder("Andrea Viola", "Margherita");
        manager.registerOrder("Sofia Arancio", "Carbonara");
        manager.registerOrder("Matteo Verde", "Quattro Stagioni");
        manager.registerOrder("Mario Rossi", "Carbonara");
        System.out.println("==========================================\n");

        // Stampa statistiche
        manager.printDailyStats();

        // Calcola fatturato
        double revenue = manager.calculateTotalRevenue();
        System.out.println("FATTURATO TOTALE: €" + String.format("%.2f", revenue));

    }
}
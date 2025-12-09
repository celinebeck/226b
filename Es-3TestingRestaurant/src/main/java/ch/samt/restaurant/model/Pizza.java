package ch.samt.restaurant.model;

import java.util.List;

public class Pizza implements MenuItem {
    private String name;
    private double basePrice;
    private List<String> toppings;

    public Pizza(String name, double basePrice, List<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (toppings.size() * 1.50);
    }

    @Override
    public String getDescription() {
        StringBuilder desc = new StringBuilder("Pizza " + name + " con: ");
        for (int i = 0; i < toppings.size(); i++) {
            desc.append(toppings.get(i));
            if (i < toppings.size() - 1) {
                desc.append(", ");
            }
        }
        return desc.toString();
    }

    @Override
    public int getPreparationTime() {
        return 15 + (toppings.size() * 2);
    }

    public String getName() {
        return name;
    }
}
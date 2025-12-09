package ch.samt.restaurant.model;

public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        if (isGlutenFree) {
            return price * 1.20;
        }
        return price;
    }

    @Override
    public String getDescription() {
        String desc = "Pasta " + name;
        if (isGlutenFree) {
            desc += " (senza glutine)";
        }
        return desc;
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }

    public String getName() {
        return name;
    }
}
package ch.samt.restaurant.model;

public class Dessert implements MenuItem {
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }

    @Override
    public double calculatePrice() {
        if (hasExtraTopping) {
            return basePrice + 2.0;
        }
        return basePrice;
    }

    @Override
    public String getDescription() {
        String desc = "Dessert " + name;
        if (hasExtraTopping) {
            desc += " con topping extra";
        }
        return desc;
    }

    @Override
    public int getPreparationTime() {
        return 5;
    }

    public String getName() {
        return name;
    }
}
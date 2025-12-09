package ch.samt.restaurant.model;

public interface MenuItem {
    double calculatePrice();
    String getDescription();
    int getPreparationTime();
}
import ch.samt.restaurant.model.Dessert;
import ch.samt.restaurant.model.Pasta;
import ch.samt.restaurant.model.Pizza;
import ch.samt.restaurant.model.RestaurantManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestRestaurantManager {
    RestaurantManager manager = new RestaurantManager();
    @BeforeEach
    public void setUp() {
        ArrayList<String> margheritaToppings = new ArrayList<>();
        margheritaToppings.add("mozzarella");
        margheritaToppings.add("pomodoro");
        margheritaToppings.add("basilico");
        Pizza margherita = new Pizza("Margherita", 6.0, margheritaToppings);
        Pasta carbonara = new Pasta("Carbonara", 9.0, false);
        Dessert tiramisu = new Dessert("Tiramisù", 5.0, false);
        manager.addToMenu("Margherita", margherita);
        manager.addToMenu("Carbonara", carbonara);
        manager.addToMenu("Tiramisù", tiramisu);
    }

    @Test
    public void testCalculateTotalRevenue() {
        //when(manager.calculateTotalRevenue()).thenReturn(24.5);

        manager.registerOrder("Luca", "Margherita");
        manager.registerOrder("Anna", "Carbonara");
        manager.registerOrder("Marco", "Tiramisù");
        double result = manager.calculateTotalRevenue();
        assertEquals(24.5,result);
    }
}

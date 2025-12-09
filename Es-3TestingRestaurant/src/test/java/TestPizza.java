
import ch.samt.restaurant.model.Pizza;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestPizza {
    @Test
    public void testCalculatePrice(){
        ArrayList<String> margheritaToppings = new ArrayList<>();
        margheritaToppings.add("mozzarella");
        margheritaToppings.add("pomodoro");
        margheritaToppings.add("basilico");
        Pizza p = new Pizza("Margherita", 9.0, margheritaToppings);

        //when(p.calculatePrice()).thenReturn(13.5);

        double test = p.calculatePrice();
        assertEquals(13.5,test,0.0001f);
    }

    @Test
    public void testGetDescription(){
        ArrayList<String> margheritaToppings = new ArrayList<>();
        margheritaToppings.add("mozzarella");
        margheritaToppings.add("pomodoro");
        margheritaToppings.add("basilico");
        Pizza p = new Pizza("Margherita", 9.0, margheritaToppings);
        String test = p.getDescription();

        //when(p.getDescription()).thenReturn("Pizza Margherita con: mozzarella, pomodoro, basilico");

        assertEquals("Pizza Margherita con: mozzarella, pomodoro, basilico",test);
    }
}

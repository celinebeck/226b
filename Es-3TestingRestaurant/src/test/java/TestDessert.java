import ch.samt.restaurant.model.Dessert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestDessert {
    @Test
    public void testCalculatePriceNoT(){
        Dessert d = new Dessert("Tiramisù", 5.0, false);
        double test = d.calculatePrice();

        //when(d.calculatePrice()).thenReturn(5.0);

        assertEquals(5.0,test);
    }
    @Test
    public void testCalculatePriceYesT(){
        Dessert d = new Dessert("Tiramisù", 5.0, true);
        double test = d.calculatePrice();

        //when(d.calculatePrice()).thenReturn(7.0);

        assertEquals(7.0,test);
    }

    @Test
    public void testGetDescriptionNoT(){
        Dessert d = new Dessert("Tiramisù", 5.0, false);
        String test = d.getDescription();

        //when(d.getDescription()).thenReturn("Dessert Tiramisù");

        assertEquals("Dessert Tiramisù",test);
    }
    @Test
    public void testGetDescriptionYesT(){
        Dessert d = new Dessert("Tiramisù", 5.0, true);
        String test = d.getDescription();

        //when(d.getDescription()).thenReturn("Dessert Tiramisù con topping extra");

        assertEquals("Dessert Tiramisù con topping extra",test);
    }
}

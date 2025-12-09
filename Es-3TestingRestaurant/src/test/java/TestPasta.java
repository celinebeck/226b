
import ch.samt.restaurant.model.Dessert;
import ch.samt.restaurant.model.Pasta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestPasta {
    @Test
    public void testCalculatePriceNoG(){
        Pasta p = new Pasta("Carbonara", 9.0, false);
        double test = p.calculatePrice();

        //when(p.calculatePrice()).thenReturn(9.0);

        assertEquals(9.0,test,0.0001f);
    }
    @Test
    public void testCalculatePriceYesG(){
        Pasta p = new Pasta("Carbonara", 9.0, true);
        double test = p.calculatePrice();

        //when(p.calculatePrice()).thenReturn(10.8);


        assertEquals(10.8,test,0.0001f);
    }
    @Test
    public void testGetDescriptionNoT(){
        Pasta p = new Pasta("Carbonara", 9.0, false);
        String test = p.getDescription();

        //when(p.getDescription()).thenReturn("Pasta Carbonara");

        assertEquals("Pasta Carbonara",test);
    }
    @Test
    public void testGetDescriptionYesT(){
        Pasta p = new Pasta("Carbonara", 9.0, true);
        String test = p.getDescription();

        //when(p.getDescription()).thenReturn("Pasta Carbonara (senza glutine)");

        assertEquals("Pasta Carbonara (senza glutine)",test);
    }
}

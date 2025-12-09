
import ch.samt.aquaticpark.creatures.HerbivorousFish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHerbivorousFish {
    @Test
    public void testSound(){
        HerbivorousFish h = new HerbivorousFish("h prova", 10, 10, 10);
        String test = h.makeSound();
        assertEquals("Blub blub (pesce erbivoro)",test);
    }
}

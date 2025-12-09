import ch.samt.aquaticpark.creatures.Dolphin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDolphin {
    @Test
    public void testHuntTrue(){
        Dolphin d = new Dolphin("s prova", 10, 100, 100, 100,100);
        boolean test = d.hunt();
        assertEquals(true,test);
    }
    @Test
    public void testHuntFalse(){
        Dolphin d = new Dolphin("s prova", 10, 10, 10, 10,10);
        boolean test = d.hunt();
        assertEquals(false,test);
    }
    @Test
    public void testSound(){
        Dolphin d = new Dolphin("s prova", 10, 100, 100, 100,100);
        String test = d.makeSound();
        assertEquals("Eee-eee-eee (click di delfino)",test);
    }
}

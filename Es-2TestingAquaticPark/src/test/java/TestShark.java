import ch.samt.aquaticpark.creatures.Shark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShark {
    @Test
    public void testHuntTrue(){
        Shark s = new Shark("s prova", 10, 100, 100, 100);
        boolean test = s.hunt();
        assertEquals(true,test);
    }
    @Test
    public void testHuntFalse(){
        Shark s = new Shark("s prova", 10, 10, 10, 10);
        boolean test = s.hunt();
        assertEquals(false,test);
    }
    @Test
    public void testSound(){
        Shark s = new Shark("s prova", 10, 10, 10, 10);
        String test = s.makeSound();
        assertEquals("Dun-dun... dun-dun... (musica di squalo)",test);
    }
}

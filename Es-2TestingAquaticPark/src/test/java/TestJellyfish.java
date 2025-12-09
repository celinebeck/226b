
import ch.samt.aquaticpark.creatures.Jellyfish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJellyfish {
    @Test
    public void testSound(){
        Jellyfish j = new Jellyfish("j prova", 10, 100, 100, true);
        String test = j.makeSound();
        assertEquals("... (silenzio di medusa)",test);
    }
}

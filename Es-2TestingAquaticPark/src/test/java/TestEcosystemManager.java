import ch.samt.aquaticpark.creatures.Dolphin;
import ch.samt.aquaticpark.creatures.HerbivorousFish;
import ch.samt.aquaticpark.creatures.MarineCreature;
import ch.samt.aquaticpark.creatures.Shark;
import ch.samt.aquaticpark.ecosystem.EcosystemManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class TestEcosystemManager {
    EcosystemManager manager = new EcosystemManager();


    @BeforeEach
    public void setUp() {
        HerbivorousFish nemo = new HerbivorousFish("Nemo", 2, 30.0, 25.0);
        Shark jaws = new Shark("Jaws", 8, 50.0, 60.0, 60.0);
        Dolphin flipper = new Dolphin("Flipper", 5, 55.0, 50.0, 75.0, 85);
        manager.addCreature(nemo);
        manager.addCreature(jaws);
        manager.addCreature(flipper);
    }

    @Test
    public void testFilterByEnergy() {
        List<MarineCreature> resultList = manager.filterByEnergy(50);
        List<MarineCreature> expected = List.of(new Shark("Jaws", 8, 50.0, 60.0, 60.0),
                                        new Dolphin("Flipper", 5, 55.0, 50.0, 75.0, 85));
        Assertions.assertEquals(expected, resultList);
    }

    @Test
    public void testGetAdultCreaturesNames() {
        List<String> resultList = manager.getAdultCreaturesNames(5);
        List<String> expected = List.of("Jaws", "Flipper");
        Assertions.assertEquals(expected, resultList);
    }

    @Test
    public void testFindMostDangerousPredators() {
        List<String> resultList = manager.findMostDangerousPredators();
        List<String> expected = List.of("Flipper");
        Assertions.assertEquals(expected, resultList);
    }
}

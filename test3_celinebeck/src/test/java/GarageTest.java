import org.example.Car;
import org.example.Garage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

public class GarageTest {
    AtomicBoolean t = new AtomicBoolean(true);
    AtomicBoolean f = new AtomicBoolean(false);
    Garage garage = new Garage();
    Car car1 = new Car("car1",t);
    Car car2 = new Car("car2",f);
    Car car3 = new Car("car3",f);
    Car car4 = new Car("car4",f);
    Car car5 = new Car("car5",f);
    Car car6 = new Car("car6",f);
    Car car7 = new Car("car7",f);
    Car car8 = new Car("car8",f);
    Car car9 = new Car("car9",f);
    Car car10 = new Car("car10",f);
    Car car11 = new Car("car11",f);
    @Test
    public void testAddEmpty() throws InterruptedException {

        // when
        boolean actual = garage.add(car1);

        // then
        Assertions.assertEquals(true,actual);
    }
    @Test
    public void testAddFull() throws InterruptedException {

        // when
        garage.add(car1);
        garage.add(car2);
        garage.add(car3);
        garage.add(car4);
        garage.add(car5);
        garage.add(car6);
        garage.add(car7);
        garage.add(car8);
        garage.add(car9);
        garage.add(car10);
        boolean actual = garage.add(car11);

        // then
        Assertions.assertEquals(false,actual);
    }
    @Test
    public void testRemove() throws InterruptedException {

        // when
        boolean actual = garage.add(car1);

        // then
        Assertions.assertEquals(true,actual);
    }
}

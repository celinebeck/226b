package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Garage {
    private List<Car> garages;
    private AtomicInteger space;
    public Garage() {
        garages = new ArrayList<Car>();
        space = new AtomicInteger(10);
    }
    public boolean add(Car car) {
        if(space.get() > 0) {
            if(car.getParked().get()){
                space.decrementAndGet();
                garages.add(car);
                return true;
            }
            else {
                garages.add(car);
                car.setParked();
                //tolgo un posto a space
                space.decrementAndGet();
                System.out.println("L'auto " + car.getName() + " parcheggia in garage, posti liberi " + space);
                return true;
            }
        }
        else {
            System.out.println("L'auto " + car.getName() + " vorrebbe parcheggiare ma il garage è completamente occupato!");
            return false;
        }
    }
    public void remove(Car car) {
        //aumento un posto a space
        space.incrementAndGet();
        garages.remove(car);
        car.unpark();
        System.out.println("L'auto " + car.getName() + " esce dal garage, posti liberi " + space);
    }

    public synchronized void getParkedCars() {
        for (Car car : garages) {
            System.out.println(car.getName());
        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        AtomicBoolean t = new AtomicBoolean(true);
        AtomicBoolean f = new AtomicBoolean(false);
        //creazione macchine
        Car car1 = new Car("car1",f);
        Car car2 = new Car("car2",f);
        Car car3 = new Car("car3",t);
        Car car4 = new Car("car4",f);
        Car car5 = new Car("car5",f);
        Car car6 = new Car("car6",t);
        Car car7 = new Car("car7",f);
        Car car8 = new Car("car8",f);
        Car car9 = new Car("car9",t);
        Car car10 = new Car("car10",f);
        Car car11 = new Car("car11",f);
        Car car12 = new Car("car12",t);
        Car car13 = new Car("car13",f);
        Car car14 = new Car("car14",f);
        Car car15 = new Car("car15",t);
        Car car16 = new Car("car16",f);
        Car car17 = new Car("car17",f);
        Car car18 = new Car("car18",t);
        Car car19 = new Car("car19",f);
        Car car20 = new Car("car20",f);
        //lista macchine
        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);
        cars.add(car16);
        cars.add(car17);
        cars.add(car18);
        cars.add(car19);
        cars.add(car20);
        //inizio
        Garage garage = new Garage();
        System.out.println("=== PARKING SIMULATOR SYSTEM ===");
        System.out.println("Le auto che all'inizio sono parcheggiate in garage sono:");
        garage.add(car3);
        garage.add(car6);
        garage.add(car9);
        garage.add(car12);
        garage.add(car15);
        garage.add(car18);
        garage.getParkedCars();
        //thread
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 3; i++) {
            for (Car car : cars) {
                if(car.getParked().get()){
                    service.submit(() -> garage.remove(car));
                }
                else {
                    service.submit(() -> garage.add(car));
                }
            }
        }
        //shutdown
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Le auto che al termine sono parcheggiate in garage sono:");
        garage.getParkedCars();
    }
}
package org.example;

import java.util.concurrent.atomic.AtomicBoolean;

public class Car {
    private String name;
    private AtomicBoolean parked;

    public Car(String name, AtomicBoolean parked) {
        this.name = name;
        this.parked = parked;
    }
    public void setParked(){
        parked.set(true);
    }
    public void unpark(){
        parked.set(false);
    }
    public String getName() {
        return name;
    }
    public AtomicBoolean getParked() {
        return parked;
    }
}

package main.fourwheels;
import main.interfaces.VeicoloElettrico;

import  java.lang.Thread;

public abstract class AutoElettrica extends Auto implements VeicoloElettrico {
    private int AutonomiaBatteria;

    public double getAutonomiaBatteria() {
        return AutonomiaBatteria;
    }

    public void ricarica(int autonomiaBatteria) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AutonomiaBatteria = autonomiaBatteria;
    }
}

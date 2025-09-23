import java.util.Objects;

public class Auto {
    //attributi
    private String model;
    private boolean statusMotion;
    private boolean statusStationary;
    private int km;
    private Fuel fuel;

    //costruttori

    public Auto(String model, boolean statusMotion, boolean statusStationary, int km, Fuel fuel) {
        this.model = model;
        this.statusMotion = statusMotion;
        this.statusStationary = statusStationary;
        this.km = km;
        this.fuel = fuel;
    }
    //getter e setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String isStatusMotion() {
        if (statusMotion) {
            return "Status: Vehicle is in motion.";
        }
        else {
            return "Status: Vehicle is not in motion.";
        }
    }

    public void setStatusMotion(boolean statusMotion) {
        this.statusMotion = statusMotion;
    }

    public String isStatusStationary() {
        if (statusStationary) {
            return "Status: Vehicle is stationary.";
        }
        else {
            return "Status: Vehicle is not stationary.";
        }
    }

    public void setStatusStationary(boolean statusStationary) {
        this.statusStationary = statusStationary;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
    //metodi

    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return statusMotion == auto.statusMotion && statusStationary == auto.statusStationary && Objects.equals(model, auto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, statusMotion, statusStationary);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", statusMotion=" + statusMotion +
                ", statusStationary=" + statusStationary +
                ", km=" + km +
                ", fuel=" + fuel +
                '}';
    }
}

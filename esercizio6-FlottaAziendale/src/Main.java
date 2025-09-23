import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda Civic", true, true, 300, Fuel.DIESEL );
        Truck truck = new Truck("Volvo FH16", true, true, 120, Fuel.DIESEL );
        Van van = new Van("Tesla Model S", false, false, 520, Fuel.ELETRIC );
        HashSet<Vehicle> vehicles = new HashSet<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(van);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.costFuel());
        }
        // for (Vehicle vehicle : vehicles) {
        //   System.out.println(vehicle);
        //}

    }
}
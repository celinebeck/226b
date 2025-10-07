import java.util.ArrayList;
import java.util.Objects;

public class Pizza implements MenuItem {
    //attributi
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;
    //costruttore

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }
    public String getName() {
        return name;
    }
    //metodi
    public double calculatePrice(){
        return 1.2*basePrice;
    }
    public String getDescription(){
        return this.name.toUpperCase()+"\n"+
                "Pizza "+this.name+" con: "+ this.toppings.toString()+"\n"+
                "Prezzo: €"+ calculatePrice()+"\n"+
                "Tempo preparazione: "+ getPreparationTime() + " min"+"\n";
    }
    public int getPreparationTime(){
        return 25;
    }
    //metodi base


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Double.compare(basePrice, pizza.basePrice) == 0 && Objects.equals(name, pizza.name) && Objects.equals(toppings, pizza.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, toppings);
    }
}

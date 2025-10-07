import java.util.Objects;

public class Dessert implements MenuItem {
    //attributi
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;
    //costruttore

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
    }
    public String getName() {
        return name;
    }
    //metodi
    public double calculatePrice(){
        return 1.5*basePrice;
    }
    public String getDescription(){
        String topping = "";
        if (hasExtraTopping){
            topping = " con topping extra";
        }
        return this.name.toUpperCase()+"\n"+
                "Dessert "+this.name+topping+"\n"+
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
        Dessert dessert = (Dessert) o;
        return Double.compare(basePrice, dessert.basePrice) == 0 && hasExtraTopping == dessert.hasExtraTopping && Objects.equals(name, dessert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, hasExtraTopping);
    }
}

import java.util.Objects;

public class Pasta implements MenuItem {
    //attributi
    private String name;
    private Double price;
    private boolean isGlutenFree;
    //costruttore

    public Pasta(String name, Double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }
    public String getName() {
        return name;
    }
    //metodi
    public double calculatePrice(){
        return price;
    }
    public String getDescription(){
        String gluten="";
        if(isGlutenFree){
            gluten = " (senza glutine)";
        }
        return this.name.toUpperCase()+"\n"+
                "Pasta "+this.name+gluten+"\n"+
                "Prezzo: €"+ calculatePrice()+"\n"+
                "Tempo preparazione: "+ getPreparationTime() + " min"+"\n";
    }
    public int getPreparationTime(){
        return 12;
    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pasta pasta = (Pasta) o;
        return isGlutenFree == pasta.isGlutenFree && Objects.equals(name, pasta.name) && Objects.equals(price, pasta.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, isGlutenFree);
    }
}

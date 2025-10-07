import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> toppings1 = new ArrayList<>();
        toppings1.add("Mozzarella");
        toppings1.add("pomodoro");
        toppings1.add("Basilico");
        ArrayList<String> toppings2 = new ArrayList<>();
        toppings2.add("Mozzarella");
        toppings2.add("prosciutto");
        toppings2.add("funghi");
        toppings2.add("pepperoni");
        Pizza p1 = new Pizza ("Margherita",9, toppings1 );
        Pizza p2 = new Pizza ("Quattro stagioni",13, toppings2 );

        Pasta pa1 = new Pasta("Arrabbiata", 9.60, true);
        Pasta pa2 = new Pasta("Carbonara", 9.0, false);

        Dessert d1 = new Dessert ("Panna Cotta", 5, true);
        Dessert d2 = new Dessert ("Tiramisu", 4, false);
        RestaurantManager menu = new RestaurantManager();
        menu.addMenuItem(p1);
        menu.addMenuItem(p2);
        menu.addMenuItem(pa1);
        menu.addMenuItem(pa2);
        menu.addMenuItem(d1);
        menu.addMenuItem(d2);

        menu.addOrdini("Mario Rossi", p1);
        menu.addOrdini("Luca Bianchi", pa2);
        menu.addOrdini("Anna Verdi", p2);
        menu.addOrdini("Giovanni Neri", d2);
        menu.addOrdini("Andrea Viola", p1);
        menu.addOrdini("Sofia Arancio", pa2);
        menu.addOrdini("Matteo Verde", p2);
        menu.addOrdini("Mario Rossi", pa2);

        menu.printMenu();
        System.out.println();
        menu.printOrdini();
        System.out.println();
        menu.printStatics();
    }

}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RestaurantManager {
    //attributi
    private HashSet<MenuItem> menu;
    private HashMap<String, MenuItem> ordini;
    //costruttore
    public RestaurantManager() {
        menu = new HashSet<>();
        ordini = new HashMap<>();
    }
    //metodi
    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }
    public void printMenu() {
        System.out.println("=============== MENU DEL RISTORANTE ===============");
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem.getDescription());
        }
    }
    public void addOrdini(String nome,MenuItem menuItem) {
        ordini.put(nome,menuItem);
    }
    public void printOrdini() {
        System.out.println("========== REGISTRAZIONE ORDINI ==========");
        for (Map.Entry<String, MenuItem> ordine : ordini.entrySet()) {
            System.out.println("Ordine registrato: "+ordine.getKey()+" - "+ ordine.getValue().getName());
        }
    }
    public void printStatics(){
        int numClienti = ordini.size();
        double totMedia = 0;
        double fatture = 0;
        for (MenuItem ordine : ordini.values()) {
            totMedia += ordine.getPreparationTime();
            fatture += ordine.calculatePrice();
        }
        totMedia = totMedia/numClienti;
        System.out.println("========== STATISTICHE GIORNALIERE ==========");
        System.out.println("Clienti unici oggi: "+numClienti);
        System.out.println("\nClienti:");
        for (String cliente : ordini.keySet()) {
            System.out.println("- "+cliente);
        }
        printPopular();
        System.out.println("Tempo medio di preparazione: "+totMedia+" minuti");
        System.out.println("=============================================");
        System.out.println("FATTURATO TOTALE: €"+fatture);

    }
    public void printPopular() {
        HashMap<String, Integer> popular = new HashMap<>();
        for (Map.Entry<String, MenuItem> ordine : ordini.entrySet()) {
            String nome = ordine.getValue().getName();
            popular.put(nome, popular.getOrDefault(nome, 0) + 1);
        }
        int max = 0;
        String piattoPiuPopolare = "";
        for (Map.Entry<String, Integer> entry : popular.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                piattoPiuPopolare = entry.getKey();
            }
        }
        System.out.println("\nPiatto più popolare: " + piattoPiuPopolare + " (" + max + " ordini)");
    }
    //metodi base

}

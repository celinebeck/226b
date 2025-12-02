import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Sale> sales = List.of(
                new Sale("Laptop", "Elettronica", 1200, 2, "Alice"),
                new Sale("Cuffie", "Elettronica", 100, 5, "Bob"),
                new Sale("Libro Java", "Libri", 25, 8, "Alice"),
                new Sale("Mouse", "Elettronica", 40, 6, "Carla"),
                new Sale("Monitor", "Elettronica", 300, 3, "David"),
                new Sale("Tastiera", "Elettronica", 50, 4, "Bob"),
                new Sale("Zaino", "Accessori", 60, 3, "Alice"),
                new Sale("Romanzo", "Libri", 18, 12, "Elena"),
                new Sale("Smartphone", "Elettronica", 800, 1, "Carla"),
                new Sale("Agenda", "Cartoleria", 15, 10, "David"),
                new Sale("Penna", "Cartoleria", 2, 50, "Bob"),
                new Sale("Router WiFi", "Elettronica", 90, 5, "Alice")
        );
        System.out.println("=== 1.\tStampare tutte le vendite con valore totale > 500:");
        sales.stream().
                filter(sale -> sale.tot()>500).
                forEach((sale )-> System.out.println(sale.toString()));
        System.out.println();
        System.out.println("=== 2.\tOrdinare la lista delle vendite in base al valore totale:");
        sales.stream()
                .sorted(Comparator.comparingDouble(Sale::tot).reversed())
                .forEach((sale )-> System.out.println(sale.toString()));
        System.out.println();
        System.out.println("=== 3.\tOrdine alfabetico per nome prodotto:");
        sales.stream().
                sorted(Comparator.comparing(Sale::getProduct).reversed())
                .forEach((sale )-> System.out.println(sale.toString()));
        System.out.println();
        System.out.println("=== 4. Prodotti unici venduti da Alice:");
        sales.stream()
                .filter(sale -> sale.getSeller().equals("Alice") )
                .forEach((sale )-> System.out.println(sale.getProduct()));
        System.out.println();
        System.out.println("=== 5. Valore medio di vendita per la categoria Elettronica:");
        System.out.println("Media: "+sales.stream()
                .filter(sale -> sale.getCategory().equals("Elettronica"))
                .mapToDouble(Sale::tot)
                .average().orElse(0));
        System.out.println();
        System.out.println("=== 6. Totale incassato per venditore:");
        sales.stream()
                .collect(Collectors.groupingBy(Sale::getSeller, Collectors.summingDouble(Sale::tot)))
                .forEach((seller , sum)-> System.out.println());
    }
}
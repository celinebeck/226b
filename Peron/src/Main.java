import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Set<Persona> persone = new HashSet<>();
            Persona p1 = new Persona("mario", "rossi", 40);
            Persona p2 = new Persona("mario", "rossi", 40);
            persone.add(p1);
            System.out.println(persone.contains(p1));
            System.out.println(persone.contains(p2));
        }
    }

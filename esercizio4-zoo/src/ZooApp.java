import zoo.Elephant;
import zoo.Lion;
import zoo.Parrot;

public class ZooApp {
    public static void main(String[] args) {
        Lion l1 = new Lion("Leo1",5,true);
        Lion l2 = new Lion("Leo2",3,true);

        Elephant e1 = new Elephant("Ele1",2,false);
        Elephant e2 = new Elephant("Ele2",4,false);

        Parrot p1 = new Parrot("Par1",1,false);
        Parrot p2 = new Parrot("Par2",3,false);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(l1.makeSound());
        System.out.println(l2.makeSound());
        System.out.println(e1.makeSound());
        System.out.println(e2.makeSound());
        System.out.println(p1.makeSound());
        System.out.println(p2.makeSound());

        l1.eat("Grass");
        l2.eat("Carrot");
        e1.eat("Apple");
        e2.eat("Grass");
        p1.eat("Banana");
        p2.eat("Grass");
        }
    }

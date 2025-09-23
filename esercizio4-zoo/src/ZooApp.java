import zoo.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Lion l1 = new Lion("Leo1",5,true);
        Lion l2 = new Lion("Leo2",3,true);

        Elephant e1 = new Elephant("Ele1",2,false);
        Elephant e2 = new Elephant("Ele2",4,false);

        Parrot p1 = new Parrot("Par1",1,false);
        Parrot p2 = new Parrot("Par2",3,false);
        List<Feedable> animals = new ArrayList<>();

        animals.add(l1);
        animals.add(l2);
        animals.add(e1);
        animals.add(e2);
        animals.add(p1);
        animals.add(p2);

        for (Feedable a : animals) {
            a.eat("cibo");
        }


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

        }
    }

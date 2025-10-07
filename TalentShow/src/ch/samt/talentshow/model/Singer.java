package ch.samt.talentshow.model;
import ch.samt.talentshow.Show;
import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

public class Singer extends Person implements Show {
    //costruttore

    public Singer(String name, int age, Level level, String showName) {
        super(name, age, Category.SINGER, level, showName);
    }
    //metodi
    public void descriptionShow(){
        System.out.println(super.getName()+" "+super.getAge()+" anni, sale sul palco.");
        System.out.println(super.getName()+ " canta '"+ super.getShowName()+"'.");
        System.out.println(super.getName()+" ("+super.getCategory()+", "+super.getLevel()+")-> Punteggio: "+ finalVote());
        System.out.println("-----------");
    }
    public float finalVote(){
        if(super.getLevel() == Level.BEGINNER){
            return 7f;
        }
        else if(super.getLevel() == Level.INTERMEDIATE){
            return 8f;
        }
        else{
            return 9.5f;
        }
    }

}

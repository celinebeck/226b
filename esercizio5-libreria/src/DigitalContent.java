
public abstract class DigitalContent implements Purchasable {
    //attributi
    private int id;
    private String title;
    private String author;
    private float basePrice;
    private float currentDiscount;
    //costruttore

    public DigitalContent(int id, String title, String author, float basePrice, float currentDiscount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.basePrice = basePrice;
        this.currentDiscount = currentDiscount;
    }

    //metodi
    public abstract String DigitalContent();
    public abstract String getDescription();
    public float calculatePrice(){
        if(currentDiscount > 0){
            return basePrice * currentDiscount;
        }
        else {
            return basePrice;
        }
    }
    public void applyDiscount(double percentage){
        System.out.println(currentDiscount -= percentage);
    }
    //metodi base

}

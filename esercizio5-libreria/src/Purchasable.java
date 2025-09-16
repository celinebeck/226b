public interface Purchasable {
    float calculatePrice();
    void applyDiscount(double percentage);
    static float getDefaultTaxRate(){
        return 0.22f;
    }
    default float getPriceWithTax(){
        return calculatePrice()* getDefaultTaxRate();
    }
}

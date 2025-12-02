public class Sale {
    //attributi
    private String product;
    private String category;
    private double price;
    private int quantity;
    private String seller;

    //costruttore

    public Sale(String product, String category, double price, int quantity, String seller) {
        this.product = product;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.seller = seller;
    }

    //setter e getter


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Double tot(){
        return price * quantity;
    }
    @Override
    public String toString() {
        return "Prodotto: " + product + " | Categoria: " + category + " | Prezzo: " + price + " | Q.ta: " + quantity + " | Venditore: " + seller+ " | Totale"+ this.tot();
    }
}

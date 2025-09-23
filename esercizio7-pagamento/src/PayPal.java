public class PayPal implements PaymentMethod {
    //attributi
    private String email;
    //costruttore

    public PayPal(String email) {
        this.email = email;
    }

    //metodi
    public void executePayment(double amount){
        double price = (amount * 0.025)+ amount;
        System.out.println("- " + price);
    }
    //metodi base
}

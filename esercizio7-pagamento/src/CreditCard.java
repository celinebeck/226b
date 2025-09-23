public class CreditCard implements PaymentMethod {
    //attributi
    private int cardNumber;
    //costruttore

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    //metodi
    public void executePayment(double amount){
        double price = (amount * 0.025)+ amount;
        System.out.println("- " + price);
    }
    //metodi base
}

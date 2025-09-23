public class PaymentProcessor {
    public void processTransaction(PaymentMethod paymentMethod, double amount){
        paymentMethod.executePayment(amount);
    }
}

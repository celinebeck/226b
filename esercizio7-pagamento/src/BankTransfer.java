public class BankTransfer implements PaymentMethod {
    //attributi
    private String iban;
    //costruttore

    public BankTransfer(String iban) {
        this.iban = iban;
    }

    //metodi
    public void executePayment(double amount){
        System.out.println("- " + amount);
    }
    //metodi base
}

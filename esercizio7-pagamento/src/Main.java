//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            CreditCard cc = new CreditCard(543895624);
            PayPal pp = new PayPal("aaaaaa@aaa.aaa");
            BankTransfer bt = new BankTransfer("bbbbbbbbbb");
            PaymentProcessor pps = new PaymentProcessor();
            pps.processTransaction(cc, 200);
            pps.processTransaction(pp, 370);
            pps.processTransaction(bt, 6660);
        }
    }

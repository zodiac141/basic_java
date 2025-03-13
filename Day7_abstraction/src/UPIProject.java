interface UPIPayment {
     void UPItransfer();
}

interface CreditCardPayment {
     void creditCardPayment();
}
class PaymentGateway implements UPIPayment, CreditCardPayment {
     public void UPItransfer() {
          System.out.println("UPI Transfer successful");
     }
     public void creditCardPayment() {
          System.out.println("Credit Card Payment successful");
     }
}

public class UPIProject {
     public static void main(String[] args) {
          PaymentGateway gateway = new PaymentGateway();
          gateway.UPItransfer();
          gateway.creditCardPayment();
     }

}

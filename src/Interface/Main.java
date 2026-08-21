package Interface;

public class Main {

    public static void main(String[] args){

        //creating payment service obj
        PaymentService service = new PaymentService();

        //Reference type = Payment interface
        //Actual object = UPI
        Payment pay1 = new UPI();


        //Payment service accepts it because upi implementsss payment
        service.processPaymen(pay1, 1000);

        Payment pay2 = new CreditCard();

        service.processPaymen(pay2, 2000);


    }
}

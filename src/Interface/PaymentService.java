package Interface;

//Payement service does not depend on upi creditcard or debit card

// it depends only onthe payment interface
public class PaymentService {

    //This method accepts any obj that implements interface
    public void processPaymen(Payment payment, double amount){

        //we dont care which actual payment obj it is
        //we only know that every payement obj must have a pay() method
        payment.pay(amount);
    }
}


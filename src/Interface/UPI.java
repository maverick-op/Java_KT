package Interface;

public class UPI implements Payment{

    // Override means we are implementing/overriding
    @Override
    public void pay(double amount){
        System.out.println("Paid  " + amount + "Using UPI");
    }
}

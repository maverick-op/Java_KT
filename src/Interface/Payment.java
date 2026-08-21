package Interface;

//Interface represent a common contract

//Itsays any payment method that implements payment must have pay() method

public interface Payment {

    //we dont write implementatio here ->abstraction
    //Each payment class will provide its own implemenation
    void pay(double amount);


}

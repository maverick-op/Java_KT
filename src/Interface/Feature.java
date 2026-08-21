package Interface;
// Java 8 Feature

interface Animal{

    // Abstract method
    void sound();

    //Default method introduced in java 8
    //classes implementing this interface are not required to implement this method
    //They automatiocally inherit this implementation
    //but they can override it if they want
    default void sleep(){
        System.out.println("Animalis sleeping");
    }


    //Static method introduced in java 8
    //They are called using Interfacename.methodname()
    //They are not inherited by implementing classes
    static void information(){
        System.out.println("Animals are living");
    }
}

interface Flyable{
    void fly();
}
public class Feature implements Animal,Flyable {

    //It is providing its own implementation
    @Override
    public void sound(){

        System.out.println("Dog barks");
    }


    @Override
    public void fly(){
        System.out.println("Eagle fly");
    }

    @Override
    public void sleep(){

        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args){

        Animal animal = new Feature();
        
        animal.sound();

        animal.sleep();

        Animal.information();
    }
}

package Interface.FunctionalInterface;

@FunctionalInterface
public interface Functional {

    //This is the Single abstract method
    // A Lambda exp will provide the implementation of this method]
    int compare(Employee e1, Employee e2);

    //Functional interface can have default methods
    default void printMessage(){

        System.out.println("Sorting employees......");
    }

    //Functional interface can hve static methods
    static void info(){
        System.out.println("Employee sorting utiltiy.....");
    }
}

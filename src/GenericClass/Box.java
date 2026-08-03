package GenericClass;

public class Box<T> {    // Here T is a type parameter
    T value;

    void setValue(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }

    public static void main(String args[]){

    Box<Integer> b1 = new Box<>();         //same class with different types:
    b1.setValue(10);

    Box<String> b2 = new Box<>();
    b2.setValue("Hello");

    System.out.print(b1.getValue());
    System.out.print(b2.getValue());  // Without Generic You need explicit casting.

    //Without generics, you might use Object:
}


}

package NestedClass;

public class NonStatic { // outer class

    int x = 10;

    class Inner{
        void Display()
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        NonStatic outer = new NonStatic();

        NonStatic.Inner inner = outer.new Inner();  //A non-static inner class requires an object of the outer class.
        
        inner.Display();
    }

}

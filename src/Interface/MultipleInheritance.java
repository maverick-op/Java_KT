package Interface;

interface A{
    void methodA();
}
interface B{
    void methodB();
}

public class MultipleInheritance implements A,B {

    @Override
    public void methodA(){
        System.out.println("Inside A ");
    }

    @Override
    public void methodB(){
        System.out.println("Inside B");
    }

    public static void main(String[] args){
        MultipleInheritance obj = new MultipleInheritance();

        obj.methodA();
        obj.methodB();
    }
}

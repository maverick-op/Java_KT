package ExceptionHandling.UncheckedException;

public class Main {
    public static void main(String[] args){

        // Null Pointer Exception

        try{
            String name = null;

            System.out.println(name.length());
        }catch(NullPointerException e){

            System.out.println(("Null pointer Exception"));
        }

        // Airthmetic Exception

        try{
            int a =10;
            int b = 0;

            int ans = a/b;
        }
        catch(ArithmeticException e){

            System.out.println("Airthmetic exception");
        }

        //Array index out of bond 

        try{

            int[] a = {10,20,30};

            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array index out of bound");
        }

        //Number format exception

        try {

            int x = Integer.parseInt("abc");

        }
        catch(NumberFormatException e){

            System.out.println("Number format exception");
        }
    }
}

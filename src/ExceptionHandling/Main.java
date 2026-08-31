package ExceptionHandling;

import java.io.IOException;

public class Main {

    static void Example(){

        try{

            int ans = 10/0;

            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println(" try Exception handled");
        }
        finally{

            //finally executes after try catch
            //It is generally used for cleanup
            System.out.println("Finally exeduted");
        }

        System.out.println("Program continues.......");
    }

    // Throws

    static void readFile() throws IOException{
        //Io exception is a checked exception
        //Instead of handling it here using try catch 

        //This method may throw IO Exception

        throw new IOException("Unable to read file");
    }

    public static void main(String[] args){

        System.out.println("Try catch finally example");

        Example();

        System.out.println("Throws");

        try{
            //readfile() ddeclare
            //throws IOException
            //Therefore caller must handle it because IOexception is checked

            readFile();
        }
        catch(IOException e){
            System.out.println("IO Exception is handled in main");
            System.out.println(e.getMessage());
        }
    }
}

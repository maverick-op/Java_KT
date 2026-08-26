package ExceptionHandling.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args){

        // IO Exception

        try{

            /*
                    File reader is used to read a file
                    The file may not exist or may not be accessible

                    FileReader can throw File not found Exception
                    which is a checked Exception
             */

                    FileReader reader = new FileReader("data.txt");
                    System.out.println("File opened Successfully");
        }
        catch(IOException e){
            System.out.println("IO Exception / File error");
        }

        // FilenotFound Exception

        try{
            //File probably does not exist
            //File not found exception is a subclass of IOException

            FileInputStream file = new FileInputStream("data.txt");

            file.close();
        }
        catch(FileNotFoundException e){

            System.out.println("FilenotFound Exception");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }

        //Class not found exception

        try{

            /*
                Java tries to find this class at runtime

                if the class doesn't exist
                ClassNotFoundException is thrown

            */
           Class.forName("com.example");
        }
        catch(ClassNotFoundException e){

            System.out.println("Class not found Exception");
        }

        //Parse Exception

        try{

            // we are trying to convert a string into date
            //if the string doesn't match the expected format ParseException is thrown

            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

            format.parse("invalid-date");
        }
        catch(ParseException e){

            System.out.println("ParseException.");
        }

        //SQL Exception

        try{

            //This is an example of database code
            //JDBC methods can throw SQLException

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", null, null);
            
            connection.close();
        }
        catch(SQLException e){

            System.out.println("SQL Exception");
        }
    }
}

package Collection.Comparator;
import java.util.*;

public class Main{

    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Sahil", 24, 50000));
        employees.add(new Employee("Pratyush", 25, 5000));
        employees.add(new Employee("Ankoit", 20, 560000));
        employees.add(new Employee("Arun", 40, 350000));

        //Comparable

        //Employee implements Comparable
        //Therefore Java knows the natural ordering, salary ascending

        Collections.sort(employees);
        System.out.println("Natural ordering");

        for(Employee e: employees){
            System.out.println(e);
        }



        //Comparator
        //Now suppose we dont want salary sorting
        //we want age ascending
        //we can create a Comparator externally

        Comparator<Employee> ageComparator = (e1,e2) -> Integer.compare(e1.age, e2.age);

        //Sort using Comparator
        employees.sort(ageComparator);

        System.out.println("Sorted by age using comparator");

        for(Employee e: employees){
            System.out.println(e);
        }

    }
    
}

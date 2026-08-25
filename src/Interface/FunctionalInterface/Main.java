package Interface.FunctionalInterface;

import java.util.*;

public class Main {

    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Pratyush", 24, 50000));
        employees.add(new Employee("Rahul", 21, 35000));
        employees.add(new Employee("Sahil", 20, 20000));
        employees.add(new Employee("ankit", 29, 75000));


        /*
                Functional is a fumctional interface
                Is only abstract method is 
                int compare(Employee e1, Employee e2)

                so this lambda
                (e1,e2) -> e2.salary - e1.salary
                is automatically treated as the implementaaion of compare().

                we dont need to write

                new Functional(){
                @override
                public int compare(Employee e1, Employee e2){
                     return e2.salary - e1.salary;
                }
                }
                
        */


        //Lambda implementaion of functional interface
        Functional sortBySalaryDescending = (e1 , e2) -> e2.salary - e1.salary;

        Functional sortByAgeAscending = (e1, e2) -> e1.age - e2.age;


       employees.sort((e1,e2) -> sortBySalaryDescending.compare(e1, e2));

        System.out.println("Sorted by salary descending........");
        employees.forEach(System.out::println);

        employees.sort((e1,e2) -> sortByAgeAscending.compare(e1, e2));

        System.out.println("Sorted by Age descending........");
        employees.forEach(System.out::println);
    }
}

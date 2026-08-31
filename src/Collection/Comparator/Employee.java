package Collection.Comparator;
import java.util.*;

public class Employee implements Comparable<Employee>{

    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Comparable

    //Define natural ordering of employee
    //Employee with lower salary comes first
    //compareTo is called when we use
    //Collection.sort,list.sort,arrays.sort

    @Override
    public int compareTo(Employee other){

        return this.salary - other.salary;
    }

    @Override
    public String toString(){
        return name + "" + age + "" + salary;
    }
}


package ImmutableClass;

import java.util.*;

public class Main {
    public static void main(String[] args){

        ArrayList<String> skills = new ArrayList<>();
        skills.add("Java");                           //skills ─────→ ["Java"]

        Employee e = new Employee("Pratyush", skills);    //Create Employee.
        
        //Modifying original list
        skills.add("Docker");
        
        //Java because employee has its own copy
        System.out.println(e.getSkills());

        List<String> temp = e.getSkills();
        temp.add("C++");

        System.out.println(e.getName());

        //Java remains unchanged
        System.out.println(e.getSkills());
    }
}


//Original list:

// skills ─────────────→ ["Java"]


// Employee's separate list:

// e.skills ───────────→ ["Java"]



// ----->skills.add("Docker");


// skills ─────────────→ ["Java", "Docker"]

// e.skills ───────────→ ["Java"]
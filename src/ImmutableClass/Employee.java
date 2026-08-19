package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

final class Employee {
    
    //Immutable field
    private final String name;

    // Mutable object
    private final List<String> skills;

    public Employee(String name, List<String> skills){  //Employee constructor creates a new copy of skills.

        this.name = name;

        // Defensive copy
        // Internal object gets its own copy of the list
        this.skills = new ArrayList<>(skills); //A new ArrayList object is created and the elements from the original list are copied.
    }

    public String getName(){
        return name;
    }

    public List<String> getSkills(){
        
        //return a copy instead of the original internal list
        return new ArrayList<>(skills);
    }
}

// Does final make an object immutable?

// No.

// final List<String> list = new ArrayList<>();


// list.add("Java"); // ✅ Object can still change

// Only the reference cannot be reassigned.

// list = new ArrayList<>(); // ❌

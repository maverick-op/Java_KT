package PojoClass;

public class Student {

    private int id;         // why use private - This follows the principle of encapsulation allowing the control how data is accessed or modified
    private String name;

    public Student(){

    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String args[]){
        Student s = new Student();

        s.setId(101);
        s.setName("Sahil");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}

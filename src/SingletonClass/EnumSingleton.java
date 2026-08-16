package SingletonClass;

//very simple and robust singelton implementation
//thread safe by design
public enum EnumSingleton {
    
    //This is a single instance
    instance;

    //Constructor is implicity private in an enum
    EnumSingleton(){
        System.out.println("Enum singleton is created");
    }
}

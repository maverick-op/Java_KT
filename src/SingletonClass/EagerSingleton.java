package SingletonClass;

//object is created when the class is initialized
//Thread safe but object is created evn if never used

public class EagerSingleton {
    
    //The single object is created immediately
    private static final EagerSingleton instance = new EagerSingleton();


    //Private Constructor prevents new EagerSingleton() from outside this class
    private EagerSingleton(){
        System.out.println("Eager singleton is created");
    }


    //ststic method return the already created object
    public static EagerSingleton getInstance(){
        return instance;
    }
}

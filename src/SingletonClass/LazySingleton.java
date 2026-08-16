package SingletonClass;


//Object is created only when getInstance() is called
//Not thread Safe
public class LazySingleton {

    //Initally null so no object is created
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("LAzySingleton is Created");
    }

    public static LazySingleton getInstance(){

        //create object only when needed
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}

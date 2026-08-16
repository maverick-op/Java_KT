package SingletonClass;

//Thread safe + better performance than synchronizing every call
//volatile is required for correct double checked locking

public class DoubleChecked {
    
    //volatile ensure correct visibility between threads
    //Because of instruction reordering and visibility issues between threads.
    //But without volatile, another thread could potentially observe the reference before construction is safely completed.
    private static volatile DoubleChecked instance;

    private DoubleChecked(){
        System.out.println("Double check is created");
    }

    public static DoubleChecked getInstance(){

        // First check avoids synchronization if object already exists
        if(instance == null){

            synchronized(DoubleChecked.class){
            
            //Second check ensures another thread did not create the object while this thread was waiting
            if(instance == null){
                instance = new DoubleChecked();
            }
        }
        }

        return instance;
    }
}

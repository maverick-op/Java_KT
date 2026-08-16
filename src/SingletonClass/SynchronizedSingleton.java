package SingletonClass;

//Thread safe lazy initialization
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){
        System.out.println("Synchronized Singleton is created");
    }

    //only one thread can execute this method at a time
    //synchronized is used for thread synchronization. It ensures that only one thread at a time can execute a particular critical section of code for the same lock.
    public static synchronized SynchronizedSingleton getInstance(){

        if(instance == null){
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}

// How does synchronized work?----->

// Every Java object has an associated monitor/lock.

// When a thread enters synchronized code, it must acquire that lock.

// Thread 1 → acquires lock → executes code
// Thread 2 → tries to acquire same lock → waits
// Thread 1 → releases lock
// Thread 2 → acquires lock → executes code


//Why it is needed----->

//Two threads execute count++ at the same time.

// Without synchronized
// Thread 1 reads count = 0
// Thread 2 reads count = 0


// Thread 1 changes it to 1
// Thread 2 changes it to 1


// Final count = 1 ❌
// Expected = 2

// This is called a race condition.

// With synchronized
// Thread 1 enters
// Thread 2 waits


// Thread 1:
// count = 0 → 1


// Thread 1 leaves


// Thread 2 enters:
// count = 1 → 2


// Final count = 2 ✅
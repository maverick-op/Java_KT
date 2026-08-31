package Collection.Queue;
import java.util.*;

public class Main {
    
    public static void main(String[] args)
    {

        // Crating a Queue

        //Queue is an interface, LinkedList is the implementation

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.offer(20); // also inserts an element

        System.out.println(queue);
        
        queue.peek(); // return first element , return null if queue is empty

        queue.element(); // also return first element, throws NoSuchelementException if queueu is empty

        queue.poll(); // removes and returns the first element

        queue.size(); //return size

        //Iterating over queue

        for(Integer number : queue){
            System.out.println(number);
        }

    }
}
 
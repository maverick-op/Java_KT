package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityDequeue {

    public static void main(String[] args){

        // Priority Queue is a class that implements Queue
        //By default the smaller element gets higher priority

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min heap
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);

        // = new PriorityQueue<>(Collections.reverseOrder) Max heap
        // = new PriroityQueue<>((Integer a, Integer b) -> b-a); Max heap


        //peek give the highest priority element, without removing it

        System.out.println("Highest priority" + pq.peek());

        //poll removes the highest priority element

        pq.poll();


        // Dequeue double ended queue
        //It allows insertion/removal from both end

        Deque<Integer> deque = new ArrayDeque<>();
        

        deque.addFirst(20); // adds an element at the front;

        deque.addLast(10); // adds an element at last;

        deque.removeFirst(); // removes from front;

        deque.removeLast(); // remove from last
    }

}

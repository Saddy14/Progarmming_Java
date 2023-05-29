package DataStrut;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {

        // FIFO DataStructure
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Chicken");  // Add 
        queue.offer("Burger");
        queue.offer("Pizza");

        queue.poll();             //  Remove + return also

        queue.peek();            //   Peek Only 
        System.out.println(queue);
    }
} 
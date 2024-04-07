package Exam2Review;

import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        
        //A FIFO strucuture that serves elements with the highest priority first before elements with lower priority.

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(3.2); 
        queue.offer(1.4);
        
        //while the queue is not empty remove the values
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

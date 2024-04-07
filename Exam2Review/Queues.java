package Exam2Review;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

        // queues are a FIFO structure, this means first in first out.

        // enqueue is the concept of adding an object to the tail of the queue

        // dequeue is the concept of removing an object from the head of the queue

        // since queue is an interface we cannot instantiate it, instead we use either
        // Linked List or Priority Queue

        Queue<String> queue = new LinkedList<String>();

        // we get three methods from the parent class
        // add = enqueue, offer()
        // remove = dequeue, poll()

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("Starting queue: " + queue);

        queue.poll();

        System.out.println("After using the poll method: " + queue);

        //we can use isEmpty(), size(), and contains() methods as well because the queue class implements the collections class
    }
}

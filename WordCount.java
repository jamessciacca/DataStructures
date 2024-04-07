
import java.util.Scanner;
import java.util.*;

public class WordCount {

    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
            
            Scanner sc = new Scanner(System.in);
            Queue queue = new Queue(100);

            //set pause
            boolean pause = false;
            while(!pause) {
                System.out.println("Enter a String: ");
                String x = sc.nextLine();
                if(x != "") {
                    queue.enqueue(x);
                }else {
                    pause = true;
                }
            }
            
            int number = 0;
            while(!queue.isEmpty()) {
                queue.dequeue();
                number++;
            }
            
            System.out.println("Number of the words: " + number);
        
    }

}

//Queue class
class Queue {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public String front() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }
        return queueArray[front];
    }

    public String back() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty");
        }
        return queueArray[rear];
    }

    public void enqueue(String item) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full");
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    public String dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is full");
        }
        String removedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;

        return removedItem;
    }
}
class QueueOverflowException extends Exception {
    
    public QueueOverflowException(String message) {
        super(message);
    }
}

//Exception class
class QueueUnderflowException extends Exception {
    
    public QueueUnderflowException(String message) {
        super(message);
    }
}

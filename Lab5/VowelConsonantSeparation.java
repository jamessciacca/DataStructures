package Lab5;

import java.util.Scanner;

public class VowelConsonantSeparation {
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
  
        //for separate vowels
        Queue queue1 = new Queue(input.length());
        
        //for separate non vowels
        Queue queue2 = new Queue(input.length());
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            //for vowels
            if (vowel(ch)) {
                queue1.enqueue(Character.toString(ch));
                
            }
            //for non vowels
            else if(Character.isLetter(ch)) {
                queue2.enqueue(Character.toString(ch));
            }
        }
       
        System.out.println("Vowels: ");
        while (!queue1.isEmpty()) {
            System.out.print(queue1.dequeue() + " ");
            
        }
        
        System.out.println("\nNon-vowels: ");
        while (!queue2.isEmpty()) {
            System.out.print(queue2.dequeue() + " ");
            
        }
    }
    
    public static boolean vowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

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

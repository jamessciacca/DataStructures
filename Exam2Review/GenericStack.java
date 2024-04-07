package Exam2Review;

//creating a generic array using stack
//first we need to create the generic class
public class GenericStack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    // Constructor
    public GenericStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize]; // Creating array of type T
        this.top = -1;
    }

    // Push operation
    public void push(T item) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top] = item;
    }

    // Pop operation
    public T pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return null;
        }
        return stackArray[top--];
    }

    // Peek operation
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>(10);
        intStack.push(5);
        intStack.push(10);
        System.out.println(intStack.pop()); // Outputs: 10
        
        GenericStack<String> stringStack = new GenericStack<>(5);
        stringStack.push("Hello");
        System.out.println(stringStack.peek()); // Outputs: Hello 
    }
}

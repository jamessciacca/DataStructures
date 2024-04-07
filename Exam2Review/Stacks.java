package Exam2Review;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // stacks are instantied like so
        Stack<Integer> numbers = new Stack<Integer>();

        // push method is used to push values into the stack
        // Stacks are LIFO, last in first out based structures.

        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);

        System.out.println(numbers);

        //the pop method is used to remove the top element from the stack. it also holds the objects value.

        int topValue = numbers.pop();

        System.out.println("after popping the stack value is - " + numbers);

        System.out.println("the popped value is - " + topValue);

        //the empty() method is used to let you know if the stack is empty or not 
        System.out.println("Is the stack empty? - " + numbers.empty());

        //the peek method is used to see the top value
        System.out.println("The value of the top element is - " + numbers.peek());

        System.out.println(numbers.push(numbers.peek()));

        System.out.println(numbers);


    }
}

import java.util.*;

public class SomeStacks{
    public static void main(String[] args){

        //creating a stack of integers
        Stack<Integer> intStack = new Stack<>();

        intStack.add(7);
        intStack.add(7);
        intStack.add(5);
        intStack.add(6);
        intStack.add(7);
        intStack.add(9);
        intStack.add(7);
        intStack.add(5);

        System.out.println("Original Stack: " + intStack);

        //System.out.println(intStack);

        //using an iterator to iterate the stack and remove 7 

        Iterator<Integer> myIterator = intStack.iterator();

        while(myIterator.hasNext()){
            if(myIterator.next().equals(7)){
                myIterator.remove();

            }
        }

        System.out.println("All Instances of 7 have been removed from the stack");
        
        System.out.println("Stack after iteration: " + intStack);
    }
}

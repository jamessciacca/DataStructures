import java.util.*;

public class StackManipulation {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        myStack.add("James");
        myStack.add("Joey");
        myStack.add("Alex");
        myStack.add("Michael");

        System.out.println(myStack);
        
        //iterate through the stack 
        Iterator<String> myIterator = myStack.iterator();

        while(myIterator.hasNext()){
            if(myIterator.next().equals("Joey")){
                myIterator.remove();
                //print out the stack after removing Joey
                System.out.println("Joey has been removed from the stack!");
                System.out.println(myStack);
            }
        }

        //adding joey back to the stack 
        System.out.println("Adding Joey Back!");
        myStack.add("Joey");

        //using a for-each loop to iterate through the stack
        for(String name : myStack){
            System.out.println(name);
        }

        
    }
}

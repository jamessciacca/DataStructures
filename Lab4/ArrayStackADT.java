package Lab4;

import java.util.*;

public interface ArrayStackADT {

     void initializeStack();
 
     boolean isEmptyStack();
 
     boolean isFullStack();
 
     void push(T item) throws StackOverflowException;
 
     T peek() throws StackUnderflowException;
 
     void pop() throws StackUnderflowException ;
}
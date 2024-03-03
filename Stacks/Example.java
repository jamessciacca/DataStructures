import java.util.Iterator;
import java.util.Stack;
import java.util.ListIterator;

public class Example {
    public static void main(String [ ] args){

    Stack<String> sk = new Stack<String>( );
    sk.push("a");
    sk.push("c");
    sk.push("e");
    sk.push("d");

    Iterator it=sk.iterator( );

    System.out.println("Size before pop( ) :"+sk.size( ));
    while(it.hasNext( ))
    {
    String iValue=(String)it.next( );
    System.out.println("Iterator value :"+iValue);
    }
    // get and remove last element from stack
    String value =(String)sk.pop( );
    System.out.println("value :"+value);
    System.out.println("Size After pop( ) :"+sk.size( ));
    System.out.println( );
    System.out.println("Using a for-each loop");
    Stack<Integer> stack = new Stack<Integer>( );
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    2
    for(Integer i : stack)
    {
System.out.println(i);
}
    System.out.println( );
    System.out.println("Using ListIterator");
    Stack<Integer> stack1 = new Stack<Integer>( );
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    for (ListIterator<Integer> iterator = stack1.listIterator(stack1.size( ));
    iterator.hasPrevious( );)
    {   
    Integer integer = iterator.previous( );
    System.out.println(integer);
  }
 }
}

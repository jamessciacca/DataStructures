package Lab4;

public class StackOverflowException extends StackException{
    public StackOverflowException(){
        super("Stack Overflow");
    }

    public StackOverflowException(String message){
        super(message);
    }
}

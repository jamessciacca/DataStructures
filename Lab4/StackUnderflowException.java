package Lab4;

public class StackUnderflowException extends StackException{
    public StackUnderflowException(){
        super("Stack Underflow");
    }

    public StackUnderflowException(String message){
        super(message);
    }
}

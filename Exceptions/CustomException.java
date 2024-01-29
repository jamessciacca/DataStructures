package Exceptions;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("Does this Work?");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

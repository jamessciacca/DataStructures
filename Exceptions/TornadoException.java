package Exceptions;
//when creating a custom exception you need to make sure the class extends the Exception class!
public class TornadoException extends Exception{
    
    //creating a constructor that simply prints out a message
    public TornadoException(){
        System.out.println("Tornado! Take Cover!");
    }

    //creating anpther constructor that takes an integer value
    public TornadoException(int m){
        System.out.println("The Tornado is " + m + " miles away and approaching");
    }
}

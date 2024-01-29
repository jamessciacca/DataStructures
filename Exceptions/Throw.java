package Exceptions;

public class Throw extends Exception{

    public boolean isEven(int number) throws Exception{
        if(number % 2 == 0){
            return true;
        }else{
            throw new Exception("Number is not even");
        }
    }
    public static void main(String[] args){
        Throw t = new Throw();
        try{
            System.out.println(t.isEven(3));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

package Exceptions;

public class TornadoTest {
    public static void main(String[] args) {
        try{
            int m = 10;
            if(m<5){
                throw new TornadoException();
            }else{
                throw new TornadoException(m);
            }
        }catch(TornadoException e){
            System.out.println(e.getMessage());
        }
    }
}

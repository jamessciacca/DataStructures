import java.util.Scanner;

public class Add {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        int x;
        int y;
        
        System.out.print("Enter your first number: ");
        x = kb.nextInt();
        
        System.out.print("Enter your first number: ");
        y = kb.nextInt();
        
        int c = x + y;

        System.out.println("The sum of your numbers is: " + c);

        kb.close();
    }
}

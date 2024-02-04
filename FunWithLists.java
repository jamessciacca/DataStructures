import java.util.ArrayList;
import java.util.Scanner;

public class FunWithLists {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What kind of list?: ");
        String listType = input.nextLine();

        if(listType.equals("string")){
            ArrayList<String> list = new ArrayList<>(100);
        }
        else if(listType.equals("integer")){
            ArrayList<Integer> list = new ArrayList<>(100);
        }
        else if(listType.equals("double")){
            ArrayList<Double> list = new ArrayList<>(100);
        }
        else{
            System.out.println("Invalid Entry!");
        }
    }
}

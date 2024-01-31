package ArrayLists;

import java.util.ArrayList;

public class StringArrayExample {
    public static void main(String[] args){
         ArrayList<String>colors = new ArrayList<>();

         colors.add("Red");
         colors.add("Green");
         colors.add("Blue");
         colors.add("Yellow");

         System.out.println("The colors in the list: " + colors);

         boolean isEmpty = colors.isEmpty();
         System.out.println("Is it empty?: " + isEmpty);

         colors.add(1, "Orange");
         System.out.println("After adding orange at index one: " + colors);

         colors.remove(3);

        for(String color: colors){
            System.out.println(color);
            int sizeOfList = colors.size();
            System.out.println("Size of list: " + sizeOfList);
        }
        
    }
}

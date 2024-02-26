package ListIterators;

import java.util.*;

public class ListIteratorHW {
    public static void main(String[] args){

        //creating a list of colors
        List<String> colors = new ArrayList<>();

        //adding colors to list
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        //creating a list iterator
        ListIterator<String> iterator = colors.listIterator();

        //printing elements from index 1
        System.out.println("Elements from index 1: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //adding purple to the current position
        iterator.add("purple");

        //moving iterator to the beginning of the list
        while(iterator.hasPrevious()){
            iterator.previous();
        }

        //reprinting the list
        System.out.println("Reprinted list: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //moving iterator to the beginning of the list
        while(iterator.hasPrevious()){
            iterator.previous();
        }
        
        //replacing green with cyan and blue with navy
        while(iterator.hasNext()){
            String color = iterator.next();
            if(color.equals("green")){
                iterator.set("cyan");
            }
            else if(color.equals("blue")){
                iterator.set("navy");
            }
        }

        //printing the modified list
        System.out.println("Modified list: ");
        for(String color: colors){
            System.out.println(color);
        }

    }
}

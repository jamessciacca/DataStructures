package ListIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        ListIterator<String> iterator = names.listIterator();
        System.out.println("Iterate forward");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("/n Iterate backward");

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println( "Modify Elements While Iterating");
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("Bob")){
                iterator.set("Bobby");
            }
            else if(name.equals("Charlie")){
                iterator.remove();
            }
        }

        System.out.println("/n Modified List");
        for(String name: names)System.out.println(name);
    }
}
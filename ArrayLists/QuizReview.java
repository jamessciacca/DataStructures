package ArrayLists;

import java.util.ArrayList;

public class QuizReview{
    public static void main(String[] args) {
        
    ArrayList<String> List1 = new ArrayList<>(20);

    List1.add("Hello");
    System.out.println(List1);
    List1.set(0, "I took Over This Index");
    System.out.println(List1);
    List1.add("Second");
    System.out.println(List1);
    List1.remove(1);
    System.out.println(List1);

    boolean isEmpty = List1.isEmpty();
    System.out.println("Is the list empty? " + isEmpty);

    List1.add("Poop");
    List1.add("Pee");

    System.out.println("Current List Size: " + List1.size());
}
}

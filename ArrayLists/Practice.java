package ArrayLists;

import java.util.ArrayList;

public class Practice{
    public static void main(String[] args){

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Elements in ArrayList: " + numbers);

        //access an element by index
        int elementAt2 = numbers.get(2);
        System.out.println("Element at Index 2: " + elementAt2);

        //changing and element 
        numbers.set(1, 25);
        System.out.println(numbers);

        //convert primitive to an object
        numbers.remove(Integer.valueOf(30));
        System.out.println("After removing 30: " + numbers);

        //check if list has a value
        boolean containsElement = numbers.contains(40);
        System.out.println("Does the list have 40?: " + containsElement);

        int sizeOfList = numbers.size();
        System.out.println("The size of your list is: " + sizeOfList);

    }
}

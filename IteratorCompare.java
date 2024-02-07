import java.util.*;

public class IteratorCompare {

    public static void compareObject(ArrayList<String> aList, ArrayList<String> bList)

    {

        // Creating iterator for first list
        Iterator<String> aItr = aList.listIterator();
        // hasNext() function of Iterator check for next element
        while (aItr.hasNext())
            {
            // Getting object of first List, next() function is used to get value
            String first = aItr.next();
            // Creating iterator for second list
            Iterator<String> bItr = bList.listIterator();
            while (bItr.hasNext())
            {
                String second = bItr.next();
                // equals() method is used to compare two strings
                if (first.equals(second))
                {
                    // Printing same object and stopping second loop
                    System.out.println(first + " ");
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Jack");
        aList.add("James");
        aList.add("Tom");
        aList.add("Alex");

        ArrayList<String> bList = new ArrayList<String>();
        bList.add("Anthony");
        bList.add("Jack");
        bList.add("Sean");
        bList.add("Liron");
        
        //calling the method
        compareObject(aList, bList);

    }

}

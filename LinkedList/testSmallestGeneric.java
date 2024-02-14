package LinkedList;

public class testSmallestGeneric{
    public static void main(String[] args){

        LinkedList<Integer> intList = new LinkedList<>();

        intList.insertAtEnd(5);
        intList.insertAtEnd(10);
        intList.insertAtEnd(3);
        intList.insertAtEnd(8);

        Integer smallInt = intList.findSmallestElement();

        System.out.println("The smallest element in the linked list is: " + smallInt);
    }
}

package LinkedList;
import java.util.*;

public class TestDuplicates {
    public static void main(String[] args){

        DuplicateFinder dll = new DuplicateFinder();

        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);
        dll.addNode(1);

        dll.display();
        dll.findDuplicates();
    }
}

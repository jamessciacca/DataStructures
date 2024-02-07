package LinkedList;

class Node {
    int info;
    Node link;

    public Node(int info){
        this.info = info;
        this.link = null;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int info){
        Node newNode = new Node(info);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node current = head;
            while(current.link != null){
                //advance through the list
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public int findLargestElement(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
            int maxElement = head.info;
            Node current = head.link;
            while(current != null){
                if(current.info > maxElement){
                    maxElement = current.info;
                }
            current = current.link;
        }
        return maxElement;
    }
    
    
}

public class testLargestElement{
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        int largestElement = linkedList.findLargestElement();

        System.out.println("Largest Element: " + largestElement);
    }
}

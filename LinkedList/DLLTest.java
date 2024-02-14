package LinkedList;

import java.util.*;

class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    //add a node to the end of the list
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } 
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty!");
            return;
        }
        else{
            System.out.println("Nodes of DLL");
            while(current != null){
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
}

public class DLLTest{
    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.addNode(1);
        DLL.addNode(2);
        DLL.addNode(3);
        DLL.addNode(4);
        DLL.addNode(5);

        DLL.display();
    }
}

package LinkedList;

class Node<T>{
    T info;
    Node<T> link;

    public Node(T info){
        this.info = info;
        this.link = null;
    }
}

class LinkedList<T extends Comparable<T>>{

    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void insertAtEnd(T info){
        Node<T> newNode = new Node<>(info);

        if(head == null){
            head = newNode;
            return;
        }
    
        Node<T> current = head;

        while(current.link != null){
            current = current.link;
        }
        
        current.link = newNode;
    }

    public T findSmallestElement(){
        if(head == null){
            return null;
        }
        T smallestElement = head.info;
        Node<T> current = head.link;
        while(current!=null){
            if(current.info.compareTo(smallestElement)<0){
                smallestElement = current.info;
            }
            current = current.link;
        }
        return smallestElement;
    }
}


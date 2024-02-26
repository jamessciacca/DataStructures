package LinkedList;

class DuplicateFinder{
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data, Node prev, Node next){
            this.data = data;
            this.prev = null;
            this.next = null;   
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data, null, null);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = null;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of the doubly linked list: ");
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void findDuplicates(){
        Node current = head;
        boolean found = false;

        while(current != null){
            Node temp = current.next;
            while(temp != null){
                if(current.data == temp.data){
                    found = true;
                    System.out.println("Duplicate was found: " + current.data);
                    break;
                }
                //traverses outer loop
                temp = temp.next;
            }
            current = current.next;
        }
        if(!found){
            System.out.println("No duplicates!");
        }
    }
}

    



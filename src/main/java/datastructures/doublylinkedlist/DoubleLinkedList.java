package datastructures.doublylinkedlist;

public class DoubleLinkedList {

    Node head = null;
    Node tail = null;

    public DoubleLinkedList() {
        super();
    }

    public void addNode(int item){
        // Create a new node
        Node newNode = new Node(item);

        // if list is empty, head and tail will point to newNode
        if (head == null){
            System.out.println("List is empty");
            head = tail = newNode;
            // head's previous will be null
            head.previous = null;
            // tail's next will be null
            tail.next = null;
        }else{
            System.out.println("Nodes of the doubly linked list: ");
            // add newNode to the end of list. tail -> next set to newNode
            tail.next = newNode;
            // newNode -> previous set to tail
            newNode.previous = tail;
            // newNode becomes new tail
            tail = newNode;
            // tail's next point to null
            tail.next = null;
        }
    }

    static class Node{
        int item;
        Node previous;
        Node next;

        Node(int item){
            this.item = item;
        }
    }
}

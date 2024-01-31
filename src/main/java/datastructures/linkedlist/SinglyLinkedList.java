package datastructures.linkedlist;

public class SinglyLinkedList {
    /**
     * A singly-linked list is a linked list that stores data and the reference to the next node or a null value.
     * Singly-linked lists are also known as one-way lists as they contain a node with a single pointer pointing to the next node in the sequence.
     */

    // represent head and tail of the singly linked list
    Node head = null;
    Node tail = null;

    public void addNode(int data){
        // Create a new node
        Node newNode = new Node(data);

        // check if list is empty
        if(head == null) {
            // if list is empty, both head and tail will point to new node
            head = newNode;
        }else{
            // newNode will be added after tail such that tail's next point to newNode
            tail.next = newNode;
        }
        // newNode will become new tail of the list
        tail = newNode;
    }

    public void printSinglyLinkedList(){
        // Node current will point to head
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
        }else{
            System.out.println("Nodes of the singly linked list: ");
            while(current != null){
                // Prints each node by incrementing pointer
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Represent a node of the singly linked list
    static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

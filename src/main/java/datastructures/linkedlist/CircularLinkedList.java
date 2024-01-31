package datastructures.linkedlist;

public class CircularLinkedList {

    /**
     * In the Circular Linked List, all the nodes align to form a circle. In this linked list, there is no NULL
     * node at the end. We can define any node as the first node. Circular linked lists are useful in implementing a circular queue.
     */

    static class Node {
        int info;
        Node before,next;
    }

    private Node root;

    public CircularLinkedList() {
        root = null;
    }

    public void insertFirst(int x) {
        Node new1 = new Node();
        new1.info = x;
        if (root == null) {
            new1.next = new1;
            new1.before = new1;
        } else {
            Node last = root.before;
            new1.next = root;
            new1.before = last;
            root.before = new1;
            last.next = new1;
        }
        root = new1;
    }
    public void insertLast(int x) {
        Node new1 = new Node();
        new1.info = x;
        if (root == null) {
            new1.next = new1;
            new1.before = new1;
            root = new1;
        } else {
            Node last = root.before;
            new1.next = root;
            new1.before = last;
            root.before = new1;
            last.next = new1;
        }
    }

    public boolean empty(){
        return root == null;
    }

    public void print(){
        if (!empty()) {
            Node pointer = root;
            do {
                System.out.print (pointer.info + "-");
                pointer = pointer.next;
            } while (pointer != root);
            System.out.println();
        }
    }

    public int quantity(){
        int cant = 0;
        if (!empty()) {
            Node pointer = root;
            do {
                cant++;
                pointer = pointer.next;
            } while (pointer != root);
        }
        return cant;
    }

    public void remove (int pos){
        if (pos <= quantity())    {
            if (pos == 1) {
                if (quantity() == 1) {
                    root = null;
                } else {
                    Node last = root.before;
                    root = root.next;
                    last.next = root;
                    root.before = last;
                }
            } else {
                Node pointer = root;
                for (int f = 1 ; f <= pos - 1 ; f++)
                    pointer = pointer.next;
                Node before = pointer.before;
                pointer = pointer.next;
                before.next = pointer;
                pointer.before = before;
            }
        }
    }

    public static void main(String[] ar) {
        CircularLinkedList lc = new CircularLinkedList();
        lc.insertFirst(100);
        lc.insertFirst(45);
        lc.insertFirst(12);
        lc.insertFirst(4);
        System.out.println("After inserting 4 Nodes at the beginning");
        lc.print();
        lc.insertLast(250);
        lc.insertLast(7);
        System.out.println("After inserting 2 Nodes at the end");
        lc.print();
        System.out.println("quantity of nodes: " + lc.quantity());
        System.out.println("After remove the first position: ");
        lc.remove(1);
        lc.print();
        System.out.println("After removing the fourth position: ");
        lc.remove(4);
        lc.print();
    }
}

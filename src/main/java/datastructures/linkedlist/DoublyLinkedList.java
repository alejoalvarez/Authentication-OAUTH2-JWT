package datastructures.linkedlist;

public class DoublyLinkedList {

    /**
     * It is the same as a singly-linked list with the difference that it has two pointers, one pointing
     * to the previous node and one pointing to the next node in the sequence. Therefore, a doubly-linked list allows us to traverse in both the directions of the list.
     */

    static class Node{
        int info;
        Node next, before;
    }

    private Node root;

    public DoublyLinkedList() {
        root = null;
    }

    void push(int pos, int x){
        if (pos <= quantity() + 1){
            Node new1 = new Node();
            new1.info = x;
            if (pos == 1){
                new1.next = root;
                if (root != null)
                    root.before = new1;
                root = new1;
            } else
            if (pos == quantity() + 1)    {
                Node pointer = root;
                while (pointer.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = new1;
                new1.next = pointer;
                new1.next = null;
            } else {
                Node pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node next = pointer.next;
                pointer.next = new1;
                new1.before = pointer;
                new1.next = next;
                next.before = new1;
            }
        }
    }

    public int pull(int pos){
        if (pos <= quantity()){
            int information;
            if (pos == 1) {
                information = root.info;
                root = root.next;
                if (root != null)
                    root.before = null;
            } else {
                Node pointer;
                pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node prox = pointer.next;
                pointer.next = prox.next;
                Node next = prox.next;
                if (next != null)
                    next.before = pointer;
                information = prox.info;
            }
            return information;
        }
        else
            return Integer.MAX_VALUE;
    }

    public void remove(int pos){
        if (pos <= quantity()){
            if (pos == 1) {
                root = root.next;
                if (root != null)
                    root.before = null;
            } else {
                Node pointer;
                pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node prox = pointer.next;
                prox = prox.next;
                pointer.next = prox;
                if (prox != null)
                    prox.before = pointer;
            }
        }
    }

    public void exchange(int pos1, int pos2) {
        if (pos1 <= quantity() && pos2 <= quantity()){
            Node pointer1 = root;
            for (int f = 1 ; f < pos1 ; f++)
                pointer1 = pointer1.next;
            Node pointer2 = root;
            for (int f = 1 ; f < pos2 ; f++)
                pointer2 = pointer2.next;
            int aux = pointer1.info;
            pointer1.info = pointer2.info;
            pointer2.info = aux;
        }
    }

    public int higher() {
        if (!empty()) {
            int may = root.info;
            Node pointer = root.next;
            while (pointer != null) {
                if (pointer.info > may)
                    may = pointer.info;
                pointer = pointer.next;
            }
            return may;
        }
        else
            return Integer.MAX_VALUE;
    }

    public int higherPosition() {
        if (!empty())    {
            int may = root.info;
            int x = 1;
            int pos = x;
            Node pointer = root.next;
            while (pointer != null){
                if (pointer.info > may) {
                    may = pointer.info;
                    pos = x;
                }
                pointer = pointer.next;
                x++;
            }
            return pos;
        }
        else
            return Integer.MAX_VALUE;
    }

    public int quantity(){
        int cant = 0;
        Node pointer = root;
        while (pointer != null) {
            pointer = pointer.next;
            cant++;
        }
        return cant;
    }

    public boolean sorted() {
        if (quantity()>1) {
            Node pointer1 = root;
            Node pointer2 = root.next;
            while (pointer2 != null) {
                if (pointer2.info < pointer1.info) {
                    return false;
                }
                pointer2 = pointer2.next;
                pointer1 = pointer1.next;
            }
        }
        return true;
    }

    public boolean exist(int x) {
        Node pointer = root;
        while (pointer != null) {
            if (pointer.info == x)
                return true;
            pointer = pointer.next;
        }
        return false;
    }

    public boolean empty(){
        if (root == null)
            return true;
        else
            return false;
    }

    public void print(){
        Node pointer = root;
        while (pointer != null) {
            System.out.print (pointer.info + "-");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] ar) {
        DoublyLinkedList lg = new DoublyLinkedList();
        lg.push(1, 10);
        lg.push(2, 20);
        lg.push(3, 30);
        lg.push(2, 15);
        lg.push(1, 115);
        lg.print();
        System.out.println ("After deleting the first");
        lg.remove(1);
        lg.print();
        System.out.println ("After extracting the second");
        lg.pull(2);
        lg.print();
        System.out.println ("After exchanging the first with the third");
        lg.exchange(1, 3);
        lg.print();
        if (lg.exist(10))
            System.out.println("20 is found on the list");
        else
            System.out.println("20 not found in the list");
        System.out.println("The position of the elder is: " + lg.higherPosition());
        if (lg.sorted())
            System.out.println("The list is sorted from smallest to largest");
        else
            System.out.println("The list is not sorted from smallest to largest");
    }
}

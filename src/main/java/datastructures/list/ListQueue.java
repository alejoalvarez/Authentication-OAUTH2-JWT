package datastructures.list;

public class ListQueue {

    // A list behaves like a queue if the inserts are done at the end and the extracts are done at the front of the list.
    // They are also called FIFO (First In First Out) lists.

    static class Node {
        int info;
        Node next;
    }

    private Node root,bottom;

    ListQueue(){
        root = null;
        bottom = null;
    }

    boolean empty (){
        return (root == null);
    }

    void insert (int info){
        Node newNode = new Node();
        newNode.info = info;
        newNode.next = null;
        if (empty() ) {
            root = newNode;
        } else {
            bottom.next = newNode;
        }
        bottom = newNode;
    }

    int pull (){
        if (!empty() ){
            int information = root.info;
            if (root == bottom){
                root = null;
                bottom = null;
            } else {
                root = root.next;
            }
            return information;
        } else
            return Integer.MAX_VALUE;
    }

    public void print() {
        Node pointer = root;
        System.out.println("List of all items in the queue.");
        while (pointer != null) {
            System.out.print(pointer.info + "-");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] ar) {
        ListQueue listQueue = new ListQueue();
        listQueue.insert(5);
        listQueue.insert(10);
        listQueue.insert(50);
        listQueue.print();
        System.out.println("extract one from the queue: " + listQueue.pull());
        listQueue.print();
    }
}
package list;

public class ListStack {

    static class Node {
        int info;
        Node next;
    }

    private Node root;

    public ListStack() {
        root = null;
    }

    public void push(int x) {
        Node newNode = new Node();
        newNode.info = x;
        if(root == null){
            newNode.next = null;
        } else {
            newNode.next = root;
        }
        root = newNode;
    }

    public int pull(){
        if (root != null){
            int information = root.info;
            root = root.next;
            return information;
        } else{
            return Integer.MAX_VALUE;
        }
    }

    public void print() {
        Node pointer = root;
        System.out.println("List of all elements in the stack.");
        while (pointer != null) {
            System.out.print(pointer.info + "-");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public int total() {
        int quantity = 0;
        Node pointer = root;
        while (pointer != null) {
            quantity++;
            pointer = pointer.next;
        }
        return quantity;
    }

    public static void main(String[] ar) {
        ListStack listStack = new ListStack();
        listStack.push(10);
        listStack.push(40);
        listStack.push(3);
        listStack.print();
        System.out.println("Pull of stack: " + listStack.pull());
        listStack.print();
    }
}

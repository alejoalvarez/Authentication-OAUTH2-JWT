package list.exerciselistqueue;

public class ListQueueExercise {

    // The objective of this practice is to show the importance of queues in Computer Science and more precisely in simulations.
    // Simulations allow the analysis of real situations without the need to actually execute them. It has the benefit that its cost is much lower than testing in reality.

    //Develop a program for simulating an ATM. The following information is available:- Customers arrive at the door of the ATM every 2 or 3 minutes.-
    // Each customer takes between 2 and 4 minutes to be served.

    //Obtain the following information:
    // 1 - Number of customers served in 10 hours.
    // 2 - Number of customers in queue after 10 hours.
    // 3 - Arrival time of the first customer not served after 10 hours (i.e. the person who is first in the queue when 10 hours are up)

    static class Node {
        int info;
        Node next;
    }

    Node root, bottom;

    ListQueueExercise() {
        root = null;
        bottom = null;
    }

    boolean empty (){
        return (root == null);
    }

    void push(int info){
        Node newNode = new Node();
        newNode.info = info;
        newNode.next = null;
        if (empty ()) {
            root = newNode;
        } else {
            bottom.next = newNode;
        }
        bottom = newNode;
    }

    int pull(){
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

    public int quantity() {
        int quantity = 0;
        Node pointer = root;
        while (pointer != null) {
            quantity++;
            pointer = pointer.next;
        }
        return quantity;
    }
}

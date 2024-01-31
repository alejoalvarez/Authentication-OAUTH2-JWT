import datastructures.linkedlist.SinglyLinkedList;

class Main{

    public static void main (String[] args){



        // Singly linked list
        System.out.println("--------------" + " Singly Linked List " + "--------------");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(4);

        singlyLinkedList.printSinglyLinkedList();

    }
}
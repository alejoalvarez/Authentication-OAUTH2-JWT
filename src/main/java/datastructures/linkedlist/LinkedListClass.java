package datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListClass {

    // The LinkedList class is almost identical to the ArrayList
    // The LinkedList class implements the logic to work with generic lists, that is, we can insert and extract elements from any part of the list.
    // A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
    // Costly insertion and removal (Except in the first and last position, which is immediate).
    // Limited size
    // A Linked List is a collection of similar types of data elements, called nodes, which point to the next following nodes by means of pointers.

    /**
     * Types of linked list:
     * -- Singly-linked list
     * -- Doubly linked list
     * -- Circular linked list
     */

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Alejo");
        list1.add("Natalia");
        list1.add("Juan");
        list1.add("Luisa");

        // Get elements
        System.out.println("The first element in list: " + list1.getFirst());
        System.out.println("The last element in list: " + list1.getLast());
        System.out.println("The second element in list: " + list1.get(1));
        print(list1);

        //Remove element
        list1.remove(0);
        System.out.println("-----List after remove index 0 -----");
        print(list1);
        System.out.println("-----List after remove Juan-----");
        list1.remove("Juan");
        print(list1);

        // size list
        System.out.println("----- Total elements of the list: -----");
        System.out.println(list1.size());

        // contain element
        containElement(list1, "Maria");
        containElement(list1, "Luisa");

        // clear list
        list1.clear();
    }

    public static void print(LinkedList<String> list){
        for (String item: list) {
            System.out.println(item);
        }
    }

    public static void containElement(LinkedList<String> list, String item){
        if(list.contains(item)){
            System.out.println("The name " + item + " exist in the list.");
        }else{
            System.out.println("The name " + item + " not exist in the list.");
        }
    }

}

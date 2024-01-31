package datastructures.list;

public class ListGeneric {

    static class Node {
        int info;
        Node next;
    }

    private Node root;

    public ListGeneric () {
        root = null;
    }

    void push (int pos, int x){
        if (pos <= quantity() + 1){
            Node new1 = new Node ();
            new1.info = x;
            if (pos == 1){
                new1.next = root;
                root = new1;
            } else if (pos == quantity() + 1)    {
                Node pointer = root;
                while (pointer.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = new1;
                new1.next = null;
            } else {
                Node pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node next = pointer.next;
                pointer.next = new1;
                new1.next = next;
            }
        }
    }

    public int pull (int pos) {
        if (pos <= quantity())    {
            int information;
            if (pos == 1) {
                information = root.info;
                root = root.next;
            } else {
                Node pointer;
                pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node prox = pointer.next;
                pointer.next = prox.next;
                information = prox.info;
            }
            return information;
        }
        else
            return Integer.MAX_VALUE;
    }

    public void delete(int pos){
        if (pos <= quantity()){
            if (pos == 1) {
                root = root.next;
            } else {
                Node pointer;
                pointer = root;
                for (int f = 1 ; f <= pos - 2 ; f++)
                    pointer = pointer.next;
                Node prox = pointer.next;
                pointer.next = prox.next;
            }
        }
    }

    public void exchange (int pos1, int pos2){
        if (pos1 <= quantity() && pos2 <= quantity())    {
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

    public int higher(){
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

    public int posHigher(){
        if (!empty())    {
            int may = root.info;
            int x=1;
            int pos=x;
            Node pointer = root.next;
            while (pointer != null){
                if (pointer.info > may) {
                    may = pointer.info;
                    pos=x;
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

    public boolean sorted(){
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

    public boolean exist(int x){
        Node pointer = root;
        while (pointer == null) {
            if (pointer.info == x)
                return true;
            pointer = pointer.next;
        }
        return false;
    }

    public boolean empty(){
        return root == null;
    }

    public void print(){
        Node pointer = root;
        while (pointer != null) {
            System.out.print (pointer.info + "-");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] ar){
        ListGeneric lg = new ListGeneric();
        lg.push (1, 10);
        lg.push (2, 20);
        lg.push (3, 30);
        lg.push (2, 15);
        lg.push (1, 115);
        lg.print ();
        System.out.println("After deleting the first");
        lg.delete(1);
        lg.print();
        System.out.println("After extracting the second");
        lg.pull(2);
        lg.print();
        System.out.println("After exchanging the first with the third");
        lg.exchange(1, 3);
        lg.print();
        if (lg.exist(20))
            System.out.println("20 is found on the list");
        else
            System.out.println("20 not found in the list");
        System.out.println("The position of the elder is: " + lg.higher());
        if (lg.sorted())
            System.out.println("The list is sorted from smallest to largest");
        else
            System.out.println("The list is not sorted from smallest to largest");
    }
}

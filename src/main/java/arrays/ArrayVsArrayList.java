package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String args[]) {
        //Normal Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //Accessing array elements
        System.out.println("The first element of array is: " + arr[0]); // The first element of array is: 1
        System.out.println("The second element of array is: " + arr[1]); // The second element of array is: 2

        //ArrayList
        //Creating an arrayList with initial capacity 5
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);

        // Add elements to ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Accessing the  elements of ArrayList
        System.out.println("The first element of arrayList is: " + arrayList.get(0)); // The first element of arrayList is: 1
        System.out.println("The second  element of arrayList is: " + arrayList.get(1)); // The second  element of arrayList is: 2

        // ----------- Another example when we need to specify the size for array -------------

        //Normal arrays in which we need to specify the size for array
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        System.out.println("Accessing arrays:");
        System.out.println(Arrays.toString(myArray)); // [1, 2, 3, 4, 5]

        /* We cannot add more elements to array myArray as it is fixed size, otherwise we will get an error.*/
        // we need not specify size in ArrayList
        ArrayList <Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        // We can add more elements to arrayList

        System.out.println("Accessing ArrayList:");
        System.out.println(arrayList2); // [1, 2, 3, 4]
    }
}

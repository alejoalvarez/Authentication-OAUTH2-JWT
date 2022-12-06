package arrays;

import java.util.Arrays;

public class MethodsJavaArray {

    public static void main(String[] args) {

        // compare -> int compare(array1, array2)
        //This method compares two arrays in lexicographic order.
        int[] myArray1 = { 10, 15, 32, 30 }; // Create the first Array
        int[] myArray2 = { 10, 25, 22 ,30}; // Create the second Array
        System.out.println("Comparing two integer arrays: " + Arrays.compare(myArray1, myArray2)); // Comparing two integer arrays: -1

        // fill -> void fill(originalArray, value)
        // This method is used to fill the specific value to each element of the specified array with a specific type. This method can also be used with all the other primitive data types (byte, short, int, etc.).
        int[] fillArray = new int[5]; // Create the Array
        int fillValue = 15;
        Arrays.fill(fillArray, fillValue);
        System.out.println("Integer Array on filling: " + Arrays.toString(myArray1)); // Integer Array on filling: [ 15,15,15,15,15 ]

        // equals -> boolean equals(array1, array2)
        // This method checks whether both the arrays are equal or not and gives the result either as true or false.
        //create arrays to be compared
        int[] array1 = { 45, 68, 34, 20, 56 };
        int[] array2 = { 45, 68, 34, 20, 56 };
        int[] array3 = { 55, 78, 44, 10, 56 };
        System.out.println("Comparing array1 and array2: " + Arrays.equals(array1,array2)); // Comparing array1 and array2: true
        System.out.println("Comparing array2 and array3: " + Arrays.equals(array2,array3)); // Comparing array2 and array3: false

        // binarySearch ->  int binarySearch(array [], value)
        // With the help of this method, we can find or search a specified value inside an array which is given as the first argument.
        // As a result, this method returns the index of the element in the array. The array must be sorted for this search. If the element is not found, it returns a negative value.
        int[] array = { 20, 34,56,78,97 };
        int intKey = 56;
        System.out.println(intKey + " found at index = " + Arrays .binarySearch(array, intKey)); // 56 found at index = 2
        System.out.println(20 + " found at index = " + Arrays .binarySearch(array, 20)); // 20 found at index = 0

        // copyOf -> copyOf(originalArray, newLength)
        // We can copy the specified array to a new array with a specified length. The left spaces are assigned to default values in the new array.
        int[] array4 = { 65, 20, 34, 56, 78, 97 }; //create arrays
        System.out.println("Integer Array: "+ Arrays.toString(array4)); // Integer Array: [65, 20, 34, 56, 78, 97]
        System.out.println("\nNew Arrays by copyOf method:");
        System.out.println("Integer Array: "+ Arrays.toString( Arrays.copyOf(array4, 10))); // Integer Array: [65, 20, 34, 56, 78, 97, 0, 0, 0, 0]
    }
}

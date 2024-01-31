package datastructures.arrays;

import java.util.Arrays;

public class Array {
    /**
     * A Java array is a data structure that allows you to store data of the same type
     * One-dimensional arrays (called vectors)
     * Multidimensional arrays (we call arrays)
     * The size of arrays is declared and cannot be changed at runtime.
     * Arrays are considered as objects in Java.
     * Each array type implements the Cloneable and java.io.Serializable interfaces.
     * The storage of arrays in Java is in the form of dynamic allocation in the heap area.
     * The array can contain primitive data types as well as objects of a class according to the definition of the array.
     * --- For primitive data types, the real values are stored in contiguous memory locations.
     * --- For objects of a class, the real objects are stored on the heap
     */

    // single array or vector (Single dimensional)
    String[] arraySimple = new String[2];
    String[] cars = {"mercedez", "ferrari","volvo"};

    // Literal array (In a situation where the size and elements of the array are known, array literals can be used.)
    int[] intArray = new int[]{1,2,3,4};

    // Array (Multidimensional)
    String [][] array = new String [3][3];
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

    // Irregular array
    int [][] array2 = new int[3][];
    int [][] numbers = {{6,7,5}, {3, 8, 4}, {1,0,2}, {9,5,2}};
    int [][] a = {{6,7,5,0,4}, {3, 8, 4}, {1,0,2,7}, {9,5}};

    /**
     * Cloning array
     * when cloning a single one-dimensional array, such as Object[],
     * a deep copy is made, with the new array containing copies of the original array's elements rather than references
     */
    public static void cloningOneDimensionalArray(){
        System.out.println("-----------" + " cloningOneDimensionalArray " + "----------");
        int[] intArray = {1, 2, 3};
        int[] cloneArray = intArray.clone();
        System.out.println(intArray == cloneArray);// prints false as a deep copy is created
        for (int j : cloneArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * Methods of Arrays Class
     *
     */
    public static void printArraysClassMethods(){
        // Arrays.compare => int compare(array1, array2)
        // 1 if array1 is greater than array2,
        // -1 if array1 is smaller than array2
        // 0 if both arrays are equal to each other.
        int[] myArray1 = { 10, 15, 32, 30 }; // Create the first Array
        int[] myArray2 = { 10, 25, 22 ,30}; // Create the second Array
        System.out.println("--------- " + "Arrays.compare" + " --------");
        System.out.println("Comparing two integer arrays: " + Arrays.compare(myArray1, myArray2)); // Print -1

        //Arrays.fill => void fill(originalArray, value)
        System.out.println("--------- " + "Arrays.fill" + " --------");
        System.out.println("array before fill: " + Arrays.toString(myArray1));
        int fillValue = 15;
        Arrays.fill(myArray1, fillValue);
        System.out.println("array after fill: " + Arrays.toString(myArray1)); // Print [15, 15, 15, 15]

        //Arrays.equals => boolean equals(array1, array2)
        System.out.println("--------- " + "Arrays.equals" + " --------");
        int[] array1 = { 45, 68, 34, 20, 56 };
        int[] array2 = { 45, 68, 34, 20, 56 };
        int[] array3 = { 55, 78, 44, 10, 56 };
        System.out.println("array1 : " + Arrays.toString(array1));
        System.out.println("array2 : " + Arrays.toString(array2));
        System.out.println("array3 : " + Arrays.toString(array3));
        System.out.println("Comparing array1 and array2: " + Arrays.equals(array1,array2));
        System.out.println("Comparing array2 and array3: " + Arrays.equals(array2,array3));

        //Arrays.binarySearch => int binarySearch(array[], value)
        System.out.println("--------- " + "Arrays.binarySearch" + " --------");
        int[] array = { 20, 34,56,78,97 };
        System.out.println("array " + Arrays.toString(array));
        System.out.println("value:" + 56 + " found at index = " + Arrays.binarySearch(array, 56)); // Print index = 2
        System.out.println("value:" + 20 + " found at index = " + Arrays.binarySearch(array, 20)); // Print index = 0

        //Arrays.copyOf => void copyOf(originalArray, newLength)
        System.out.println("--------- " + "Arrays.copyOf" + " --------");
        int[] arrayCopy = { 65, 20, 34, 56, 78, 97 };
        System.out.println("Integer Array: "+ Arrays.toString(arrayCopy)); // Integer Array: [65, 20, 34, 56, 78, 97]
        System.out.println("New Arrays by copyOf method: "+ Arrays.toString(Arrays.copyOf(arrayCopy, 10))); // Print [65, 20, 34, 56, 78, 97, 0, 0, 0, 0]

        //Arrays.sort => void sort(int[] array)
        System.out.println("--------- " + "Arrays.sort" + " --------");
        System.out.println("Array before sort " + Arrays.toString(arrayCopy));
        Arrays.sort(arrayCopy);
        System.out.println("Array after sort " + Arrays.toString(arrayCopy));

        //Arrays.parallelSort => void parallelSort(int[] array)
        int[] arrayParallelSort = { 65, 20, 34, 56, 78, 97 };
        Arrays.parallelSort(arrayParallelSort);
        System.out.println(Arrays.toString(arrayParallelSort));
    }

    public static void cloningMultidimensionalArray(){
        System.out.println("-----------" + " cloningMultidimensionalArray " + "----------");
        int[][] intArray = {{1, 2, 3},{4,5}};
        int[][] cloneArray = intArray.clone();
        System.out.println(intArray == cloneArray); // prints false as a deep copy is created
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }

    public static void main(String[] args) {
        cloningOneDimensionalArray();
        cloningMultidimensionalArray();
        printArraysClassMethods();
    }
}
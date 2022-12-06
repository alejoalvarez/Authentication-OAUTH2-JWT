package arrays;


public class CloningArray {
    public static void main(String[] args){
        // Dimensional array
        // When cloning a single one-dimensional array, such as Object[], a deep copy is made, with the new array containing copies of the original array's elements rather than references
        int[] intArray1 = {1, 2, 3};
        int[] cloneArray1 = intArray1.clone();
        // prints false as a deep copy is created
        System.out.println(intArray1 == cloneArray1);
        for (int j : cloneArray1) {
            System.out.print(j + " ");
        }

        // MultidimensionalArray
        // a clone of a multidimensional array (such as Object[][]) is a "shallow copy", meaning that only a new array is created with each element array as a reference to an original element array, but subfields are shared.
        int[][] intArray2 = {{1, 2, 3},{4,5}};

        int[][] cloneArray2 = intArray2.clone();
        // prints true as a deep copy is created
        System.out.println(intArray2 == cloneArray2);
        System.out.println(intArray2[0] == cloneArray2[0]);
        System.out.println(intArray2[1] == cloneArray2[1]);
    }
}

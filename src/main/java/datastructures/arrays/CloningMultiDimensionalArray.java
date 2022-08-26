package datastructures.arrays;

public class CloningMultiDimensionalArray {

    public static void main(String [] args){
        int[][] intArray = {{1, 2, 3},{4,5}};
        int[][] cloneArray = intArray.clone();

        // prints true as a deep copy is created
        System.out.println(intArray == cloneArray);
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }
}

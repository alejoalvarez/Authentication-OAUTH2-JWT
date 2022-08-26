package datastructures.arrays;

public class CloningOneDimensionalArray {


    public static void main(String []args){
        int[] intArray = {1, 2, 3};

        int[] cloneArray = intArray.clone();
        // prints false as a deep copy is created
        System.out.println(intArray == cloneArray);
        for (int j : cloneArray) {
            System.out.print(j + " ");
        }
    }
}

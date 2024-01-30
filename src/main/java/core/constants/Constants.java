package core.constants;

// Refers to values that do not change during program execution
public class Constants {

    public static final int NUMBER1 = 111;
    public static final double PI = 3.1416;
    public static final String NAME = "Alejo";
    public static final boolean CHECK = true;

    public static void printConstants(){
        // NUMBER1 = 11; // not allow
        // PI = 314165 // not allow
        System.out.println("Constant int: " + NUMBER1);
        System.out.println("Constant double: " + PI);
        System.out.println("Constant String: " + NAME);
        System.out.println("Constant boolean: " + CHECK);
    }

    public static void main(String[] args) {
        System.out.println("--------------" + " Printing Constants " + "--------------");
        printConstants();
    }
}
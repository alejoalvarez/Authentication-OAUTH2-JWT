package variablesTypes;

/**
 * Variable types - https://github.com/alejoalvarez/Java/blob/main/Java%20Core/Variables.md
 * 1- Local variable
 * 2- Instance variable
 * 3- Static variable
 */
public class VariableTypes {

    public static int result2 = 6; // static variable
    int result = 8; // Instance variable

    public void method1(){
        int number1 = 5; // local variable
        int number2 = 5; // local variable
        int result = number1 + number2;
        System.out.println("VariablesTypes -> LocalVariables: " + result); // Print 10
    }

    public void method2(){
        System.out.println("VariablesTypes -> InstanceVariables: " + result); // Print 8
    }
}

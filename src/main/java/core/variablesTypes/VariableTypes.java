package core.variablesTypes;

/**
 * Variable types - https://github.com/alejoalvarez/Java/blob/main/Java%20Core/Variables.md
 * 1- Local variable
 * 2- Instance variable
 * 3- Static variable
 */
public class VariableTypes {

    public static void main(String[] args) {
        System.out.println("--------------" + " Types Variables " + "--------------");
        VariableTypes variableTypes = new VariableTypes();
        variableTypes.printLocalVariable(); // Print 10
        variableTypes.InstanceVariables(); // Print 8
        System.out.println("VariablesTypes -> StaticVariables: " + VariableTypes.result2); // Print 6
    }

    public static int result2 = 6; // static variable
    int result = 8; // Instance variable

    public void printLocalVariable(){
        int number1 = 5; // local variable
        int number2 = 5; // local variable
        int result = number1 + number2;
        System.out.println("VariablesTypes -> LocalVariables: " + result); // Print 10
    }

    public void InstanceVariables(){
        System.out.println("VariablesTypes -> InstanceVariables: " + result); // Print 8
    }
}

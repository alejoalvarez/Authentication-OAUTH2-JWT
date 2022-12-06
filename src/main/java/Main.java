import constants.Constants;
import datatypes.DataTypes;
import dates.Dates;
import datastructures.linkedlist.singlylinkedlist.SinglyLinkedList;
import methods.Methods;
import operators.Operators;
import string.StringClass;
import variablesTypes.VariableTypes;

class Main{

    public static void main (String[] args){

        // Types Variable
        System.out.println("--------------" + " Types Variables " + "--------------");
        VariableTypes variableTypes = new VariableTypes();
        variableTypes.method1(); // Print 10
        variableTypes.method2(); // Print 8
        int staticVariable = VariableTypes.result2;
        System.out.println("VariablesTypes -> StaticVariables: " + staticVariable); // Print 6

        // Constants
        System.out.println("--------------" + " Constants " + "--------------");
        Constants constants = new Constants();
        constants.printConstants(); // Print 333
        System.out.println("Constants1: " + Constants.NUMBER1); // Print 111

        // DataTypes
        System.out.println("--------------" + " DataTypes " + "--------------");
        DataTypes dataTypes = new DataTypes();
        dataTypes.printPrimitiveTypes();
        dataTypes.printObjectTypes();

        // Operators
        System.out.println("--------------" + " Operators " + "--------------");
        Operators operators = new Operators();
        operators.arithmeticOperator();
        operators.assignmentOperator();

        // Methods
        System.out.println("--------------" + " Methods " + "--------------");
        Methods methods = new Methods();
        methods.overloadingMethods(1); // Overloading with int parameter: 1
        methods.overloadingMethods("Hello"); // Overloading with String parameter:Hello
        Methods.staticMethod("Hello from static methods"); // Hello from static methods

        // Dates
        System.out.println("--------------" + " Dates " + "--------------");
        Dates dates = new Dates();
        dates.printLocalDate();
        dates.printLocalTime();
        dates.printLocalDateTime();
        dates.printDateFormatter();

        // StringClass
        System.out.println("--------------" + " String Class " + "--------------");
        StringClass stringClass = new StringClass(); // Text1
        stringClass.printImmutableString(); // Text1 test2
        stringClass.printCompareStringWithEquals("Alejo1", "Alejo1"); // both string are equals with EQUALS
        stringClass.printCompareStringWithEquals("Alejo1", "Alejo11"); // strings are different with EQUALS
        stringClass.printCompareStringWithEqualIgnoreCase("Alejo1", "alejo1"); // both string are equals with equalIgnoreCase
        stringClass.printCompareStringWithEqualIgnoreCase("Alejo1", "Alejo2"); // strings are different with equalIgnoreCase
        stringClass.printCompareStringWithEqualEqual("Alejo1", "Alejo1"); // compare with (==) string1 and string2: is equal
        stringClass.printCompareStringWithEqualEqual("Alejo1", "alejo1"); // compare with (==) string1 and string2: is false
        stringClass.printCompareStringWithEqualEqual("Alejo11", "Alejo11"); // compare with (==) string11 and string22: is false
        stringClass.printSubString();
        stringClass.printStringClassMethods();
        stringClass.printStringBufferClassMethods();

        // Array
        System.out.println("--------------" + " Array " + "--------------");
        //ArraysExample arraysExample = new ArraysExample();
        //arraysExample.fillNumbers();

        // Singly linked list
        System.out.println("--------------" + " Singly Linked List " + "--------------");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(4);

        singlyLinkedList.printSinglyLinkedList();


    }
}
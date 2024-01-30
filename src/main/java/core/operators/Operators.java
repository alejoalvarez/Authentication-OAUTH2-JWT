package core.operators;

public class Operators {

    double number1 = 2;
    double number2 = 5;

    //Arithmetic operator
    public void arithmeticOperator(){

        double addition = number1 + number2;
        System.out.println("Operator - ArithmeticOperatorsAddition: " + addition); // Print 7.0
        double subtraction = number1 - number2;
        System.out.println("Operator - ArithmeticOperatorsSubtraction: " + subtraction); // Print -3.0
        double multiplication = number1 * number2;
        System.out.println("Operator - ArithmeticOperatorsMultiplication: " + multiplication); // Print 10.0
        double division = number1 / number2;
        System.out.println("Operator - ArithmeticOperatorsDivision: " + division); // Print 0.4
        double modulus = number1 % number2;
        System.out.println("Operator - ArithmeticOperatorsModulus: " + modulus); // Print 2.0

        System.out.println("Operator - ArithmeticOperatorsIncrement++: " + number1++); // Print 2.0
        System.out.println("Operator - ArithmeticOperatorsIncrement++: " + number1); // Print 3.0

        System.out.println("Operator - ArithmeticOperators++Increment: " + ++number2); // Print 6.0
        System.out.println("Operator - ArithmeticOperators++Increment: " + number2); // Print 6.0

        System.out.println("Operator - ArithmeticOperatorsDecrement++: " + number1--); // Print 3.0
        System.out.println("Operator - ArithmeticOperatorsDecrement++: " + number1); // Print 2.0

        System.out.println("Operator - ArithmeticOperators--Decrement: " + --number2); // Print 5.0
        System.out.println("Operator - ArithmeticOperators--Decrement: " + number2); // Print 5.0
    }

    // Assignment operator
    public void assignmentOperator(){

        number1 = 5;
        number2 = 4;
        int number3 = 3;
        System.out.println("Operator - AssignmentOperators=: " + number1); // Print 5.0
        number1+=5; // number1 = number1 + 5;
        System.out.println("Operator - AssignmentOperators+=: " + number1); // Print 10.0
        number2-=6; //number2 = number2 - 6;
        System.out.println("Operator - AssignmentOperators-=: " + number2); // Print -2.0
        number1*=2; //number1 = number1 * 2;
        System.out.println("Operator - AssignmentOperators*=: " + number1); // Print 20.0
        number2/=5; //number2 = number2/5;
        System.out.println("Operator - AssignmentOperators/=: " + number2); // Print -0.4
        number1/=5; //number1 = number1%5
        System.out.println("Operator - AssignmentOperators%=: " + number1); // Print 4.0
        number3&=4; //number3= number3 & 5
        System.out.println("Operator - AssignmentOperators&=: " + number3); // Print 0
    }

    public static void main(String[] args) {
        System.out.println("--------------" + " Printing Operators " + "--------------");
        Operators operators = new Operators();
        operators.arithmeticOperator();
        operators.assignmentOperator();
    }
}

package operators;

public class Operators {

    double number1 = 2;
    double number2 = 5;

    //Arithmetic operator
    public void arithmeticOperator(){

        double addition = number1 + number2;
        System.out.println("Operator - ArithmeticOperatorsAddition: " + addition);
        double subtraction = number1 - number2;
        System.out.println("Operator - ArithmeticOperatorsSubtraction: " + subtraction);
        double multiplication = number1 * number2;
        System.out.println("Operator - ArithmeticOperatorsMultiplication: " + multiplication);
        double division = number1 / number2;
        System.out.println("Operator - ArithmeticOperatorsDivision: " + division);
        double modulus = number1 % number2;
        System.out.println("Operator - ArithmeticOperatorsModulus: " + modulus);

        System.out.println("Operator - ArithmeticOperatorsIncrement++: " + number1++); // Print 2
        System.out.println("Operator - ArithmeticOperatorsIncrement++: " + number1); // Print 3

        System.out.println("Operator - ArithmeticOperators++Increment: " + ++number2); // 6
        System.out.println("Operator - ArithmeticOperators++Increment: " + number2); // 6

        System.out.println("Operator - ArithmeticOperatorsDecrement++: " + number1--); // Print 3
        System.out.println("Operator - ArithmeticOperatorsDecrement++: " + number1); // Print 2

        System.out.println("Operator - ArithmeticOperators--Decrement: " + --number2); // 5
        System.out.println("Operator - ArithmeticOperators--Decrement: " + number2); // 5
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
}

package core.methods;

public class Methods{

    /**
     * Overloading
     * Multiple methods can have the same name with different parameters:
     */
    public void overloadingMethods(int message){
        System.out.println("Overloading with int parameter: " +  message);
    }

    public void overloadingMethods(String message){
        System.out.println("Overloading with String parameter: " + message);
    }

    /**
     * Static vs Non-static
     */
    // Static method, which means that it can be accessed without creating an object of the class, unlike public
    public static void staticMethod(String message){
        System.out.println(message);
    }

    // Non-static, it is necessary create an instance for call the methods
    public void nonStaticMethod(String message){
        System.out.println(message);
    }

    /**
     * Constructor method
     * A constructor in Java is a special method that is used to initialize objects
     * The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
     */
    public Methods(){

    }

    /**
     * It is where our application starts
     * public static void main(String args[]){ }
     * public static void main(String [] args){ }
     * public static void main(String… args){ }
     */
    public static void main(String[] args) {
        System.out.println("--------------" + " Methods " + "--------------");
        Methods methods = new Methods();
        methods.overloadingMethods(1); // Overloading with int parameter: 1
        methods.overloadingMethods("Hello"); // Overloading with String parameter:Hello
        staticMethod("Hello from static method"); // Hello from static method

        Methods method = new Methods();
        method.nonStaticMethod("Hello from non-static method");
    }

}

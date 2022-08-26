package methods;

public class Methods{

    // Multiple methods can have the same name with different parameters:

    public void overloadingMethods(int message){
        System.out.println("Overloading with int parameter: " +  message);
    }

    public void overloadingMethods(String message){
        System.out.println("Overloading with String parameter:" + message);
    }

    // static method
    public synchronized static void staticMethod(String message){
        System.out.println(message);
    }
}

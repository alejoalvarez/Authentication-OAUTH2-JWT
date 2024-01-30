package core.string;

public class StringBufferClass {

    // StringBuffer methods
    // Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same
    // as String class except it is mutable i.e. it can be changed.
    public void printStringBufferClassMethods(){

        // append()
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.append("World"); //now original string is changed
        System.out.println(sb1); //prints Hello World

        // insert()
        StringBuffer sb2 = new StringBuffer("Hello ");
        sb2.insert(1,"World");//now original string is changed
        System.out.println(sb2);//prints HWorldello

        // delete()
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.delete(1,3);
        System.out.println(sb3);//prints Hlo

        // reverse()
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.reverse();
        System.out.println(sb4);//prints olleH

        // capacity()
        // The capacity() method of StringBuffer class returns the current capacity of the buffer.
        // The default capacity of the buffer is 16. If the number of character increases from its current capacity,
        // it increases the capacity by (old capacity2)+2. For example if your current capacity is 16, it will be (162)+2=34.
        StringBuffer sb5=new StringBuffer();
        System.out.println(sb5.capacity()); //default 16
        sb5.append("Hello");
        System.out.println(sb5.capacity()); //now 16
        sb5.append("java is my favourite language");
        System.out.println(sb5.capacity()); //now (16*2)+2=34 i.e (old capacity*2)+2

        // ensureCapacity()
        // The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity.
        // If it is greater than the current capacity, it increases the capacity by (old capacity2)+2.
        // For example if your current capacity is 16, it will be (162)+2=34.
        StringBuffer sb6=new StringBuffer();
        System.out.println(sb6.capacity());//default 16
        sb6.append("Hello");
        System.out.println(sb6.capacity());//now 16
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb6.ensureCapacity(10);//now no change
        System.out.println(sb6.capacity());//now 34
        sb6.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb6.capacity());//now 70
    }

    public static void main(String[] args) {
        StringBufferClass stringClass = new StringBufferClass(); // Text1
        stringClass.printStringBufferClassMethods();
    }
}
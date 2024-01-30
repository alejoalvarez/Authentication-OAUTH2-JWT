package core.string;

public class StringBuilderClass {

    //Java StringBuilder class is similar to the StringBuffer class which holds a sequence of mutable
    //Strings but is more versatile than StringBuffer class because it provides more modification features.

    // StringBuilder methods
    public void printStringBuilderClassMethods(){

        // append()
        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append("World");//now original string is changed
        System.out.println(sb1);//prints Hello World

        // insert()
        StringBuilder sb2 = new StringBuilder("Hello ");
        sb2.insert(1,"World");//now original string is changed
        System.out.println(sb2);//prints HWorldello

        // replace()
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1,3,"World");
        System.out.println(sb3); //prints HWorldlo

        // delete()
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1,3);
        System.out.println(sb4);//prints Hlo

        // reverse()
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.reverse();
        System.out.println(sb5); //prints olleH

        // capacity()
        StringBuilder sb6 = new StringBuilder();
        System.out.println(sb6.capacity());//default 16
        sb6.append("Hello");
        System.out.println(sb6.capacity());//now 16
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

        // ensureCapacity()
        StringBuilder sb7 = new StringBuilder();
        System.out.println(sb7.capacity());//default 16
        sb7.append("Hello");
        System.out.println(sb7.capacity());//now 16
        sb7.append("java is my favourite language");
        System.out.println(sb7.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb7.ensureCapacity(10);//now no change
        System.out.println(sb7.capacity());//now 34
        sb7.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb7.capacity());//now 70
    }
}
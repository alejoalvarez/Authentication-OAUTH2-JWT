package string;

import java.util.Locale;

public class StringClass {

    public void exampleString(){
        char[] chars = {'j', 'a', 'v', 'a'};
        String characters = new String(chars); // equals String chars = "java";
    }

    public void printImmutableString(){
        String text = "Text1";
        text.concat(" text2");
        System.out.println("String immutable: "+ text); // Print Test1 because String is immutable

        String text2 = "Text1";
        text2 = text2.concat(" text2");
        System.out.println("String mutable: " + text2); // Print Test1 test2
    }

    public void printCompareStringWithEquals(String string1, String string2){
        if (string1.equals(string2)){
            System.out.println("both string are equals with EQUALS");
        }else{
            System.out.println("strings are different with EQUALS");
        }
    }

    public void printCompareStringWithEqualIgnoreCase(String string1, String string2){
        if (string1.equalsIgnoreCase(string2)){
            System.out.println("both string are equals with equalIgnoreCase");
        }else{
            System.out.println("strings are different with equalIgnoreCase");
        }
    }

    // == compare reference not value
    public void printCompareStringWithEqualEqual(String string11, String string22){
        String string33 = new String("Alejo11");
        if (string11 == string22) {
            System.out.println("compare with (==) string11 and string22: is equal");
        }else{
            System.out.println("compare with (==) string11 and string22: is different");
        }

        if (string11 == string33) {
            System.out.println("compare with (==) string11 and string22: is true");
        }else{
            System.out.println("compare with (==) string11 and string22: is false");
        }
    }

    // substring()
    public void printSubString(){
        String name = "Alejo";
        System.out.println(name.substring(0,2)); // Al
    }

    // String class methods
    public void printStringClassMethods(){
        String name = "Alejo Alvarez";
        System.out.println(name.toUpperCase()); // ALEJO ALVAREZ
        System.out.println(name.toLowerCase()); // alejo alvarez
        System.out.println(name); // Alejo Alvarez
        System.out.println(name.trim()); // The string trim() method eliminates white spaces before and after string.
        System.out.println(name.startsWith("Al")); // true
        System.out.println(name.endsWith("z"));
        System.out.println(name.charAt(0)); // A
        System.out.println(name.charAt(3)); // j
        System.out.println(name.length()); // 13

        // intern
        // A pool of strings, initially empty, is maintained privately by the class String.
        // When the intern method is invoked, if the pool already contains a string equal
        // to this String object as determined by the equals(Object) method, then the string from the pool is returned.
        // Otherwise, this String object is added to the pool and a reference to this String object is returned.
        String string1 = new String("Alejo");
        String string2 = string1.intern();
        System.out.println(string2); //Alejo

        // valueOf()
        // The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
        int a = 11;
        String s = String.valueOf(a);
        System.out.println( s + 11); // 1111

        // replace()
        String s1="Java is the best programming language, in Java exist a lot of information in web";
        String replaceString=s1.replace("Java","Xaxa"); //replaces all occurrences of "Java" to "Xaxa"
        System.out.println(replaceString);
    }

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

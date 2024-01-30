package core.string;

public class StringClass {

    public void exampleString(){
        char[] chars = {'j', 'a', 'v', 'a'};
        String characters = new String(chars); // equals String chars = "java";
    }

    public void printImmutableString(){
        System.out.println("--------- " + "Print Immutable String" + " ----------");
        String text = "Text1";
        System.out.println("Original string: " + text);
        text.concat(" text2");
        System.out.println("String immutable after concat : "+ text); // Print Test1 because String is immutable

        System.out.println("--------- " + "Print mutable String" + " ----------");
        String text2 = "Text1";
        System.out.println("Original string: " + text2);
        text2 = text2.concat(" text2");
        System.out.println("String mutable after concat: " + text2); // Print Test1 test2
    }

    public void printCompareStringWithEquals(String string1, String string2){
        System.out.println("--------- " + "Print comparable with equals" + " ----------");
        System.out.println("String1 " + string1);
        System.out.println("String2 " + string2);
        if (string1.equals(string2)){
            System.out.println("both string are equals with EQUALS");
        }else{
            System.out.println("strings are different with EQUALS");
        }
    }

    public void printCompareStringWithEqualIgnoreCase(String string1, String string2){
        System.out.println("--------- " + "Print comparable with equalsIgnoreCase" + " ----------");
        System.out.println("String1 " + string1);
        System.out.println("String2 " + string2);
        if (string1.equalsIgnoreCase(string2)){
            System.out.println("both string are equals with equalIgnoreCase");
        }else{
            System.out.println("strings are different with equalIgnoreCase");
        }
    }

    // == compare reference not value
    public void printCompareStringWithEqualEqual(String string1, String string2){
        System.out.println("--------- " + "Print comparable with ==" + " ----------");
        System.out.println("String1: " + string1);
        System.out.println("String2: " + string2);
        String string3 = "Alejo11";
        System.out.println("String3: " + string3);
        if (string1 == string2) {
            System.out.println("compare with (==) string1 and string2: is equal");
        }else{
            System.out.println("compare with (==) string1 and string2: is different");
        }

        if (string1 == string3) {
            System.out.println("compare with (==) string1 and string3: is equal");
        }else{
            System.out.println("compare with (==) string1 and string3: is different");
        }
    }

    // substring()
    public void printSubString(){
        System.out.println("--------- " + "Print subString" + " ----------");
        String name = "Alejo";
        System.out.println("String before substring: " + name);
        System.out.println("String after substring: " + name.substring(0,2)); // Al
    }

    // String class methods
    public void printStringClassMethods(){
        System.out.println("--------- " + "Print String Class Methods" + " ----------");
        String name = "Alejo Alvarez";
        System.out.println("Original String: " + name);
        System.out.println("toUpperCase(): " + name.toUpperCase()); // ALEJO ALVAREZ
        System.out.println("toLowerCase(): " + name.toLowerCase()); // alejo alvarez
        System.out.println("Original Immutable String: " + name); // Alejo Alvarez
        System.out.println("trim(): " + name.trim()); // The string trim() method eliminates white spaces before and after string.
        System.out.println("startWith(): " + name.startsWith("Al")); // true
        System.out.println("endsWith(): " + name.endsWith("z"));
        System.out.println("charAt(0): " + name.charAt(0)); // A
        System.out.println("charAt(3): " + name.charAt(3)); // j
        System.out.println("length(): " + name.length()); // 13

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

    public static void main(String[] args) {
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
    }
}
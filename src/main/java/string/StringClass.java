package string;

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
}

package core.regularexpressions;

import java.util.regex.Pattern;

public class PatternRegExp {

    public static void main(String[] args) {
        boolean match1 = Pattern.compile("a.e").matcher("ale").matches(); // . represent a single character
        System.out.println(match1);

        boolean match2 = Pattern.matches("Ja..", "Java"); // .. represent 2 characters
        System.out.println(match2);

        boolean match3 = Pattern.matches("Al...", "Alejo"); //... represent 3 characters
        System.out.println(match3);

        String str = "aaa";
        System.out.println("String match method: " + str.matches(".a"));
        System.out.println("Pattern matches method: " + Pattern.matches("a.a", str));
    }
}

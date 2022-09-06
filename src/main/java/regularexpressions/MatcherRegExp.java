package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherRegExp {

    public static void main(String[] args) {

        //Case Sensitive Searching
        Pattern pattern = Pattern.compile("Study");
        Matcher match = pattern.matcher("StudyJavaStudyAlejo");
        System.out.println("Case Sensitive Searching:");
        while (match.find()){     // Printing start and end indexes of the pattern in text
            System.out.println("Pattern found from " + match.start() + " to " + (match.end() - 1) );
        }

        //Case Insensitive Searching
        Pattern pattern1= Pattern.compile("al", Pattern.CASE_INSENSITIVE);
        Matcher match1 = pattern1.matcher("StudyJavaStudyAlejo");
        System.out.println("\nCase InSensitive Searching:");
        while (match1.find()) {     // Printing start and end indexes of the pattern in text
            System.out.println("Pattern found from " + match1.start() + " to " + (match1.end() - 1));
        }

        // Splitting the String
        String text = "Study@Alejo#Example&Of%Java";
        String delimiter = "\\W";
        Pattern pattern2 = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = pattern2.split(text);
        System.out.println("\nSplitting the String around special characters:");
        for (String temp: result) {
            System.out.println(temp);
        }

        // Replacing the String
        System.out.println("\nReplacing the Strings with other String:");
        String regex = "Python";
        String inputString = "StudyAlejo Example2 Tutorial. " + "It is a Example2 Tutorial";
        String replaceString = "Java";
        Pattern pattern3 = Pattern.compile(regex); // get a Pattern object
        Matcher matcher = pattern3.matcher(inputString); // get a matcher object

        System.out.println("Using replaceFirst() Method");
        inputString = matcher.replaceFirst( replaceString);
        System.out.println(inputString);

        System.out.println("\nUsing replaceAll() Method");
        inputString = matcher.replaceAll( replaceString);
        System.out.println(inputString);
    }
}

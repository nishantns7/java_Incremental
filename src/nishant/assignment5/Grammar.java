package nishant.assignment5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Grammar {
/*
* Checks whether a sentence input by the user begins with an uppercase character and ends with a period
* Uses java.util.regex to store the regular expression as a Pattern object, and then compare using the Matcher class
 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence to be checked");         //User Prompt
        String sentence = br.readLine();
        if(grammarChecker(sentence))
            System.out.println("Sentence begins with an uppercase character and ends with a period.");
        else
            System.out.println("Sentence does not begin with an uppercase character and/or end with a period.");
    }

    /*
    * Takes a string as argument and checks if it matches with the set regular expression
    * Returns true if it matches, false otherwise
    * @param str String containing the user input to be checked for a match
     */
    public static boolean grammarChecker(String str) {

        Pattern pattern = Pattern.compile("[A-Z].*\\.");
        Matcher m = pattern.matcher(str);           //Comparison with the regular expression
        return m.matches();                         //Returns true if the sentence matches the pattern
    }
}

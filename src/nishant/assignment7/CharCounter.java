package nishant.assignment7;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class CharCounter {
/*
* Counts the number of alphabets in a text file using HashMap
* Writes the result back into a specified file
 */
    public static void main(String[] args) throws IOException {

        String text = getTextFromFile(args[0]);
        HashMap<Character, Integer> count = charCount(text);
        PrintWriter writer = new PrintWriter( "/home/zadmin/Desktop/Output.txt", "UTF-8");
        for(char c : count.keySet())
            if (c != '\n') {
                writer.println("The character " + c + " occurs " + count.get(c) + " times.");
            }
        writer.close();
    }

    /*
    * Returns the text in the file specified by the user as a String
     */
    public static String getTextFromFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    /*
    * Takes a String as input and counts the occurrence of each character in the String
    * Returns a HashMap containing the number of occurrences of each character
    * @param text String from the text file input by the user
     */
    public static HashMap<Character, Integer> charCount(String text) {

        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : text.toLowerCase().toCharArray()) {
            if(count.get(c) == null)
                count.put(c, 1);
            else
                count.put(c, count.get(c) + 1);
        }
        return count;
    }
}

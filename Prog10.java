import java.util.*;
public class Prog10 {
    public static void main(String[] args) {
        String input = "Hello, World! How are you?";
        StringTokenizer t = new StringTokenizer(input);
        StringBuilder revStr = new StringBuilder();
        while (t.hasMoreTokens()) {
            String word = t.nextToken();
            String reversedWord = reverseString(word);
            revStr.append(reversedWord).append(" ");
        }
        revStr.deleteCharAt(revStr.length() - 1);
        System.out.println("Reversed string: " + revStr);
    }

    static String reverseString(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return rev.toString();
    }
}








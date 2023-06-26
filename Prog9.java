import java.util.StringTokenizer;

public class Prog9 {
    public static void main(String[] args) {
        String input = "This is a sample string to tokenize.";
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
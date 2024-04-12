import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        String inputString = "This - is - a - sample - string - tokenized - using - StringTokenizer";
        String delimiter = " -";
        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}

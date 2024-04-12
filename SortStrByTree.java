import java.util.*;

public class SortStrByTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = sorted_characters(s);
        System.out.println(result);
    }

    public static String sorted_characters(String s) {
        TreeSet<Character> distinctChars = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            distinctChars.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : distinctChars) {
            result.append(c);
        }
        return result.toString();
    }
}

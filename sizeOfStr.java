import java.util.*;

public class sizeOfStr {
    static int sizeOf(String str) {
        int i = str.length() - 1;

        while (str.charAt(i) != ' ') {
            i--;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        for (int x = sizeOf(str) + 1; x < str.length(); x++) {
            System.out.print(str.charAt(x));

        }
        sc.close();

    }
}
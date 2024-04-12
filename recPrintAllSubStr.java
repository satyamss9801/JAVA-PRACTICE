import java.util.Scanner;

public class recPrintAllSubStr {

    static void printSubstrings(String str, int idx, String sub) {
        if (idx == str.length()) {
            System.out.print(sub + " ");
        } else {
            // Include the next character
            printSubstrings(str, idx + 1, sub + str.charAt(idx));

            // Exclude the next character
            printSubstrings(str, idx + 1, sub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        printSubstrings(str, 0, "");
    }
}

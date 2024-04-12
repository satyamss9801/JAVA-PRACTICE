import java.util.Scanner;

public class Anagram {
    static final int CHAR = 256;

    static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int count[] = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;

        }

        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0)
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST STRING ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean res = areAnagram(s1, s2);
        if (res == true) {
            System.out.println("NUMBER IS ANAGRAM");
        } else {
            System.out.println("NOT A ANAGRAM");
        }

    }

}

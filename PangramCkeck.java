import java.util.*;

public class PangramCkeck {
    static void pcheck(String str) {
        ArrayList<Character> ch = new ArrayList<Character>();
        int i = 0;

        if (str.length() < 26) {
            System.out.println("not a panagram");
            return;
        }

        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                i++;

            } else {
                if (ch.isEmpty() == true) {
                    ch.add(i, str.charAt(i));
                } else {
                    for (int j = 0; j < ch.size(); j++) {
                        if (ch.contains(str.charAt(i))) {
                            break;
                        } else {
                            ch.add(str.charAt(i));
                        }
                    }
                }

            }

        }
        if (ch.size() >= 25) {
            System.out.println("NUMBER IS PANGRAM");
        } else {
            System.out.println("NOT A PANGRAM");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING");
        String str = sc.nextLine();
        pcheck(str);
    }

}

import java.util.*;

public class StringIsBalenced {
    static boolean MatchStr(char a, char b) {
        return (a == '[' && b == ']' || a == '(' && b == ')' || a == '{' && b == '}');

    }

    boolean IsBalence(String str) {
        Deque<Character> list = new ArrayDeque<Character>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '[' || x == '{' || x == '(') {
                list.push(x);
            } else {
                if (list.isEmpty() == true) {
                    return false;
                } else {
                    if ((MatchStr(list.peek(), x) == false))
                        return false;
                    else {
                        list.pop();
                    }

                }

            }

        }
        return (list.isEmpty() == true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any  String of Brakets");
        String str = sc.nextLine();
        StringIsBalenced al = new StringIsBalenced();
        if (al.IsBalence(str) == true) {
            System.out.println("VALID STRING ");
        } else {
            System.out.println("Invalid String");
        }

    }

}

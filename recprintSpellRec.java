import java.util.Scanner;

public class recprintSpellRec {

    static void printSpell(int n, String str[]) {
        if (n <= 0)
            return;

        printSpell(n / 10, str);
        int num = n % 10;
        System.out.print(str[num] + " ");

    }

    public static void main(String[] args) {
        String str[] = { "zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        printSpell(n, str);
    }

}

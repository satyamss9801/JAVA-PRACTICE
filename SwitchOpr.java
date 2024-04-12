import java.util.Scanner;

public class SwitchOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER OPERATION YOU WANT TO DO LIKE: * , + , - , %");
        String s = sc.next();
        System.out.println("ENTER TWO NUMBERS");
        int x = sc.nextInt();
        int y = sc.nextInt();

        switch (s) {
            case "*":

                System.out.println("RESULT :" + (x * y));

                break;
            case "-":
                if (x > y) {
                    System.out.println("RESULT :" + (x - y));

                } else {
                    System.out.println("RESULT :" + (y - x));
                }

                break;

            case "+":
                System.out.println("RESULT :" + (x + y));

                break;
            case "%":
                float z = x / y;
                System.out.println("RESULT :" + z);

                break;

            default:
                System.out.println("WRONG CASE");
                break;
        }

    }

}

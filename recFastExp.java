import java.util.Scanner;

public class recFastExp {
    static int exp(int n) {
        if (n == 0) 
            return 1;

        int num = exp(n / 2);
        //Condition of Recursion Returnned on Every Steps
        if ((n & 1) == 0) {
            return num * num;
        } else {
            return 2 * num * num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF POWER YOU WANT TO FIND IN 2^n");
        int n = sc.nextInt();
        
        System.out.printf("VALUE OF 2^N IS :  " + exp(n));

    }

}

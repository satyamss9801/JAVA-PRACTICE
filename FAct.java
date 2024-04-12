import java.util.*;

public class Fact {

    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
       
        int fact_n = n *  calcfactorial(n - 1);;
        return fact_n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER ....");
        int n = sc.nextInt();

        int ans = calcfactorial(n);
        System.out.println("Factorial value of  " + n + " = " + ans);
    }

}
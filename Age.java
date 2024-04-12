import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTYER YOUR AGE");
        int x = sc.nextInt();

        if (x >= 18)
            System.out.println("GO For Vote");
        else
            System.out.println(" Sorry : Your Age is Below 18");

    }

}

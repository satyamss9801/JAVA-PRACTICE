import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DIsplay {
    int roll;
    String name;
    float fee;

    public DIsplay(int roll, String name, float fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;

    }

    public static void main(String[] args) {
        List<DIsplay> al = new ArrayList<DIsplay>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Number of users");
        int x = sc.nextInt();
        if (x > 0) {
            for (int y = 1; y <= x; y++) {
                sc.nextLine();

                System.out.printf("Enter Name of student%d :", y);
                String name = sc.nextLine();

                System.out.printf("Enter Roll of Student%d :", y);
                int roll = sc.nextInt();

                System.out.printf("Enter Fee Paid%d :", y);
                float fee = sc.nextFloat();

                al.add(new DIsplay(roll, name, fee));

            }
        } else {
            System.out.println("Invalid Input");
        }
        for (DIsplay obj : al)
            System.out.println("ROLL :" + obj.roll + " NAME : " + obj.name + " FEE PAID : " + obj.fee);
    }

}

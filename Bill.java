import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Three Items Price");
        int itm1 = sc.nextInt();
        int itm2 = sc.nextInt();
        int itm3 = sc.nextInt();

        System.out.println("**************************BILL***************************");
        int total = itm1 + itm2 + itm3;

        if (total >= 3000 && total < 5000) {
            int x = total - ((10 * total) / 100);
            System.out.println("\n ITEM1 RS :" + itm1 + "\n ITEM2 RS :" + itm2 + "\n ITEM3 RS :" + itm3
                    + "\n Total Amount Rs :" + total + "\n CONGRATULATIONS YOU GOT 10% DISCOUNT "
                    + "\n Payble Amount RS : " + x);
        } else {
            if (total >= 5000) {
                int x = total - ((25 * total) / 100);
                System.out.println("\n ITEM1 RS :" + itm1 + "\n ITEM2 RS :" + itm2 + "\n ITEM3 RS :" + itm3
                        + "\n Total Amount Rs :" + total + "\n CONGRATULATIONS YOU GOT 25% DISCOUNT "
                        + "\n Payble Amount RS : "
                        + x);
            } else {

                System.out.println("\n ITEM1 RS :" + itm1 + "\n ITEM2 RS :" + itm2 + "\n ITEM3 RS :" + itm3
                        + "\n Total Amount Rs :" + total);
            }
        }
        System.out.println("THANK YOU FOR SOPPING WITH SSMART");
    }

}

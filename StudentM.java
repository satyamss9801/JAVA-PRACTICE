import java.util.Scanner;

public class StudentM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        String arr1[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks");
            arr[i] = sc.nextInt();
            if (arr[i] >= 90) {
                arr1[i] = "A";

            } else {
                if (arr[i] < 90 && arr[i] >= 70) {
                    arr1[i] = "B";

                } else {
                    if (arr[i] < 70 && arr[i] > 50) {
                        arr1[i] = "c";
                    } else {
                        arr1[i] = "D";
                    }
                }

            }
        }
        System.out.println("MARKS :" + " GRADE");
        for (int x = 0; x < 5; x++) {
            System.out.println(arr[x] + "  : " + arr1[x]);
        }
    }

}
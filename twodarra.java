import java.util.*;
public class twodarra{
    public static void main(String[] args) {
        int rows;
        int cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i =0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

          for(int i =0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
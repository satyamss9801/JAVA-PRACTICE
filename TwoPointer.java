import java.util.Arrays;

public class TwoPointer {
    static int Nonrepeted(int arr[],int target){
        Arrays.sort(arr);
        int x = Arrays.binarySearch(arr,target);
        if(x<0){
            System.out.println("Key Element Not Found");
        }
        int y = arr.length-1;
        while(x<=y){
            
        }
    }  
    public static void main(String[] args) {
        
    }
}

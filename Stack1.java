import java.util.*;

public class Stack1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> data = new Stack<>();

        System.out.print("Enter any element");

        int i = 0;
        for (i = 0; i < 5; i++) {
            data.push(sc.next());
        }

        System.out.println("value of statck");

        for (i = 0; i < 5; i++) {
            System.out.print(data.peek());
            data.pop();

        }

    }

}

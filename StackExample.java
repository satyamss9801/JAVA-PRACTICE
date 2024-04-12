import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");

        // Peeking at the top element
        String top = stack.peek();
        System.out.println("Top element: " + top);

        // Popping elements from the stack
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println("Popped element: " + element);
        }
    }
}

class StackN {
    int top;
    int capacity;
    int[] stack;

    StackN() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == capacity - 1;
    }

    public int push(int data) {
        return stack[++top] = data;
    }

    public int peek() {
        return stack[top];
    }

    public int pop() {
        return stack[top--];
    }

}

public class StackImplementation {
    public static void main(String[] args) {
        StackN st = new StackN();
        st.push(10);

    }
}

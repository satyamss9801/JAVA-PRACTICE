public class LinkedSt {
    private node top;

    private class node {
        private int data;
        private node prev;

        public node(int data) {
            this.data = data;
            this.prev = null;
        }

    }

    void push(int data) {
        node currnode = new node(data);
        if (top == null) {
            top = currnode;
        }
        currnode.prev = top;
        top = currnode;
    }

    int peek() {
        return top.data;
    }

    int pop() {
        int x = top.data;
        top = top.prev;
        return x;
    }

    public static void main(String[] args) {
        LinkedSt st = new LinkedSt();
        st.push(5);
        st.push(10);
        st.push(12);

        System.out.println("Top element : " + st.peek());
        st.pop();
        System.out.println("Top element : " + st.peek());

    }

}

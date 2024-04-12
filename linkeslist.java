class List {
    int data;
    List next;
    static List head = null;
    static List cur = null;

    List(int data) {
        this.data = data;
    }

    List(int i, boolean b) {

    }

    List addnode(int data) {

        List node = new List(data);
        if (head == null) {
            head = node;
            cur = head;
            return node;

        }

        cur.next = node;
        cur = node;
        return head;

    }

    void printList() {
        List st = head;
        if (head == null) {
            System.out.println("NO DATA FOUND");
            return;
        }
        while (st != null) {
            System.out.print(st.data + "  ");
            st = st.next;

        }

    }

    void updateList(int x, int y) {
        int count = 1;
        List st = head;

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        while (count != x) {

            st = st.next;
            count++;

        }
        st.data = y;

    }

    void deletList(int x) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        int count = 1;
        List st = head;
        List pre = null;

        while (count != x) {
            pre = st;
            st = st.next;
            count++;

        }
        pre.next = st.next;
        System.out.println("DATA DELETED " + st.data);
        st.next = null;

    }

    public void add(String string) {
    }
}

public class linkeslist {
    public static void main(String[] args) {
        List myList = new List(); // Create a new linked list

        myList.addnode(10);
        myList.addnode(20);
        myList.addnode(30);
        myList.addnode(40);

        System.out.println("Original List:");
        myList.printList();

    }
}

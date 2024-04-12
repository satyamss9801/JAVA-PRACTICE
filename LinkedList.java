class List {
    int data;
    List next;
    static List head = null;
    static List pre = null;

    List(int data) {
        this.data = data;
    }

    List addnode(int data) {

        List node = new List(data);
        if (head == null) {
            head = node;
            pre = head;
            return node;

        }

        pre.next = node;
        pre = node;
        return head;

    }

    void printList() {
        List st = head;
        if (head == null) {
            System.out.println("NO DATA FOUND");
            return;
        }
        while (st != null) {
            System.out.print(st.data);
            st = st.next;

        }

    }

    void updateList(int x, int y) {
        int count = 1;
        List st = head;

        while (count != x && count <= x) {
            st = st.next;

        }
        st.data = y;

    }

    void deletList(int x) {
        int count = 1;
        List st = head;
        List pre = null;

        while (count != x && count <= x) {
            pre = st;
            st = st.next;
            count++;

        }
        pre.next = st.next;
        System.out.println("DATA DELETED " + st.data);
        st.next = null;

    }
}

public class LinkedList {
    public static void main(String[] args) {
        List myList = new List(10); // Create a new linked list
        
        myList.addnode(20);
        myList.addnode(30);
        myList.addnode(40);
        
        System.out.println("Original List:");
        myList.printList(); // Output: 10203040
        
        myList.insertAfter(2, 25); // Insert 25 after the second node
        
        System.out.println("\nList after insertion:");
        myList.printList(); // Output: 1020253040
    }
}
You can add a new method called insertAfter(int position, int data) to the List class to insert data after a specific position in the linked list:

java
Copy code
class List {
    // ... existing code ...

    void insertAfter(int position, int data) {
        List newNode = new List(data);
        List st = head;
        int count = 1;

        while (count < position && st != null) {
            st = st.next;
            count++;
        }

        if (st == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = st.next;
        st.next = newNode;
    }

    // ... existing code ...
}
This insertAfter method will insert a new node with the specified data after the node at the given position. Keep in mind that this example assumes positions are 1-based. If positions are 0-based, you would need to adjust the comparison in the loop condition accordingly.






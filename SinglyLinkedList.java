public class SinglyLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void deleteData(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        return;

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(9);
        linkedList.insert(11);

        linkedList.display();
        System.out.print("Delete data : ");
        linkedList.deleteData(4);
        linkedList.display();

        linkedList.delete();
        System.out.print("Delete : ");
        linkedList.display();

        linkedList.insert(4);
        System.out.print("Insert data : ");
         linkedList.display();
    }
}

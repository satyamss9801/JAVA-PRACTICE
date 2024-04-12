public class DLinkedList {

    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node current = tail;
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    }

    public void deleteData(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {

                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            if (current.next != null) {
                current.next.prev = current;
            } else {

                tail = current;
            }
        }
    }

    void deleteFromFront() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {

            tail = null;
        }
    }

    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {

            head = null;
        }
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
        DLinkedList linkedList = new DLinkedList();
        linkedList.insertEnd(4);
        linkedList.insertEnd(5);
        linkedList.insertEnd(9);
        linkedList.insertEnd(11);
        linkedList.display();

        System.out.print("Delete 4 : ");
        linkedList.deleteData(4);
        linkedList.display();

        linkedList.deleteFromFront();
        System.out.print("Delete From Front : ");
        linkedList.display();

        linkedList.deleteFromEnd();
        System.out.print("Delete From End : ");
        linkedList.display();

        linkedList.insertEnd(4);
        linkedList.insertEnd(4);

        System.out.print("Insert Data : ");
        linkedList.display();
    }
}

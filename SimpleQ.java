public class SimpleQ {
    private int front;
    private int rear;
    private int array[];

    SimpleQ(int max) {
        this.front = -1;
        this.rear = -1;
        this.array = new int[max];

    }

    boolean isEmpty() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    int peek() {
        if (front == rear) {
            System.out.println("Queue is Empty ");
            return -1;

        }
        return array[front];
    }

    int pool() {
        if (front == rear) {
            System.out.println("No item Found to Delete");
            return -1;
        }
        int x = array[front];
        array[front] = 0;
        front++;
        return x;
    }

    void offer(int data) {
        if (rear == array.length - 1) {
            System.out.println(" Not Sufficient Space ");
            return;
        }
        if (rear == -1 && front == -1) {
            front++;
            rear++;
            array[rear] = data;
        } else {
            rear++;
            array[rear] = data;
        }

    }

    void display() {
        int temp = front;
        if (front == -1 || front == rear) {
            System.out.println("Queue is Empty");
        } else {
            while (temp <= rear) {
                System.out.print(array[temp] + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleQ q = new SimpleQ(5);
        q.offer(5);
        q.offer(6);
        q.offer(9);
        q.offer(10);
        q.offer(11);

        q.display();
        System.out.println(q.peek());
        System.out.println("q is Empty : " + q.isEmpty());
        q.pool();
        q.display();
    }
}

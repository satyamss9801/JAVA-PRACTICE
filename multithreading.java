
class B {
    static int n = 0;

    public static void incr() {
        n++;
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            B.incr();
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        Thread obj = new Thread(new A());
        Thread obj2 = new Thread(new A());

        obj.start();
        obj2.start();

        try {
            obj.join();
            obj2.join();

            System.out.println(B.n);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // System.out.println(B.n);
    }
}

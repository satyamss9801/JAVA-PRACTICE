class A {
    static int n = 0;

    void inc() {
        synchronized (A.class) {
            n++;
        }
    }
}

public class classl implements Runnable {

    public void run() {
        A obj = new A();

        for (int i = 1; i <= 1000; i++) {
            obj.inc();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new classl());
        Thread t2 = new Thread(new classl());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(A.n);
    }
}
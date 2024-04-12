class A {
    static int n = 0;

    static synchronized void inc() {
        n++;
    }
}

public class sync extends Thread {

    public void run() {

        for (int i = 1; i <= 1000; i++) {
            A.inc();
        }
    }

    public static void main(String[] args) {
        sync t1 = new sync();
        sync t2 = new sync();

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

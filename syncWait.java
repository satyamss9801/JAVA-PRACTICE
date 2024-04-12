class A {
    static int n = 0;

    void inc() {
        synchronized (A.class) {
            n++;
        }
    }
}

public class syncWait implements Runnable {

    public void run() {
        synchronized (this) {
            A obj = new A();

            for (int i = 1; i <= 1000; i++) {
                obj.inc();
            }

            notify();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new syncWait());
        Thread t2 = new Thread(new syncWait());

        t1.start();
        t2.start();

        synchronized (t1) {
            synchronized (t2) {
                try {
                    t1.wait();
                    t2.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(A.n);
            }
        }

    }
}


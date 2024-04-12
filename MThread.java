
class B {

    static int n =0; 
        public static synchronized void inc() {
        n++;
    }
}

class A extends Thread {
    
    public void run() {
        for (int i = 1; i <= 100; i++) {
            B.inc();
        }
    }

      public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

            System.out.println(B.n);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}


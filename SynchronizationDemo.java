class display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning : ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println(name);

        }
    }
}

class MyThread extends Thread {
    display d;
    String name;

    MyThread(display d, String name) {
        this.d = d;
        this.name = name;

    }

    public void run() {
        d.wish(name);
    }

}

public class SynchronizationDemo {
    public static void main(String[] args) {

        display d = new display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");

        t1.start();
        t2.start();

    }
}
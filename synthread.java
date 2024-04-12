class display {
    public synchronized void wish(String name) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }

}

class mythread extends Thread {
    display d;
    String name;

    mythread(display d, String name) {
        this.d = d;
        this.name = name;

    }

    public void run() {
        d.wish(name);
    }
}

public class synthread {
    public static void main(String[] args) {
        display d = new display();
        mythread t1 = new mythread(d, "Dhoni");
        mythread t2 = new mythread(d, "Kohli");

        t1.start();
        t2.start();

    }

}

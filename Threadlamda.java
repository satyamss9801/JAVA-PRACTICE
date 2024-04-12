public class Threadlamda {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("THREAD CALLED");
        });

        t.start();
    }

}

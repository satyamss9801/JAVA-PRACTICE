public class MainChildThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread childThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        childThread.start(); // Start the child thread

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(500);
        }

        childThread.join(); // Wait for the child thread to complete

        System.out.println("Both threads have completed.");
    }
}

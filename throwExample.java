class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class throwExample {
    public static void main(String[] args) {
        int age = -5;

        try {
            if (age < 0) {
                throw new MyCustomException("Age cannot be negative");
            }
        } catch (MyCustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}


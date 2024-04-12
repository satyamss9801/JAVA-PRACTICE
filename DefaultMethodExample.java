// Define an interface for a vehicle
interface Vehicle {
    void start(); // Abstract method for starting the vehicle

    void stop(); // Abstract method for stopping the vehicle

    default void honk() {
        System.out.println("Vehicle honks!"); // Default method for honking the horn
    }
}

// Create a class that implements the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    // Override the default honk method
    @Override
    public void honk() {
        System.out.println("Car honks!");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Call the abstract methods
        myCar.start();
        myCar.stop();

        // Call the overridden honk method
        myCar.honk(); // Output: Car honks!
    }
}

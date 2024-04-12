// Custom exception for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for values that are too large
class ValueTooLargeException extends Exception {
    public ValueTooLargeException(String message) {
        super(message);
    }
}

public class MultipleUserDefinedExceptions {
    static void performOperation(int value) throws NegativeValueException, ValueTooLargeException {
        if (value < 0) {
            throw new NegativeValueException("Value cannot be negative");
        } else if (value > 100) {
            throw new ValueTooLargeException("Value is too large");
        } else {
            System.out.println("Operation performed successfully with value: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Testing with different values
            performOperation(-5); // Throws NegativeValueException
            performOperation(150); // Throws ValueTooLargeException
            performOperation(42); // Successful operation
        } catch (NegativeValueException e) {
            System.err.println("NegativeValueException Caught: " + e.getMessage());
        } catch (ValueTooLargeException e) {
            System.err.println("ValueTooLargeException Caught: " + e.getMessage());
        }
    }
}

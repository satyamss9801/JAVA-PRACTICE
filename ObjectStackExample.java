import java.util.Stack;

class Student {
    private String firstName;
    private String lastName;
    private int studentID;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Student ID: " + studentID;
    }
}

public class ObjectStackExample {

    public static void main(String[] args) {
        // Create a new stack to hold our objects
        Stack<Student> studentStack = new Stack<>();

        // Create some student objects
        Student student1 = new Student("John", "Doe", 123456);
        Student student2 = new Student("Jane", "Doe", 654321);
        Student student3 = new Student("Bob", "Smith", 987654);

        // Push the student objects onto the stack
        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);

        // Pop the objects from the stack and print their details
        while (!studentStack.empty()) {
            Student currentStudent = studentStack.pop();
            System.out.println(currentStudent);
        }
    }
}

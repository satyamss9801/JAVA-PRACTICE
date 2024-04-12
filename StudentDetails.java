import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollno = input.nextInt();
        input.nextLine();

        System.out.print("Enter full name: ");
        String fullname = input.nextLine();

        System.out.print("Enter address: ");
        String address = input.nextLine();

        System.out.print("Enter stream: ");
        String stream = input.nextLine();

        System.out.print("Enter total marks in 5 subjects: ");
        double totalMarks = input.nextDouble();

        System.out.print("Enter percentage: ");
        double percentage = input.nextDouble();

        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Full Name: " + fullname);
        System.out.println("Address: " + address);
        System.out.println("Stream: " + stream);
      System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        input.close();
    }
}


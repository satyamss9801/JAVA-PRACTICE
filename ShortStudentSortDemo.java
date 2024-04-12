import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ShortStudent implements Comparable<ShortStudent> {
    private short rollNumber;
    private String name;
    private int age;

    public ShortStudent(short rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public short getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(ShortStudent other) {
        return Short.compare(this.rollNumber, other.rollNumber);
    }
}

public class ShortStudentSortDemo {
    public static void main(String[] args) {
        List<ShortStudent> students = new ArrayList<>();
        students.add(new ShortStudent((short) 2, "Alice", 20));
        students.add(new ShortStudent((short) 3, "Bob", 19));
        students.add(new ShortStudent((short) 1, "Charlie", 21));

        System.out.println("Before sorting:");
        for (ShortStudent student : students) {
            System.out.println(student.getRollNumber() + " " + student.getName() + " " + student.getAge());
        }

        Collections.sort(students);

        System.out.println("After sorting:");
        for (ShortStudent student : students) {
            System.out.println(student.getRollNumber() + " " + student.getName() + " " + student.getAge());
        }
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamstudent {
    static class student {
        int roll;
        int marks;
        String name;

        student(int r, String n, int m) {
            roll = r;
            name = n;
            marks = m;
        }

        int getroll() {
            return roll;
        }

        int getmarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        student[] arr = {
                new student(1, "Satyam", 80),
                new student(2, "Rohan", 50),
                new student(3, "Sohan", 60),
                new student(4, "Kishan", 75)
        };

        Map<Integer, List<student>> m = Arrays.stream(arr).collect(Collectors.groupingBy(student::getmarks));
        System.out.println(m);

    }
}

import java.util.Arrays;

class ClassSt {
    int roll;
    int marks;
    String name;

    ClassSt(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;

    }

    int getRoll() {
        return roll;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }
}

public class StreamObject {
    public static void main(String[] args) {
        ClassSt arr[] = {
                new ClassSt(110, "satyam", 50),
                new ClassSt(101, "Saurav", 80),
                new ClassSt(110, "Gaurav", 90),
                new ClassSt(110, "Aniket", 75),
                new ClassSt(110, "Singh ji", 100),

        };

        double res = Arrays.stream(arr).mapToInt(x -> x.getMarks()).average().getAsDouble();
        System.out.println(res);
    }

}

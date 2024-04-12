import java.util.ArrayList;
import java.util.Scanner;

public class Collectionc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Student = new ArrayList<>();

        System.out.println("Enter values for arraylist");
        int i = 0;

        while (i < 4) {
            Student.add(sc.next());
            i++;

        }

        // Student.remove(2);

        System.out.println("Values of all collection");
        for (i = 0; i < Student.size(); i++) {
            System.out.println(Student.get(i));
        }

        Student.clear();

        System.out.println("Values of all collection after clear");
        for (i = 0; i < Student.size(); i++) {
            System.out.println(Student.get(i));
        }

    }

}

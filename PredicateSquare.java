
import java.util.Arrays;
import java.util.List;

public class PredicateSquare {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 3, 4, 5);
        al.forEach(PredicateSquare::Square);

    }

    static void Square(Integer x) {
        System.out.println(x * x);
    }

}

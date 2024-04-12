import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
    static void printcon(Collection<Integer> c, Predicate<Integer> p) {
        for (Integer x : c) {
            if (p.test(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {

        class MyPridicateEVen implements Predicate<Integer> {

            @Override
            public boolean test(Integer x) {
                // TODO Auto-generated method stub
                return (x % 2 == 0);
            }
            /*
             * Insted of this we can use anonimous classes i.e :
             * Predicate MyPridicateEven = new Predicate<Integer>(){
             * public boolean test(Integer x){
             * return(x%2==0);}
             * }
             */

        }
        List<Integer> al = new ArrayList<>(Arrays.asList(10, 5, 15, 20, 7, 30));
        printcon(al, new MyPridicateEVen());

    }

}

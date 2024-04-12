import java.util.*;

public class ListIterate {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(50, 62, 22, 44));

        ListIterator<Integer> it = al.listIterator(al.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }

}

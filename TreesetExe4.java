import java.util.*;

public class TreesetExe4 {

    public static void main(String[] args) {
        TreeSet tr = new TreeSet(new myComparator());
        tr.add(10);
        tr.add(0);
        tr.add(15);
        tr.add(20);
        tr.add(5);
        System.out.println(tr);

    }

}

class myComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        // TODO Auto-generated method stub
        // if (i1 < i2) {
        // return +1;
        // } else if (i1 > i2) {
        // return -1;
        // } else {
        // return 0;
        // }

        // return -i1.compareTo(i2);
        return -1;

    }
}

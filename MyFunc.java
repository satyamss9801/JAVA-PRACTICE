import java.util.Iterator;
import java.util.LinkedList;

public class MyFunc {

    LinkedList list = new LinkedList<Integer>();

    void Add(int x) {
        list.add(x);

    }

    void Remove(int x) {
        Iterator it = list.iterator();

        while (it.hasNext()) {
            Integer n = (Integer) it.next();
            if (n.equals(x)) {
                it.remove();
            } else {
                System.out.print(n + "  ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyFunc obj = new MyFunc();

        obj.Add(10);
        obj.Add(50);
        obj.Add(10);
        obj.Add(90);
        obj.Add(44);
        obj.Add(50);
        obj.Remove(10);
        obj.Remove(50);
    }

}

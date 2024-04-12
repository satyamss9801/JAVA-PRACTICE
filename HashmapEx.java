import java.util.*;

public class HashmapEx {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();

        m.put(1, "SATYAM");
        m.put(2, "Gaurav");
        m.put(3, "RAJA");
        ;
        m.put(4, "Deepak");

        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + "   " + e.getValue());
        }
        for (int a : m.keySet()) {
            System.out.println(a);// .getValue());
        }
        for (String s : m.values()) {
            System.out.println(s);// .getValue());
        }

        if (m.containsKey(4)) {
            System.out.println(m.remove(4));
        }


    }

}

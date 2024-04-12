import java.util.*;

public class VectorExample {
  public static void main(String[] args) {
    Vector<String> vec = new Vector<String>();
    vec.add("Emma");
    vec.add("Adele");
    vec.add("Aria");
    vec.add("Aidan");
    vec.add("Adriana");
    vec.add("Ally");
    System.out.println(vec);
    vec.remove(2);

    Iterator<String> it = vec.iterator();
    while (it.hasNext()) {
      String n = it.next();
      System.out.println(n);

    }
  }
}

import java.util.*;

public class removeeven {
  static void remove(Collection<Integer> c) {
    Iterator<Integer> it = c.iterator();
    while (it.hasNext()) {
      int x = (Integer) it.next();
      if (x % 2 == 0) {
        it.remove();
      }
    }

  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Collection<Integer> c = new ArrayList<>();
    System.out.println("Enter the number of vales youwant to enter");
    int x = sc.nextInt();
    for (int i = 0; i < x; i++) {
      System.out.println("Enter value");
      int y = sc.nextInt();
      c.add(y);
    }
    remove(c);
    System.out.println(c);

  }

}

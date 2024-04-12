import java.util.*;

public class EnumerationClass {

    public static void main(String args[]) {

        Vector<String> monthNames = new Vector<>();

        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");

        Enumeration<String> months = monthNames.elements();
        Iterator<String> it = monthNames.iterator();

        System.out.println("Enumeration Called");
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }

        System.out.println("*********Iterator Called***********");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

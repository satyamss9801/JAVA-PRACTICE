public class DoWhile {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        System.out.println("SUM OF NUMBER FROM 1 TO 10");

        do {
            y = y + x;
            x++;
        } while (x <= 10);
        System.out.println(y);
    }

}

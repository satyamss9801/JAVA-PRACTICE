public class test5 {
    public static void main(String[] args) {
        int x = 10;
        final int y = 20;
        switch (x) {
            case 10:
                System.out.println(x);
                break;
            case y:
                System.out.println(20);
                break;
            default:
                break;
        }
    }

}

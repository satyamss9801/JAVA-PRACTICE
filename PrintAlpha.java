public class PrintAlpha {
    static void Plower() {
        char ch = 'a';
        while (ch != 'z' + 1) {
            System.out.print(ch + "  ");
            ch++;

        }
    }

    static void Pupper() {
        char ch = 'A';
        while (ch != 'Z' + 1) {
            System.out.print(ch + "  ");
            ch++;

        }

    }

    public static void main(String[] args) {
        Plower();
        System.out.println();
        Pupper();
    }

}

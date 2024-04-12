class PolySum {

    PolySum(int i, int j) {
        System.out.println((i + j));
    }

    PolySum(int i, int j, int k) {
        System.out.println((i + j + k));
    }

    public static void main(String[] args) {
        PolySum obj = new PolySum(5, 10);
        PolySum obj1 = new PolySum(5, 10, 15);

    }
}

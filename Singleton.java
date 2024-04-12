public class Singleton {

    private static Singleton obj = null;

    private Singleton() {
        System.out.println("satyam");
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Are obj1 and obj2 the same instance? : " + (obj1 == obj2));
    }
}

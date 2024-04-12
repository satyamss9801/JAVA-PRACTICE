public class InnerClass {
    public void m1(){
        final int x = 10; // Make x effectively final

        class Inner {
            public void displayX() {
                System.out.println(x); 
            }
        }

        Inner innerObject = new Inner();
        innerObject.displayX();
    }

    public static void main(String[] args) {
        InnerClass outerObject = new InnerClass();
        outerObject.m1();
    }
}


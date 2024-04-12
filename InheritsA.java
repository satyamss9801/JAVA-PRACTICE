
class InheritsA {
    static void Show() {
        System.out.println("Class a called");

    }

    public static void main(String[] args) {

    }

}

class b extends InheritsA {
    static void Showit() {
        System.out.println("Class B called");
    }

}

class c extends b {
    static void showc() {
        System.out.println("Class c called");
    }

    public static void main(String[] args) {

    }
}

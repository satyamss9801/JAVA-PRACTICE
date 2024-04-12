class employee {
    void display() {
        System.out.println("Employee");
    }

}

class salary extends employee {
    void display() {
        System.out.println("salary");
    }

    public static void main(String[] args) {
        employee obj = new employee();
        salary obj1 = new salary();

        obj.display();
        obj1.display();
    }
}

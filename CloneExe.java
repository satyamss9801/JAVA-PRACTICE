 class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneExe {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("John", 20);
            Student student2 = (Student) student1.clone(); // Cloning the object
            System.out.println("Original - Name: " + student1.getName() + ", Age: " + student1.getAge());
            System.out.println("Cloned - Name: " + student2.getName() + ", Age: " + student2.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
 {
    
}

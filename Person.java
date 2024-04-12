import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String city;
    private int age;
    private String gender;

    public Person(String name, String city, int age, String gender) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", Age: " + age + ", Gender: " + gender;
    }

}

class Test {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Satyam", "purnea", 20, "Male"));
        personList.add(new Person("Gaurav", "purnea", 26, "Male"));
        personList.add(new Person("Aniket", "purnea", 22, "Male"));
        personList.add(new Person("Siddhant", "purnea", 28, "Male"));
        personList.add(new Person("Shubham", "purnea", 24, "Male"));
        personList.add(new Person("Ayush", "purnea", 30, "Male"));
        personList.add(new Person("Shivam", "purnea", 32, "Male"));

        List<Person> filteredList = personList.stream()
                .filter(p -> p.getAge() > 25)
                .collect(Collectors.toList());

        for (Person person : filteredList) {
            System.out.println(person);
        }
    }
}

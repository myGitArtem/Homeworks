package professions;

public class Person {

    private final String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

package lab5.problem1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String first, String last, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLast() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age;
    }
}

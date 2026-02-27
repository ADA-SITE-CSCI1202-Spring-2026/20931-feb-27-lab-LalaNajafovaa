
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {
        this("", "", "");
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName == null ? "" : firstName;
        this.lastName = lastName == null ? "" : lastName;
        this.gender = gender == null ? "" : gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? "" : gender;
    }

    public boolean equals(Person p) {
        return p != null
                && Objects.equals(firstName, p.firstName)
                && Objects.equals(lastName, p.lastName)
                && Objects.equals(gender, p.gender);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Person p) && equals(p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    public String toString() {
        return "Person{firstName='" + firstName + "', lastName='" + lastName + "', gender='" + gender + "'}";
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private String department;
    private List<String> courses;

    public Teacher() {
        this("", "", "", "", List.of());
    }

    public Teacher(String firstName, String lastName, String gender, String department, List<String> courses) {
        super(firstName, lastName, gender);
        this.department = department == null ? "" : department;
        setCourses(courses);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? "" : department;
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public void setCourses(List<String> courses) {
        List<String> copy = new ArrayList<>();
        if (courses != null) {
            for (String c : courses) copy.add(c == null ? "" : c);
        }
        this.courses = copy;
    }

    public boolean equals(Teacher t) {
        return t != null
                && super.equals(t)
                && Objects.equals(department, t.department)
                && Objects.equals(courses, t.courses);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Teacher t) && equals(t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, courses);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + "', lastName='" + getLastName() + "', gender='" + getGender() + "', " +
                "department='" + department + "', courses=" + courses +
                "}";
    }
}

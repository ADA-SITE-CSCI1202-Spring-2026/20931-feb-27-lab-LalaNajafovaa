
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PhdStudent extends Student {
    private String department;
    private List<String> courses;

    public PhdStudent() {
        this("", "", "", "", "", List.of());
    }

    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, List<String> courses) {
        super(firstName, lastName, gender, studentId);
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

    public boolean equals(PhdStudent pStud) {
        return pStud != null
                && super.equals(pStud)
                && Objects.equals(department, pStud.department)
                && Objects.equals(courses, pStud.courses);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof PhdStudent p) && equals(p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, courses);
    }

    @Override
    public String toString() {
        return "PhdStudent{" +
                "firstName='" + getFirstName() + "', lastName='" + getLastName() + "', gender='" + getGender() + "', " +
                "studentId='" + getStudentId() + "', department='" + department + "', courses=" + courses +
                "}";
    }
}

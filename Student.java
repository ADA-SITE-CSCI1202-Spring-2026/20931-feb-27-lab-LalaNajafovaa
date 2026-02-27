
import java.util.Objects;

public class Student extends Person {
    private String studentId;

    public Student() {
        this("", "", "", "");
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId == null ? "" : studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? "" : studentId;
    }

    public boolean equals(Student s) {
        return s != null
                && super.equals(s)
                && Objects.equals(studentId, s.studentId);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Student s) && equals(s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + "', lastName='" + getLastName() + "', gender='" + getGender() + "', " +
                "studentId='" + studentId + "'" +
                "}";
    }
}

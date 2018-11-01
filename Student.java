import java.util.Objects;
/**
 * Write a description of class Instructor here.
 *
 * @author Keith Maibach
 * @version 11/1/2018
 */
public class Student
{
    private String studentId;
    private String firstName;
    private String lastName;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        this.studentId = "000000";
        this.firstName = "default";
        this.firstName = "default";
    }

    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(Student object2) {
        this.studentId = object2.studentId;
        this.firstName = object2.firstName;
        this.lastName = object2.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nStudent Information:" + 
        "\nStudentID: " + this.getStudentId() +
        "\nName: " + this.getFirstName() + " " + this.getLastName();
    }
}

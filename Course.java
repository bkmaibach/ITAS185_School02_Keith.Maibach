
/**
 * Write a description of class Instructor here.
 *
 * @author Keith Maibach
 * @version 11/1/2018
 */
public class Course
{
    String courseName;
    Instructor instructor;
    TextBook textBook;
    Student student = null;

    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    public Course(Course object2) {
        setCourseName(object2.courseName);
        setInstructor(object2.instructor);
        setTextBook(object2.textBook);
    }

    public void enroll(Student newStudent){
        if (student == null){
            student = new Student(newStudent);
            System.out.println("Student " + newStudent.getStudentId() + " enrolled");
        } else if(newStudent.equals(student)){
            System.out.println("Student already enrolled");
        } else {
            System.out.println("Sorry - course is full");
        }
    }

    public void withdraw(String id){
        if(student == null || student.getStudentId() != id){
            System.out.println("The student " + id + " was not enrolled in this course");
        } else{
            student = null;
            System.out.println("The student " + id + " was withdrawn from this course");
        }
    }

    public void withdraw(Student toWithdraw){
        String id = toWithdraw.getStudentId();
        withdraw(id);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return new Instructor(this.instructor);
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = new Instructor(instructor);
    }

    public TextBook getTextBook() {
        return new TextBook(this.textBook);
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = new TextBook(textBook);
    }

    @Override
    public String toString() {
        return "Course Name: " + this.getCourseName() +
        "\n---------------------------------" +
        instructor.toString() +
        "\n" +
        textBook.toString() +
        "\n" +
        student.toString() +
        "\n";
    }

}

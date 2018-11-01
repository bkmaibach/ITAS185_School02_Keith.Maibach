
/**
 * Write a description of class Instructor here.
 *
 * @author Keith Maibach
 * @version 11/1/2018
 */
public class School{

    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Dutchuk", "Mark", "180/226");
        Instructor instructor2 = new Instructor("Britt", "Brandon", "180/236");

        TextBook textBook1 = new TextBook("A Gentleman's Guide to the Golden Age of LARPing", "I.P. Nightly", "Pearson");
        TextBook textBook2 = new TextBook("An Introduction to Hamster Fighting", "Hugo Ferst", "Publishy McPublishface");

        Student student1 = new Student("111111", "Keith", "Maibach");
        Student student2 = new Student("222222", "Thomas", "Griffith");

        Course course1 = new Course("LARPing 101", instructor1, textBook1);
        Course course2 = new Course("Hamster Fighting 101", instructor2, textBook2);

        course1.enroll(student1);
        course2.enroll(student2);

        System.out.println(course1.toString());
        System.out.println(course2.toString());

        course1.enroll(student1);
        course1.enroll(student2);

        course1.withdraw("222222");
        course1.withdraw("111111");

        course1.enroll(student1);
        course1.withdraw(student2);
        course1.withdraw(student1);

        Course course3 = new Course(course2);
        course3.withdraw("222222");
        student2.setFirstName("Tommy");
        course3.enroll(student2);

        instructor2.setLastName("Tribb");
        course3.setInstructor(instructor2);

        textBook2.setAuthor("Jeb Bush");
        textBook2.setTitle("Ladles and Their Uses");
        course3.setTextBook(textBook2);

        System.out.println(course2.toString());
        System.out.println(course3.toString());
    }
}

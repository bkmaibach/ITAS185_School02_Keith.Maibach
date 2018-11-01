
/**
 * Write a description of class Instructor here.
 *
 * @author Keith Maibach
 * @version 11/1/2018
 */
public class Instructor
{
    // instance variables - replace the example below with your own
    private String lastName;
    private String firstName;
    private String officeNumber;

    /**
     * Constructor for objects of class Instructor
     */
    public Instructor(String lname, String fname, String office){
        this.lastName = lname;
        this.firstName = fname;
        this.officeNumber = office;
    }

    public Instructor(Instructor object2){
        this.lastName = object2.lastName;
        this.firstName = object2.firstName;
        this.officeNumber = object2.officeNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "\nInstructor Information:" +
        "\nLast Name: " + this.getLastName() +
        "\nFirst Name: " + this.getFirstName() +
        "\nOffice Number: " + this.getOfficeNumber();
    }
}

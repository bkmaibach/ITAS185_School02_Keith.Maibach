
/**
 * Write a description of class Instructor here.
 *
 * @author Keith Maibach
 * @version 11/1/2018
 */
public class TextBook
{
    // instance variables
    private String title;
    private String author;
    private String publisher;

    /**
     * Constructor for objects of class TextBook
     */
    public TextBook(String textTitle, String auth, String pub){
        // initialise instance variables
        this.title = textTitle;
        this.author = auth;
        this.publisher = pub;
    }

    public TextBook(TextBook object2){
       title = object2.getTitle();
       author = object2.getAuthor();
       publisher = object2.getPublisher();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "\nTextbook Information:" +
        "\nTitle: " + this.getTitle() +
        "\nAuthor: " + this.getAuthor() +
        "\nPublisher: " + this.getPublisher();
    }

}

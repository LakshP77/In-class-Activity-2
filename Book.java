// for both classes you have defined, create a method writeEntry that creates a correctly

public class Book {
    // Instance variables (attributes of each book)
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private String isbn;

    // Constructor
    public Book(String title, String author, String publisher, int yearPublished, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Instance method to return a formatted bibliographic string
    public String getBibliography() {
        return author + ". " + title + ". " + publisher + ", " + yearPublished + ". ISBN: " + isbn;
    }

    // toString method (useful for printing the object directly)
    @Override
    public String toString() {
        return getBibliography();
    }
}

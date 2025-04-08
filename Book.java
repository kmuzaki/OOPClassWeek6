public class Book {
    // Instance variables with private access for encapsulation
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    
    // Additional variable with default access (package-private) for demonstration
    String publisher;
    
    // Protected variable to show limited access in subclasses (if needed)
    protected String isbn;
    
    // (Optional) Other methods and constructors will be added below

    // Default constructor initializing fields to default values
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.yearPublished = 0;
        this.price = 0.0;
        this.publisher = "Not specified";
        this.isbn = "N/A";
    }

    // Parameterized constructor
    public Book(String title, String author, int yearPublished, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // Overloaded constructor using constructor chaining
    public Book(String title, String author) {
        // Chain to the full constructor with default values for other fields
        this(title, author, 2020, 29.99, "Default Publisher", "000-0000000000");
    }

    // A set of accessor methods
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public String getIsbn() {
        return isbn;
    }

    //A set of mutator methods
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

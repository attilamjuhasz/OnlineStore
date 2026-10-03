
public class Book extends ItemForSale
{

    private String publisher;
    private Author author;

    public Book(){
        publisher = "";
        author = new Author();
    }

    public Book(String name, double price, String datePlacedOnSale, String publisher, Author author){
        super(name, price, author.getName(), datePlacedOnSale);
        this.publisher = publisher;
        this.author = author;
    }

    //Precondition: Book and publisher defined
    //Postcondition: Returns the publisher of the book
    public String getPublisher(){
        return publisher;
    }

    //Precondition: Book and newPublisher defined
    //Postcondition: sets the publisher to a new publisher
    public void setPublisher(String newPublisher){
        publisher = newPublisher;
    }

    //Precondition: Book and newAuthor defined
    //Postcondition: Sets the author of the book to a new author
    public void setAuthor(Author newAuthor){
        creator = newAuthor.getName();
    }
}

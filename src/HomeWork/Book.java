package HomeWork;

public class Book {
    /*3)Library Management System:create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
*/
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    void Display(){
        System.out.println(title+" "+author+" "+ISBN);
    }
}
class EBook extends Book{
    private String download_link;

    EBook(String title, String author, int ISBN, String download_link) {
        super(title, author, ISBN);
        this.download_link = download_link;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println("Download link "+download_link);
    }
}
class PrintBook extends Book{
    private int numOfCopies;
    public PrintBook(String title, String author, int ISBN, int numOfCopies) {
        super(title, author, ISBN);
        this.numOfCopies = numOfCopies;
    }
    @Override
    void Display() {
        super.Display();
        System.out.println("number of Copies:"+numOfCopies);
    }
}

class BookTester{
    public static void main(String[] args) {
        Book B=new Book("love","hanane",1234);
        B.Display();
        EBook EB=new EBook("love story","Yannis",2345,"www.amazon.com");
        EB.Display();
        PrintBook PB=new PrintBook("love story hanane","souf",3456,100);
        PB.Display();
    }

}
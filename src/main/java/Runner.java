import models.Author;
import models.Book;
import db.DBAuthor;
import db.DBBook;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Joanne", "Rowling", 52);
        DBAuthor.save(author1);
        Author author2 = new Author("Gerge", "Martin", 69);
        DBAuthor.save(author2);
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 1997, "Joanne Rowling");
        DBBook.save(book1);
        Book book2 = new Book("A Game of Thrones", 1981, "George Martin");
        DBBook.save(book2);

        List<Author> allAuthors = DBAuthor.getAll();
        List<Book> allBooks = DBBook.getAll();

        Author george = DBAuthor.find(author2.getId());
        Book thrones = DBBook.find(book2.getId());

        author1.setFirst_name("George");
        DBAuthor.save(author1);

        book2.setYearOfPub(1991);
        DBBook.save(book2);

        DBAuthor.delete(author1);
        DBBook.delete(book1);
        List<Author> allAuthors2 = DBAuthor.getAll();
        List<Book> allBooks2 = DBBook.getAll();

        Author author3 = new Author("Stephen", "King", 70);
        Book book3 = new Book("Carrie", 1974, "Stephen King");
        DBAuthor.save(author3);
        DBBook.save(book3);
        List<Author> allAuthors3 = DBAuthor.getAll();
        List<Book> allBooks3 = DBBook.getAll();

        DBAuthor.deleteAll();
        DBBook.deleteAll();

        List<Author> allAuthors4 = DBAuthor.getAll();
        List<Book> allBooks4 = DBBook.getAll();
    }

}

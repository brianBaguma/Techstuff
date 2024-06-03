package LibraryService;
import java.util.ArrayList;
import java.util.List;

import com.example.libraryManagement.model.Book;
import org.springframework.stereotype.Service;
public class LibraryService {
    private static LibraryService libraryService = new LibraryService();

    public static LibraryService getInstance() {
        return libraryService;
    }
    public List<Book> getBooks() {
      return libraryService.getBooks();
    }
    public List<Book> getBooksByAuthor(String author) {
        return libraryService.getBooksByAuthor(author);
    }
    public List<Book> getBooksByTitle(String title) {
        return null;
    }
    public List<Book> getBooksByYear(int year) {
        return null;
    }
    public List<Book> getBooksByPage(int page) {
        return null;
    }
    public Book getBookById(int id) {
        return null;
    }
    public Book getBookByTitle(String title) {
        return null;
    }
    public Book getBookByAuthor(String author) {
        return null;
    }
    public Book getBookByYear(int year) {
        return null;
    }
    public Book getBookByPage(int page) {
        return null;
    }
    public Book getBookByID(int id) {
        return null;
    }

}

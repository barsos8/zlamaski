package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Book;
import java.util.List;

public interface BookDao {
    void save(Book book);
    Book findById(Integer bookId);
    List<Book> findAll();
    List<Book> findByStatus(BookStatus status);
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    void update(Book book);
    void delete(Integer bookId);
}
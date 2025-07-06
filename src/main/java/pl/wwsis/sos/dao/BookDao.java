package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Book;
import java.util.List;

public interface BookDao {
    List<Book> viewAvailableBooks();
}
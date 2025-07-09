package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.RentBook;
import pl.wwsis.sos.model.User;
import java.util.List;

public interface RentBookDao {
    void save(RentBook rentBook);
    RentBook findById(Integer rentBookId);
    List<RentBook> findAll();
    List<RentBook> findByIndeksNo(String indeksNo);
    List<RentBook> findByBookId(Integer bookId);
    void update(RentBook rentBook);
    void delete(Integer rentBookId);

    List<RentBook> viewCurrentRentals(String indeksNo);
    List<RentBook> viewOverdueBooks(String indeksNo);
    List<RentBook> viewReturnedBooks(String indeksNo);
    List<RentBook> getLibraryStatus(String indeksNo);
}

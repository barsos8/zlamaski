package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.RentBook;
import pl.wwsis.sos.model.User;
import java.util.List;

public interface RentBookDao {

    List<RentBook> viewCurrentRentals(User user);
    List<RentBook> viewOverdueBooks(User user);
    List<RentBook> viewReturnedBooks(User user);
    List<RentBook> getLibraryStatus(User user);
}

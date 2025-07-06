package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.model.RentBook;
import pl.wwsis.sos.model.Mark;
import java.util.List;

public interface StudentDao {

    boolean enrollSubject(int subjectId);
    List<Subject> listAllSubjects(String semester);
    List<Schedule> getEnrolledSubjects();
    List<Schedule> viewSchedule();
    List<Payment> viewPayments();
    List<RentBook> viewLibraryStatus();
    List<Mark> listMarksBySubject(String subjectID, String semester);
}

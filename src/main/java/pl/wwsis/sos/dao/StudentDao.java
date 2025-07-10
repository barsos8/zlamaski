package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;
import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.model.RentBook;
import pl.wwsis.sos.model.Mark;
import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student findByEmail(String email);
    Student findByIndeks(String indeksNo);
    List<Student> findAll();
    List<Student> findByGroupId(Integer groupId);
    void update(Student student);
    void delete(String indeksNo);

    void requestPasswordReset(String indeksNo);
    boolean enrollSubject(String indeksNo, Integer subjectId);
    boolean withdrawSubject(String indeksNo, Integer subjectId);
    List<Subject> listAllSubjects(String indeksNo, String semester);
    List<Schedule> getEnrolledSubjects(String indeksNo);
    List<Schedule> viewSchedule(String indeksNo);
    List<Payment> viewPayments(String indeksNo);
    List<RentBook> viewLibraryStatus(String indeksNo);
    List<Mark> listMarksBySubject(String indeksNo, Integer subjectId, String semester);
    List<Mark> viewGrades(String indeksNo);
}

package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Enrollment;
import pl.wwsis.sos.model.EnrollmentStatus;
import java.util.List;

public interface EnrollmentDao {
    void save(Enrollment enrollment);
    Enrollment findById(Integer enrollmentId);
    void enrollStudent(Enrollment enrollment);
    void withdrawStudent(Integer enrollmentId);
    List<Enrollment> findAll();
    List<Enrollment> findByStudentIndeksNo(String indeksNo);
    List<Enrollment> findBySubjectId(Integer subjectId);
    List<Enrollment> findByStatus(EnrollmentStatus status);
    void update(Enrollment enrollment);
    void delete(Enrollment enrollment);

    Boolean confirmEnrollment(Integer enrollmentId);
    Boolean withdrawEnrollment(Integer enrollmentId);
    Boolean isOnWaitlist(Integer enrollmentId);
}
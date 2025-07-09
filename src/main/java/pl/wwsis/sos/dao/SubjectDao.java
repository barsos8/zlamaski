package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Enrollment;
import java.util.List;

public interface SubjectDao {
    void save(Subject subject);
    Subject findById(Integer subjectId);
    List<Subject> findAvailableSubjects(String semester);
    List<Subject> findAll();
    List<Subject> findBySemester(String semester);
    void update(Subject subject);
    void delete(Integer subjectId);

    Subject getDetails(Integer subjectId);
    List<Enrollment> listEnrollments(Integer subjectId);
    List<Subject> searchByName(String name);
    List<Subject> listAllSubjects(String semester);
}

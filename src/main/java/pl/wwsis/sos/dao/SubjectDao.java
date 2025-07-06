package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Enrollment;
import java.util.List;

public interface SubjectDao {

    Subject getDetails();
    List<Enrollment> listEnrollments();
    List<Subject> searchByName(String name);
    List<Subject> sortSubjectsBy(String criteria);
    List<Subject> listAvailableSubjects();
}

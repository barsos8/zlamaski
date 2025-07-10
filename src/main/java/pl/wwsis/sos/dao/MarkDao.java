package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Mark;
import java.util.List;

public interface MarkDao {
    Mark findById(Integer markId);
    List<Mark> findAll();
    void save(Mark mark);
    void update(Mark mark);
    void delete(Integer markId);
    float getValue(Integer markId);
    Boolean isFinal(Integer markId);

    List<Mark> findByEnrollmentId(Integer enrollmentId);
    List<Mark> findByStudentIndeks(String indeksNo);
    List<Mark> listStudentMarksBySubjectAndSemester(String indeksNo, Integer subjectId, String semester);
}
package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.Student;
import pl.wwsis.sos.model.Mark;
import pl.wwsis.sos.model.Teacher;
import pl.wwsis.sos.model.Enrollment;
import pl.wwsis.sos.model.MarkType;
import java.util.List;

public interface TeacherDao {
    void save(Teacher teacher);
    Teacher findById(Integer userId);
    List<Teacher> findAll();
    void delete(Teacher teacher);
    void update(Teacher teacher);
    
    Teacher findByEmail(String email);
    List<Teacher> findBySubjectId(Integer subjectId);
    List<Schedule> getSchedule(Integer teacherId, String semester);
    Mark assignGrade(Integer teacherId, Integer enrollmentId, float markValue, MarkType type, String comment);
    List<Mark> getMarks(Integer enrollmentId);
}

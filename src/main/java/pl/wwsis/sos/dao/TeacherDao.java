package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.Student;
import pl.wwsis.sos.model.Mark;
import pl.wwsis.sos.model.Teacher;
import pl.wwsis.sos.model.Enrollment;
import pl.wwsis.sos.model.MarkType;
import java.util.List;

public interface TeacherDao {
    
    List<Schedule> getSchedule(String semester);
    Mark assignGrade(Student student, Schedule schedule, float markValue, MarkType type, String comment);
    List<Mark> getMarks(Enrollment enrollment);
    List<Teacher> getAllTeachers();
}

package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;
import pl.wwsis.sos.model.Schedule;
import java.util.List;

public interface GroupDao {
    List<Student> getStudents();
    List<Schedule> getSchedules();
    List<Schedule> getSchedulesBySemester(String semester);
    List<Student> getStudentsByDirection(String direction);
    int getStudentsBeginYear();
}
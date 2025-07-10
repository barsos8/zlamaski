package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.DayOfWeek;
import java.util.List;

public interface ScheduleDao {
    void save(Schedule schedule);
    Schedule findById(Integer scheduleId);
    List<Schedule> findAll();
    List<Schedule> findByGroupId(Integer groupId);
    List<Schedule> findBySubjectId(Integer subjectId);
    List<Schedule> findBySemester(String semester);
    void update(Schedule schedule);
    void delete(Integer scheduleId);

    List<Schedule> getGroupSchedule(String semester, Integer groupId);
    List<Schedule> getScheduleByDay(String semester, DayOfWeek dayOfWeek, Integer groupId);
    List<Schedule> getScheduleByStudentBeginYear(String semester, Integer studentBeginYear);
    List<Schedule> getScheduleByDayAndStudentBeginYear(String semester, DayOfWeek dayOfWeek, Integer studentBeginYear);
}

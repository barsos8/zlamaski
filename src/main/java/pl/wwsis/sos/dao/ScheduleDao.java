package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Schedule;
import pl.wwsis.sos.model.Group;
import pl.wwsis.sos.model.DayOfWeek;
import java.util.List;

public interface ScheduleDao {

    List<Schedule> getSchedule(String semester, Group group);
    List<Schedule> getScheduleByDay(String semester, DayOfWeek dayOfWeek, Group group);
    List<Schedule> getScheduleByStudentBeginYear(String semester, int studentBeginYear);
    List<Schedule> getScheduleByDayAndStudentBeginYear(String semester, DayOfWeek dayOfWeek, int studentBeginYear);
}

package pl.wwsis.sos.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @Column(name = "schedule_id")
    private Integer scheduleId;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "semester", length = 20)
    private String semester;

    @Enumerated(EnumType.STRING)
    @Column(name = "day_of_week", length = 15)
    private DayOfWeek dayOfWeek;

    @Column(name = "start_time")
    private Time startTime;

    @Column(name = "end_time")
    private Time endTime;

    @Column(name = "room", length = 50)
    private String room;

    @Column(name = "subject_teach_id")
    private Integer subjectTeachId;

    // Gettery i Settery

    public Integer getScheduleId() { return scheduleId; }
    public void setScheduleId(Integer scheduleId) { this.scheduleId = scheduleId; }

    public Integer getSubjectId() { return subjectId; }
    public void setSubjectId(Integer subjectId) { this.subjectId = subjectId; }

    public Integer getGroupId() { return groupId; }
    public void setGroupId(Integer groupId) { this.groupId = groupId; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public DayOfWeek getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(DayOfWeek dayOfWeek) { this.dayOfWeek = dayOfWeek; }

    public Time getStartTime() { return startTime; }
    public void setStartTime(Time startTime) { this.startTime = startTime; }

    public Time getEndTime() { return endTime; }
    public void setEndTime(Time endTime) { this.endTime = endTime; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }

    public Integer getSubjectTeachId() { return subjectTeachId; }
    public void setSubjectTeachId(Integer subjectTeachId) { this.subjectTeachId = subjectTeachId; }
}

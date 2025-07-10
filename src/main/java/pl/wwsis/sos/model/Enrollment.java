package pl.wwsis.sos.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @Column(name = "enrollment_id")
    private Integer enrollmentId;

    @Column(name = "indeks_no", length = 20)
    private String indeksNo;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "schedule_id")
    private Integer scheduleId;

    @Column(name = "semester", length = 20)
    private String semester;

    @Column(name = "enrollment_date")
    private Timestamp enrollmentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private EnrollmentStatus status;

    @Column(name = "is_waiting_on_list")
    private Boolean isWaitingOnList;

    @Column(name = "resignation_deadline")
    private Date resignationDeadline;

    // Gettery i Settery

    public Integer getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(Integer enrollmentId) { this.enrollmentId = enrollmentId; }

    public String getIndeksNo() { return indeksNo; }
    public void setIndeksNo(String studentId) { this.indeksNo = indeksNo; }

    public Integer getSubjectId() { return subjectId; }
    public void setSubjectId(Integer subjectId) { this.subjectId = subjectId; }

    public Integer getScheduleId() { return scheduleId; }
    public void setScheduleId(Integer scheduleId) { this.scheduleId = scheduleId; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public Timestamp getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(Timestamp enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public EnrollmentStatus getStatus() { return status; }
    public void setStatus(EnrollmentStatus status) { this.status = status; }

    public Boolean getIsWaitingOnList() { return isWaitingOnList; }
    public void setIsWaitingOnList(Boolean isWaitingOnList) { this.isWaitingOnList = isWaitingOnList; }

    public Date getResignationDeadline() { return resignationDeadline; }
    public void setResignationDeadline(Date resignationDeadline) { this.resignationDeadline = resignationDeadline; }
}

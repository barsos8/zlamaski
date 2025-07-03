package pl.wwsis.sos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subject_teach")
public class SubjectTeach {

    @Id
    @Column(name = "subject_teach_id")
    private Integer subjectTeachId;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "semester", length = 20)
    private String semester;

    // Gettery i Settery

    public Integer getSubjectTeachId() { return subjectTeachId; }
    public void setSubjectTeachId(Integer subjectTeachId) { this.subjectTeachId = subjectTeachId; }

    public Integer getSubjectId() { return subjectId; }
    public void setSubjectId(Integer subjectId) { this.subjectId = subjectId; }

    public Integer getTeacherId() { return teacherId; }
    public void setTeacherId(Integer teacherId) { this.teacherId = teacherId; }

    public Integer getGroupId() { return groupId; }
    public void setGroupId(Integer groupId) { this.groupId = groupId; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
}

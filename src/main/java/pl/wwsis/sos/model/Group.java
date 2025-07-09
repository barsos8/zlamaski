package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "students_begin_year")
    private Integer studentsBeginYear;

    @Column(name = "study_direction", length = 100)
    private String studyDirection;

    // Gettery i Settery

    public Integer getGroupId() { return groupId; }
    public void setGroupId(Integer groupId) { this.groupId = groupId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getStudentsBeginYear() { return studentsBeginYear; }
    public void setStudentsBeginYear(Integer studentsBeginYear) { this.studentsBeginYear = studentsBeginYear; }

    public String getStudyDirection() { return studyDirection; }
    public void setStudyDirection(String studyDirection) { this.studyDirection = studyDirection; }
}

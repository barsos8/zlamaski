package pl.wwsis.sos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "semester", length = 20)
    private String semester;

    @Column(name = "ects")
    private Integer ects;

    @Column(name = "number_of_seats")
    private Integer numberOfSeats;

    // Gettery i Settery

    public Integer getSubjectId() { return subjectId; }
    public void setSubjectId(Integer subjectId) { this.subjectId = subjectId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public Integer getEcts() { return ects; }
    public void setEcts(Integer ects) { this.ects = ects; }

    public Integer getNumberOfSeats() { return numberOfSeats; }
    public void setNumberOfSeats(Integer numberOfSeats) { this.numberOfSeats = numberOfSeats; }
}

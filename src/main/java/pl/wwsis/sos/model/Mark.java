package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "marks")
public class Mark {

    @Id
    @Column(name = "mark_id")
    private Integer markId;

    @Column(name = "enrollment_id")
    private Integer enrollmentId;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "value")
    private Float value;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 20)
    private MarkType type;

    @Column(name = "comment", length = 5000)
    private String comment;

    // Gettery i Settery

    public Integer getMarkId() { return markId; }
    public void setMarkId(Integer markId) { this.markId = markId; }

    public Integer getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(Integer enrollmentId) { this.enrollmentId = enrollmentId; }

    public Timestamp getDate() { return date; }
    public void setDate(Timestamp date) { this.date = date; }

    public Float getValue() { return value; }
    public void setValue(Float value) { this.value = value; }

    public MarkType getType() { return type; }
    public void setType(MarkType type) { this.type = type; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}

package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    // Gettery i Settery

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }
}

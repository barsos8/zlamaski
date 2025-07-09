package pl.wwsis.sos.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "password_reset")
public class PasswordReset {

    @Id
    @Column(name = "reset_id")
    private Integer resetId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "token", length = 255)
    private String token;

    @Column(name = "request_date")
    private Timestamp requestDate;

    @Column(name = "completed")
    private Boolean completed;

    // Gettery i settery
    public Integer getResetId() { return resetId; }
    public void setResetId(Integer resetId) { this.resetId = resetId; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public Timestamp getRequestDate() { return requestDate; }
    public void setRequestDate(Timestamp requestDate) { this.requestDate = requestDate; }

    public Boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }
}

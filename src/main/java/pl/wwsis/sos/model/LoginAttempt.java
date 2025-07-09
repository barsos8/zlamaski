package pl.wwsis.sos.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "login_attempt")
public class LoginAttempt {

    @Id
    @Column(name = "login_attempt_id")
    private Integer loginAttemptId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "success")
    private Boolean success;

    @Column(name = "ip_address", length = 50)
    private String ipAddress;

    // Gettery i settery
    public Integer getLoginAttemptId() { return loginAttemptId; }
    public void setLoginAttemptId(Integer loginAttemptId) { this.loginAttemptId = loginAttemptId; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Timestamp getDate() { return date; }
    public void setDate(Timestamp date) { this.date = date; }

    public Integer getNumberAttempts() { return numberAttempts; }
    public void setNumberAttempts(Integer numberAttempts) { this.numberAttempts = numberAttempts; }

    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean success) { this.success = success; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
}

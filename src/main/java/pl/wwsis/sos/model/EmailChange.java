package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "email_change")
public class EmailChange {

    @Id
    @Column(name = "change_id")
    private Integer changeId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "new_email", length = 255)
    private String newEmail;

    @Column(name = "activation_link", length = 255)
    private String activationLink;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private EmailChangeStatus status;

    @Column(name = "request_date")
    private Timestamp requestDate;

    // Gettery i settery
    public Integer getChangeId() { return changeId; }
    public void setChangeId(Integer changeId) { this.changeId = changeId; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getNewEmail() { return newEmail; }
    public void setNewEmail(String newEmail) { this.newEmail = newEmail; }

    public String getActivationLink() { return activationLink; }
    public void setActivationLink(String activationLink) { this.activationLink = activationLink; }

    public EmailChangeStatus getStatus() { return status; }
    public void setStatus(EmailChangeStatus status) { this.status = status; }

    public Timestamp getRequestDate() { return requestDate; }
    public void setRequestDate(Timestamp requestDate) { this.requestDate = requestDate; }
}

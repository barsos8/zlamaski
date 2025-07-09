package pl.wwsis.sos.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "registration_token", length = 20)
    private String registrationToken;

    @Column(name = "last_login_date")
    private Timestamp lastLoginDate;

    @Column(name = "failed_login_attempts")
    private Integer failedLoginAttempts;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 50)
    private Role role;

    @Column(name = "status", nullable = false)
    private Boolean status;

    // Gettery i Settery

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public String getRegistrationToken() { return registrationToken; }
    public void setRegistrationToken(String registrationToken) { this.registrationToken = registrationToken; }

    public Timestamp getLastLoginDate() { return lastLoginDate; }
    public void setLastLoginDate(Timestamp lastLoginDate) { this.lastLoginDate = lastLoginDate; }

    public Integer getFailedLoginAttempts() { return failedLoginAttempts; }
    public void setFailedLoginAttempts(Integer failedLoginAttempts) { this.failedLoginAttempts = failedLoginAttempts; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
}


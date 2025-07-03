package pl.wwsis.sos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "two_factor_auth")
public class TwoFactorAuth {

    @Id
    @Column(name = "tfa_id")
    private Integer tfaId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "secret_key", length = 255)
    private String secretKey;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "verified_code", length = 10)
    private String verifiedCode;

    // Gettery i settery
    public Integer getTfaId() { return tfaId; }
    public void setTfaId(Integer tfaId) { this.tfaId = tfaId; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getSecretKey() { return secretKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    public Boolean getEnabled() { return enabled; }
    public void setEnabled(Boolean enabled) { this.enabled = enabled; }

    public String getVerifiedCode() { return verifiedCode; }
    public void setVerifiedCode(String verifiedCode) { this.verifiedCode = verifiedCode; }
}

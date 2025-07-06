package pl.wwsis.sos.dao;

public interface PasswordResetDao {
    Boolean resetPassword(String token, String newPassword);
    void requestPasswordReset(String email);
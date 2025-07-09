package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.PasswordReset;
import java.util.List;

public interface PasswordResetDao {
    void save(PasswordReset passwordReset);
    PasswordReset findById(Integer resetId);
    PasswordReset findByToken(String token);
    List<PasswordReset> findAll();
    List<PasswordReset> findByUserId(Integer userId);
    void update(PasswordReset passwordReset);
    void delete(PasswordReset passwordReset);

    Boolean resetPassword(String token, String newPassword);
    void requestPasswordReset(Integer userId);
}

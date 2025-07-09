package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;

public interface LoginAttemptDao {
    void save(LoginAttempt loginAttempt);
    LoginAttempt findById(Integer loginAttemptId);
    List<LoginAttempt> findAll();
    List<LoginAttempt> findByUserId(Integer userId);
    void delete(Integer loginAttemptId);

    boolean shouldLockAccount(Integer userId)
    int countFailedAttempts(Integer userId); // ile nieudanych prób z rzędu
    void resetFailedAttempts(Integer userId);
}
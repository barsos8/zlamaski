package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.User;
import pl.wwsis.sos.model.LoginAttempt;
import java.util.List;

public interface UserDao {
    void save(User user);
    User findById(Integer userId);
    List<User> findAll();
    User findByEmail(String email);
    void update(User user);
    void delete(Integer userId);

    boolean login(String email, String password);
    void logout(Integer userId);
    boolean resetPassword(String email);
    boolean register(User user);
    boolean activateAccount(String token);
    boolean changePassword(Integer userId, String oldPassword, String newPassword);
    void editProfile(User user);
    List<LoginAttempt> getLoginAttempts(Integer userId);
}

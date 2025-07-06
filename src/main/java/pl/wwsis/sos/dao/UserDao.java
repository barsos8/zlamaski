package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.User;
import pl.wwsis.sos.model.LoginAttempt;
import java.util.List;

public interface UserDao {
    
    boolean login(String email, String password);
    void logout();
    boolean resetPassword(String email);
    boolean register();
    boolean activateAccount(String token);
    boolean changePassword(String oldPassword, String newPassword);
    void editProfile(User user);
    List<LoginAttempt> getLoginAttempts();
    List<User> getAllUsers();
}

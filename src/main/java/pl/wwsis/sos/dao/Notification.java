package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.User;
import pl.wwsis.sos.model.Group;
import pl.wwsis.sos.model.Role;
import pl.wwsis.sos.model.NotificationChannel;
import java.util.List;



public interface NotificationDao {
    void save(Notification notification);
    Notification findById(Integer notificationId);
    List<Notification> findAll();
    List<Notification> findByUserId(Integer userId);
    List<Notification> findByGroupId(Integer groupId);
    List<Notification> findByRole(Role role);
    void update(Notification notification);
    void delete(Integer notificationId);

    void sendToUsersByRole(Role role, String message, List<NotificationChannel> channel, NotificationType type);
    void sendToUsers(List<User> users, String message, List<NotificationChannel> channels, NotificationType type);
    void sendToGroup(Group group, String message, List<NotificationChannel> channel, NotificationType type);
    void sendToDirection(List<Group> groups, String direction, String message, List<NotificationChannel> channels, NotificationType type);
}

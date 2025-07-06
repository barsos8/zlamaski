package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.User;
import pl.wwsis.sos.model.Group;
import pl.wwsis.sos.model.Role;
import pl.wwsis.sos.model.NotificationChannel;
import java.util.List;



public interface Notification {
    void sendToUsersByRole(Role role, String message, List<NotificationChannel> channel);
    void sendToUsers(List<User> users, String message, List<NotificationChannel> channels);
    void sendToGroup(Group group, String message, List<NotificationChannel> channel);
    void sendToDirection(List<Group> groups, String direction, String message, List<NotificationChannel> channels);
}

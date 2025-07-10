package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Group;
import java.util.List;

public interface GroupDao {
    Group findById(Integer groupId);
    List<Group> findAll();
    List<Group> findByStudyDirection(String studyDirection);
    void save(Group group);
    void update(Group group);
    void delete(Integer groupId);
}
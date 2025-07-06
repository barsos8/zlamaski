package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Teacher;
import pl.wwsis.sos.model.Group;
import pl.wwsis.sos.model.SubjectTeach;

public interface SubjectTeachDao {

    SubjectTeach assignTeacher(Subject subject, Teacher teacher, Group group);
}

package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Subject;
import pl.wwsis.sos.model.Teacher;
import pl.wwsis.sos.model.Group;
import pl.wwsis.sos.model.SubjectTeach;

import java.util.List;

public interface SubjectTeachDao {
    void save(SubjectTeach subjectTeach);
    SubjectTeach findById(Integer subjectTeachId);
    List<SubjectTeach> findAll();
    List<SubjectTeach> findByTeacherId(Integer teacherId);
    List<SubjectTeach> findByGroupId(Integer groupId);
    List<SubjectTeach> findBySubjectId(Integer subjectId);
    void update(SubjectTeach subjectTeach);
    void delete(Integer subjectTeachId);

    SubjectTeach assignTeacher(Subject subject, Teacher teacher, Group group);
}

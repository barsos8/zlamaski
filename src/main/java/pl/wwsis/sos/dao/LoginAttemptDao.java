package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;

public interface LoginAttemptDao {
    Boolean checkIfShouldLock(Student student);
}
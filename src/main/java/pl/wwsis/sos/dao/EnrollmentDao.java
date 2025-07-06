package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Mark;
import java.util.List;

public interface EnrollmentDao {
    Boolean confirmEnrollment();
    Boolean withdrawEnrollment();
    Boolean checkWaitlistStatus();
    Boolean isOnWaitlist();
    List<Mark> getMarks();
}
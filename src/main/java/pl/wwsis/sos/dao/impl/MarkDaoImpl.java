package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.MarkDao;
import pl.wwsis.sos.model.Mark;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MarkDaoImpl implements MarkDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Mark findById(Integer markId) {
        return entityManager.find(Mark.class, markId);
    }

    @Override
    public List<Mark> findAll() {
        return entityManager.createQuery("SELECT m FROM Mark m", Mark.class).getResultList();
    }

    @Override
    public void save(Mark mark) {
        entityManager.persist(mark);
    }

    @Override
    public void update(Mark mark) {
        entityManager.merge(mark);
    }

    @Override
    public void delete(Integer markId) {
        Mark m = findById(markId);
        if (m != null) entityManager.remove(m);
    }

    @Override
    public float getValue(Integer markId) {
        Mark mark = entityManager.createQuery(
                        "SELECT m FROM Mark m WHERE m.markId = :markId", Mark.class)
                .setParameter("markId", markId)
                .getSingleResult();
        return mark.getValue();
    }

    @Override
    public Boolean isFinal(Integer markId) {
        Mark mark = entityManager.createQuery(
                        "SELECT m FROM Mark m WHERE m.markId = :markId", Mark.class)
                .setParameter("markId", markId)
                .getSingleResult();
        return mark.isFinal();
    }

    @Override
    public List<Mark> findByEnrollmentId(Integer enrollmentId) {
        return entityManager.createQuery(
                        "SELECT m FROM Mark m WHERE m.enrollmentId = :enrollmentId", Mark.class)
                .setParameter("enrollmentId", enrollmentId)
                .getResultList();
    }

    @Override
    public List<Mark> findByStudentIndeks(String indeksNo) {
        return entityManager.createQuery(
                        "SELECT m FROM Mark m JOIN Enrollment e ON m.enrollmentId = e.enrollmentId WHERE e.indeksNo = :indeksNo", Mark.class)
                .setParameter("indeksNo", indeksNo)
                .getResultList();
    }

    @Override
    public List<Mark> listStudentMarksBySubjectAndSemester(String indeksNo, Integer subjectId, String semester) {
        return entityManager.createQuery(
                        "SELECT m FROM Mark m JOIN Enrollment e ON m.enrollmentId = e.enrollmentId WHERE e.indeksNo = :indeksNo AND e.subjectId = :subjectId AND e.semester = :semester", Mark.class)
                .setParameter("indeksNo", indeksNo)
                .setParameter("subjectId", subjectId)
                .setParameter("semester", semester)
                .getResultList();
    }
}
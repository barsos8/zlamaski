package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.MarkDao;
import pl.wwsis.sos.model.Mark;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

public class MarkDaoImpl implements MarkDao {

    @PersistenceContext
    private EntityManager entityManager;

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
}
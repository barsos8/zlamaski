package pl.wwsis.sos.dao.impl;

import pl.wwsis.sos.dao.EmailChangeDao;
import pl.wwsis.sos.model.EmailChange;
import pl.wwsis.sos.model.EmailChangeStatus;
import javax.transaction.Transactional;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

@Transactional
public class EmailChangeDaoImpl implements EmailChangeDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Void Confirm(Integer change_id) {
        EmailChange emailChange = entityManager
            .createQuery("SELECT e FROM EmailChange e WHERE e.changeId = :changeId", EmailChange.class)
            .setParameter("changeId", change_id)
            .getSingleResult();

        emailChange.setStatus(EmailChangeStatus.CONFIRMED);
        entityManager.merge(emailChange);
        return null;
    }
}

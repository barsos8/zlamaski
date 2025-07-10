package pl.wwsis.sos.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.dao.PaymentDao;
import pl.wwsis.sos.model.Student;

import java.util.List;


public class PaymentDaoImpl implements PaymentDao {

    private EntityManager entityManager;

    public PaymentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Payment> viewPaymentsHistory(Student student) {
        String studentIndeksNo = student.getIndeksNo();
        Query query = entityManager.createQuery("SELECT p FROM Payment p WHERE p.indeksNo = :studentIndeksNo");
        query.setParameter("studentIndeksNo", studentIndeksNo);
        return query.getResultList();
    }

    @Override
    public Boolean checkOutstandingPayments(Student student) {
        String studentIndeksNo = student.getIndeksNo();
        Query query = entityManager.createQuery("SELECT COUNT(p) > 0 FROM Payment p WHERE p.indeksNo = :studentIndeksNo AND p.status = 'OVERDUE'");
        query.setParameter("studentIndeksNo", studentIndeksNo);
        return (Boolean) query.getSingleResult();
    }
}
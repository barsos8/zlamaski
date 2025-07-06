package pl.wwsis.sos.dao.impl;
<<<<<<< HEAD

import javax.persistence.EntityManager;
import javax.persistence.Query;
import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.dao.PaymentDao;
import pl.wwsis.sos.model.Student;
=======
import javax.persistance.EntityManager;
import javax.persistance.Query;
import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.dao.PaymentDao;
import pl.wwsis.sos.dao.StudentDao;
>>>>>>> f6c92cda40027b1535ed441659cc96ddc89aec04
import java.util.List;


public class PaymentDaoImpl implements PaymentDao {

    private EntityManager entityManager;

    public PaymentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Payment> viewPaymentsHistory(Student student) {
        Query query = entityManager.createQuery("SELECT p FROM Payment p WHERE p.student = :student");
        query.setParameter("student", student);
        return query.getResultList();
    }

    @Override
    public Boolean checkOutstandingPayments(Student student) {
        Query query = entityManager.createQuery("SELECT COUNT(p) > 0 FROM Payment p WHERE p.student = :student AND p.status = 'OVERDUE'");
        query.setParameter("student", student);
        return (Boolean) query.getSingleResult();
    }
}
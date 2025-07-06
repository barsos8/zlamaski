package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Payment;
import pl.wwsis.sos.model.Student;
import java.util.List;

public interface PaymentDao {

    List<Payment> viewPaymentsHistory(Student student);
    Boolean checkOutstandingPayments(Student student);
}

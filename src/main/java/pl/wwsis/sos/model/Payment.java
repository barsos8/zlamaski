package pl.wwsis.sos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "indeks_no", length = 20)
    private String indeksNo;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private PaymentStatus status;
    
    // Gettery i settery
    public Integer getPaymentId() { return paymentId; }
    public void setPaymentId(Integer paymentId) { this.paymentId = paymentId; }

    public String getIndeksNo() { return indeksNo; }
    public void setIndeksNo(String indeksNo) { this.indeksNo = indeksNo; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Timestamp getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Timestamp paymentDate) { this.paymentDate = paymentDate; }

    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus status) { this.status = status; }
}

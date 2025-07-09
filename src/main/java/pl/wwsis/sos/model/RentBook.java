package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "rent_book")
public class RentBook {

    @Id
    @Column(name = "rent_book_id")
    private Integer rentBookId;

    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "indeks_no", length = 20)
    private String indeksNo;

    @Column(name = "rent_date")
    private Timestamp rentDate;

    @Column(name = "return_date")
    private Timestamp returnDate;

    @Column(name = "returned")
    private Boolean returned;

    @Column(name = "overdue")
    private Boolean overdue;

    // Gettery i settery
    public Integer getRentBookId() { return rentBookId; }
    public void setRentBookId(Integer rentBookId) { this.rentBookId = rentBookId; }

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public Timestamp getRentDate() { return rentDate; }
    public void setRentDate(Timestamp rentDate) { this.rentDate = rentDate; }

    public Timestamp getReturnDate() { return returnDate; }
    public void setReturnDate(Timestamp returnDate) { this.returnDate = returnDate; }

    public Boolean getReturned() { return returned; }
    public void setReturned(Boolean returned) { this.returned = returned; }

    public Boolean getOverdue() { return overdue; }
    public void setOverdue(Boolean overdue) { this.overdue = overdue; }
}

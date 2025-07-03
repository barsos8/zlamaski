package pl.wwsis.sos.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "author", length = 255)
    private String author;

    @Column(name = "publisher", length = 255)
    private String publisher;

    @Column(name = "issue_date")
    private Date issueDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private BookStatus status;

    // Gettery i Settery

    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Date getIssueDate() { return issueDate; }
    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }

    public BookStatus getStatus() { return status; }
    public void setStatus(BookStatus status) { this.status = status; }
}

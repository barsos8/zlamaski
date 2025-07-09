package pl.wwsis.sos.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "indeks_no", length = 20)
    private String indeksNo;

    @Column(name = "user_id", nullable = false, unique = true)
    private Integer userId;

    @Column(name = "group_id")
    private Integer groupId;

    // Gettery i Settery

    public String getIndeksNo() { return indeksNo; }
    public void setIndeksNo(String indeksNo) { this.indeksNo = indeksNo; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getGroupId() { return groupId; }
    public void setGroupId(Integer groupId) { this.groupId = groupId; }
}

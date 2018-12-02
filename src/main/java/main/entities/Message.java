package main.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    private String message;

    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private User author;

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public User getAuthor() {
        return author;
    }

    public Date getDate() {
        return createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

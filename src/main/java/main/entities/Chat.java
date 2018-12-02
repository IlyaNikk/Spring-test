package main.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "creator")
    private User creator;

    @ManyToMany
    @JoinTable(
            name = "Chat_OurUser",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "our_user_id")
    )
    private List<User> user;

    private String title;

    @Column(name = "create_date")
    private Date createDate;

    public Chat(){}

    public Chat(String title, User creator) {
        this.title = title;
        this.creator = creator;
        this.createDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public User getCreator() {
        return creator;
    }

    public List<User> getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

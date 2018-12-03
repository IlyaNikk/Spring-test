package main.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

public class Chat {

    private Long id;

    private User creator;

    private List<User> user;

    private String title;

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
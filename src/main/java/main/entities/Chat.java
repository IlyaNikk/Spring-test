package main.entities;

import java.util.Date;

public class Chat {

    private Long id;

    private User creator;

    private User user;

    private String title;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public User getCreator() {
        return creator;
    }

    public User getUser() {
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

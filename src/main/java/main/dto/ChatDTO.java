package main.dto;

import main.entities.User;

import java.util.ArrayList;
import java.util.Date;

public class ChatDTO {

    private Long id;

    private Long creatorId;

    private User creator;

    private ArrayList<User> user;

    private String title;

    private Date createDate;

    public ChatDTO(Long id, User creator, String title, Date createDate){
        this.id = id;
        this.creator = creator;
        this.title = title;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public User getCreator() {
        return creator;
    }

    public ArrayList<User> getUser() {
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

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}
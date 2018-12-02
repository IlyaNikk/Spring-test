package main.dto;

import java.util.Date;

public class UserDTO {

    private Long id;

    private String name;

    private String firstName;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDate() {
        return createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

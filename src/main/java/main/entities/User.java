package main.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OurUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "our_user_id")
    private Long id;

    private String name;

    @Column(name = "fisrt_name")
    private String firstName;

    @Column(name = "create_date")
    private Date createDate;

    public User() {

    }

    public User(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
        createDate = new Date();
    }

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

package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 鲜花表
 */
@Entity
@Table(name = "t_beautician")
public class Flower implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctor;  //医师对象
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;      //用户对象

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}




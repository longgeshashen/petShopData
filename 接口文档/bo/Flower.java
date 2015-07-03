package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * �ʻ���
 */
@Entity
@Table(name = "t_beautician")
public class Flower implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctor;  //ҽʦ����
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;      //�û�����

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




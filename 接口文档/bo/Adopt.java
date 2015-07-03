package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 领养信息表
 */

@Entity
@Table(name = "t_adopt")
public class Adopt implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "adoptPetId")
    private AdoptPet adoptPet; //领养宠物对象
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;      //用户对象
    private String name;    //领养人姓名
    private String phone;   //领养人手机
    private String qq;      //领养人QQ
    private String address;  //领养人地址
    private String remarks;  //标注
    private int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AdoptPet getAdoptPet() {
        return adoptPet;
    }

    public void setAdoptPet(AdoptPet adoptPet) {
        this.adoptPet = adoptPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}




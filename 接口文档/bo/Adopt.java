package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;

/**
 * ������Ϣ��
 */

@Entity
@Table(name = "t_adopt")
public class Adopt implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "adoptPetId")
    private AdoptPet adoptPet; //�����������
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;      //�û�����
    private String name;    //����������
    private String phone;   //�������ֻ�
    private String qq;      //������QQ
    private String address;  //�����˵�ַ
    private String remarks;  //��ע
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




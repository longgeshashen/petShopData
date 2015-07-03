package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Eric
 * Date: 13-7-25
 * Time: 上午9:34
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {
    public static final String SESSION_KEY = "session_user";
    @Id
    @GeneratedValue
    private long id;
    private String userName; //用户名
    private String password;//密码
    private String nickName; //昵称
    private String sign;    //用户签名
    private String picUrl;  //用户头像地址
    @OneToMany
    @JoinColumn(name = "petId")
    private Set<Pet> petSet;    //宠物对象
    private long integral;      //用户积分
    private int status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Set<Pet> getPetSet() {
        return petSet;
    }

    public void setPetSet(Set<Pet> petSet) {
        this.petSet = petSet;
    }

    public long getIntegral() {
        return integral;
    }

    public void setIntegral(long integral) {
        this.integral = integral;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

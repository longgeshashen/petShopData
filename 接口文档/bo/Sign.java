package com.cwapp.admin.bo;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户签到表.
 */
@Entity
@Table(name = "t_sign")
public class Sign implements Serializable {
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;//用户对象
    @Expose
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

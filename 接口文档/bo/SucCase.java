package com.cwapp.admin.bo;


import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 美容师成功案例
 */
@Entity
@Table(name = "t_suc_case")
public class SucCase implements Serializable {
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @Expose
    private String content;//案例内容
    @ManyToOne
    @JoinColumn(name = "beauticianId")
    private Beautician beautician;//美容师对象
    @Expose
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Beautician getBeautician() {
        return beautician;
    }

    public void setBeautician(Beautician beautician) {
        this.beautician = beautician;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}




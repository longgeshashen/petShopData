package com.cwapp.admin.bo;


import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 医师成功案例
 */
@Entity
@Table(name = "t_suc_case_doctor")
public class SucCaseDoctor implements Serializable {
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @Expose
    private String content; //内容
    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctor; //医生对象
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}




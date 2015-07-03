package com.cwapp.admin.bo;


import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ����ʦ�ɹ�����
 */
@Entity
@Table(name = "t_suc_case")
public class SucCase implements Serializable {
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @Expose
    private String content;//��������
    @ManyToOne
    @JoinColumn(name = "beauticianId")
    private Beautician beautician;//����ʦ����
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




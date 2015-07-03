package com.cwapp.admin.bo;


import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 美容师
 */
@Entity
@Table(name = "t_beautician")
public class Beautician implements Serializable {
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @Expose
    private String name;    //姓名
    @Expose
    private String phone;   //手机
    @Expose
    private String title;   //
    @Expose
    private String belongTo;//所属机构
    @Expose
    private String cureObject;//对象
    @Expose
    private int star;       //星级
    @Expose
    private int qualifications; //资格认证
    @Expose
    private int status;    //状态
    @Lob
    @Expose
    private String content; //详情
    @Expose
    private Date createTime;
    @Expose
    private String pickUrl; //头像地址
    @Expose
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="beautician")
    private Set<SucCase> caseSet; //成功案例

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }

    public String getCureObject() {
        return cureObject;
    }

    public void setCureObject(String cureObject) {
        this.cureObject = cureObject;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getQualifications() {
        return qualifications;
    }

    public void setQualifications(int qualifications) {
        this.qualifications = qualifications;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPickUrl() {
        return pickUrl;
    }

    public void setPickUrl(String pickUrl) {
        this.pickUrl = pickUrl;
    }

    public Set<SucCase> getCaseSet() {
        return caseSet;
    }

    public void setCaseSet(Set<SucCase> caseSet) {
        this.caseSet = caseSet;
    }
}




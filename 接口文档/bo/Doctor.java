package com.cwapp.admin.bo;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * ҽʦ��
 */
@Entity
@Table(name = "t_doctor")
public class Doctor implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Expose
    private String name;    //����
    @Expose
    private String phone;   //�ֻ�����
    @Expose
    private String title;   //����
    @Expose
    private String hospital;   //����ҽԺ
    @Expose
    private int status;
    @Lob
    @Expose
    private String content; //���ݼ��
    @Expose
    private int star;    //�Ǽ�
    @Expose
    private Date createTime;
    @Expose
    private String pickUrl;     //ͷ���ַ
    @Expose
    private String cureObject;    //ҽ�ƶ���
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="doctor")
    @Expose
    private Set<SucCaseDoctor> caseDoctorSet;   //ҽʦ�ɹ�����

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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
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

    public String getCureObject() {
        return cureObject;
    }

    public void setCureObject(String cureObject) {
        this.cureObject = cureObject;
    }

    public Set<SucCaseDoctor> getCaseDoctorSet() {
        return caseDoctorSet;
    }

    public void setCaseDoctorSet(Set<SucCaseDoctor> caseDoctorSet) {
        this.caseDoctorSet = caseDoctorSet;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}

package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;

/**
 * ���������
 */

@Entity
@Table(name = "t_adopt_pet")
public class AdoptPet implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String title;   //����
    private String content; //����
    private String name;    //����
    private String variety;  //Ʒ��
    private String age;     //����
    private int sex;        //�Ա�
    private String otherInfo; //������Ϣ
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}




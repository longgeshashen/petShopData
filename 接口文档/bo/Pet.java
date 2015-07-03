package com.cwapp.admin.bo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 宠物表
 */
@Entity
@Table(name = "t_pet")
public class Pet implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;    //姓名
    private String variety; //品种

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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}




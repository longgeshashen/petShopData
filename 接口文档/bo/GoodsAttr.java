package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品属性表
 */
@Entity
@Table(name = "t_goods_attr")
public class GoodsAttr implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String description;//属性描述
    private int type;  //商品属性 1：尺码 2：颜色
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

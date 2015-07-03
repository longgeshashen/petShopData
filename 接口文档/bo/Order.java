package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 */
@Entity
@Table(name = "t_order")
public class Order implements Serializable {
    public static final int PAY_STATUS_NOTPAY= 0;//待付款
    public static final int PAY_STATUS_PAYING= 1;//已付款
    @Id
    @GeneratedValue
    private long id;
    private Date createTime;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;  //用户对象
    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;//商品对象
    private int num;    //购买数量
    private BigDecimal price;   //总钱数
    private int payStatus;  //支付状态 0：待付款 1：已付款
    private String orderNo; //订单号
    private Date updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

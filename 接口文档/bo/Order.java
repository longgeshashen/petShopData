package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ������
 */
@Entity
@Table(name = "t_order")
public class Order implements Serializable {
    public static final int PAY_STATUS_NOTPAY= 0;//������
    public static final int PAY_STATUS_PAYING= 1;//�Ѹ���
    @Id
    @GeneratedValue
    private long id;
    private Date createTime;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;  //�û�����
    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;//��Ʒ����
    private int num;    //��������
    private BigDecimal price;   //��Ǯ��
    private int payStatus;  //֧��״̬ 0�������� 1���Ѹ���
    private String orderNo; //������
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

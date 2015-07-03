package com.cwapp.admin.bo;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *订单评价表
 */
@Entity
@Table(name = "t_evaluation")
public class Evaluation implements Serializable {
    public static final int type_1 = 1;  //好评
    public static final int type_2 = 2; //一般
    public static final int type_3 = 3; //差评
    @Id
    @GeneratedValue
    @Expose
    private long id;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;  //订单对象
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;  //用户对象
    @Expose
    private String content; //评价内容
    @Expose
    private Date createTime;
    @Expose
    private int type;  //评价级别 1：好评 2：一般 3：差评

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

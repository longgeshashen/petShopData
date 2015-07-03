package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ��Ʒ����Ʒ���Թ�����
 */
@Entity
@Table(name = "t_goods_attr_relation")
public class GoodsAttrRelation implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;    //��Ʒ��
    @ManyToOne
    @JoinColumn(name = "goodsAttrId")
    private GoodsAttr goodsAttr;//��Ʒ����

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Goods getGoods(Goods goods) {
        return this.goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsAttr getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(GoodsAttr goodsAttr) {
        this.goodsAttr = goodsAttr;
    }
}

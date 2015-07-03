package com.cwapp.admin.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2015/6/8.
 */
@Entity
@Table(name = "t_goods")
public class Goods implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;//名称
    private BigDecimal price;//价格
    private String picUrl;//图片地址
    private int judgeNum; //评价数量
    private int saleNum;//销售数量
    private String info;//详情
    @ManyToOne
    @JoinColumn(name = "shopId")
    private Shop shop;//店铺对象
    private Date createTime;
    private int status;//状态
    private int type; //商品类型 1：狗狗用品  2：猫猫用品 3：小宠用品 4：水族用品

    private int groupBuy;//是否团购 1：参加 0：不参加
    private BigDecimal groupPrice;//团购价格
    private int scoreBuy;;//是否积分 1：参加 0：不参加
    private long scorePrice;//所需积分

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(int judgeNum) {
        this.judgeNum = judgeNum;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getGroupBuy() {
        return groupBuy;
    }

    public void setGroupBuy(int groupBuy) {
        this.groupBuy = groupBuy;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public int getScoreBuy() {
        return scoreBuy;
    }

    public void setScoreBuy(int scoreBuy) {
        this.scoreBuy = scoreBuy;
    }

    public long getScorePrice() {
        return scorePrice;
    }

    public void setScorePrice(long scorePrice) {
        this.scorePrice = scorePrice;
    }

    public String getTypeName() {
        if (type == 1) {
            return "狗狗用品";
        }
        if (type == 2) {
            return "猫猫用品";
        }
        if (type == 3) {
            return "小宠用品";
        }
        if (type == 4) {
            return "水族用品";
        }
        return "狗狗用品";
    }
}

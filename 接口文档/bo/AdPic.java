package com.cwapp.admin.bo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ��ҳ���ͼ
 */

@Entity
@Table(name = "t_ad_pic")
public class AdPic implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String picUrl; //ͼƬ��ַ
    private String content;//ͼƬ˵��
    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;//��Ӧ����Ʒ

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}




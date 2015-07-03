package com.cwapp.admin.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付宝返回信息存储表
 */
@Entity
@Table(name = "t_alipay_return")
public class AlipayReturn implements Serializable {
    public static final int RETURN_TYPE_TB = 1;//同步
    public static final int RETURN_TYPE_YB = 2;//异步
    @Id
    @GeneratedValue
    private long id; //主键id
    private int returnType; //通知类型 1：同步，2：异步
    private String isSuccess; //成功标识
    private String partner; // 合作者身份ID
    private String signType; //签名方式
    private String sign; //签名
    private String inputCharset; //字符编码格式
    private String notifyType; //通知类型
    private String notifyId;  //支付宝通知校验ID
    private Date notifyTime; //通知时间
    private String orderNo; //支付宝合作商户网站唯一订单号
    private String subject; //订单名称
    private BigDecimal price;//价格
    private int quantity;//商品数量
    private String sellerEmail;//签约支付宝账号或卖家支付宝帐户
    private String buyerEmail;//买家登录支付宝账号
    private String sellerId;//卖家支付宝账号对应的支付宝唯一用户号
    private String buyerId;//买家支付宝账号对应的支付宝唯一用户号
    private BigDecimal totalFee;//交易总金额
    private String tradeStatus;//交易状态
    private BigDecimal discount;//
    private String isTotalFeeAdjust; //总价是否调整过
    private String useCoupon; //是否使用红包
    private String body;//对一笔交易的具体描述信息
    private String gatheringType;//收款类型
    private String service;//接口名称
    private Date gmtCreate;//该笔交易创建的时间
    private String sellerActions;//卖家的后续动作列表
    private String buyerActions;//买家的后续动作列表
    private Date gmtPayment;//交易支付时间
    private String tradeNo;//支付宝根据商户请求，创建订单生成的支付宝交易号。
    private String sellerType;//卖家类型
    private String buyerAccount;//买家支付宝账号
    private String buyerType;//买家类型
    private String tradeType;//交易类型
    private String operatorRole;
    private Date createTime;//该笔交易创建的时间。
    private String currency;//货币代码
    Date modifiedTime;//交易最后修改时间
    private Date addTime;//添加时间
    private String remark;//备注

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public int getReturnType() {
        return returnType;
    }


    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }


    public String getIsSuccess() {
        return isSuccess;
    }


    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }


    public String getPartner() {
        return partner;
    }


    public void setPartner(String partner) {
        this.partner = partner;
    }


    public String getSignType() {
        return signType;
    }


    public void setSignType(String signType) {
        this.signType = signType;
    }


    public String getSign() {
        return sign;
    }


    public void setSign(String sign) {
        this.sign = sign;
    }


    public String getInputCharset() {
        return inputCharset;
    }


    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }


    public String getNotifyType() {
        return notifyType;
    }


    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }


    public String getNotifyId() {
        return notifyId;
    }


    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }


    public Date getNotifyTime() {
        return notifyTime;
    }


    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }


    public String getOrderNo() {
        return orderNo;
    }


    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getSellerEmail() {
        return sellerEmail;
    }


    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }


    public String getBuyerEmail() {
        return buyerEmail;
    }


    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }


    public String getSellerId() {
        return sellerId;
    }


    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }


    public String getBuyerId() {
        return buyerId;
    }


    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }


    public BigDecimal getTotalFee() {
        return totalFee;
    }


    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }


    public String getTradeStatus() {
        return tradeStatus;
    }


    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }


    public BigDecimal getDiscount() {
        return discount;
    }


    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }


    public String getIsTotalFeeAdjust() {
        return isTotalFeeAdjust;
    }


    public void setIsTotalFeeAdjust(String isTotalFeeAdjust) {
        this.isTotalFeeAdjust = isTotalFeeAdjust;
    }


    public String getUseCoupon() {
        return useCoupon;
    }


    public void setUseCoupon(String useCoupon) {
        this.useCoupon = useCoupon;
    }


    public String getBody() {
        return body;
    }


    public void setBody(String body) {
        this.body = body;
    }


    public String getGatheringType() {
        return gatheringType;
    }


    public void setGatheringType(String gatheringType) {
        this.gatheringType = gatheringType;
    }


    public String getService() {
        return service;
    }


    public void setService(String service) {
        this.service = service;
    }


    public Date getGmtCreate() {
        return gmtCreate;
    }


    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    public String getSellerActions() {
        return sellerActions;
    }


    public void setSellerActions(String sellerActions) {
        this.sellerActions = sellerActions;
    }


    public String getBuyerActions() {
        return buyerActions;
    }


    public void setBuyerActions(String buyerActions) {
        this.buyerActions = buyerActions;
    }


    public Date getGmtPayment() {
        return gmtPayment;
    }


    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }


    public String getTradeNo() {
        return tradeNo;
    }


    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }


    public String getSellerType() {
        return sellerType;
    }


    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }


    public String getBuyerAccount() {
        return buyerAccount;
    }


    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }


    public String getBuyerType() {
        return buyerType;
    }


    public void setBuyerType(String buyerType) {
        this.buyerType = buyerType;
    }


    public String getTradeType() {
        return tradeType;
    }


    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }


    public String getOperatorRole() {
        return operatorRole;
    }


    public void setOperatorRole(String operatorRole) {
        this.operatorRole = operatorRole;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public Date getModifiedTime() {
        return modifiedTime;
    }


    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }


    public Date getAddTime() {
        return addTime;
    }


    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }


    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }

}

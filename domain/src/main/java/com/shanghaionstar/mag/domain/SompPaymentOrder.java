package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_SOMP_OP_ORDER")
public class SompPaymentOrder implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = -8993615287794567231L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "ACCOUNT_ID")
	private String  account_id;

	@Column(name = "ORDER_AMOUNT")
	private BigDecimal orderAmount;

	@Column(name = "CHINAUNION_AMOUNT")
	private BigDecimal chinaunionAmount;


	@Column(name = "COUPON_AMOUNT")
	private BigDecimal couponAmount;

	@Column(name = "COUPON_ID")
	private String couponId;

	@Column(name = "PAY_ROLE")
	private String payRole;

	@Column(name="PAY_USERID")
	private BigDecimal payUserId;
	
	@Column(name = "VIN")
	private String vin;
	
	@Column(name = "PAYER")
	private String payer;
	
	@Column(name = "OFFER_NAME")
	private String offerName;
	
	@Column(name = "OFFER_ID")
	private String offerId;
	
	@Column(name = "PRICE_PLAN")
	private String pricePlan;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private String endDate;
	
	@Column(name = "DURATION")
	private int duration;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "LOCALE")
	private String locale;
	
	@Column(name = "DELETE_FLAG")
	private int deleteFlag;
	
	@Column(name = "PRODUCT_NUMBER")
	private String productNumber;
	
	@Column(name = "COUPON_TYPE")
	private String couponType;
	
	@Column(name = "WEB_ORDER_ID")
	private String webOrderId;
	
	@Column(name = "PAYMENT_METHOD")
	private String paymentMethod;
	
	@Column(name = "CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Column(name = "CREATED_BY")
	private String createBy;
	
	@Column(name = "LAST_UPDATED_TIMESTAMP")
	private Date lastUpdatedTime;
	
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdateBy;
	
	@Column(name="PORTAL_ID")
    private Long portalId;
	
	@Column(name = "DISCOUNT_ID")
	private String discountId;
	
	@Column(name = "IDPID")
	private String idpuserId;
	

	public Long getPortalId() {
		return portalId;
	}

	public void setPortalId(Long portalId) {
		this.portalId = portalId;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getChinaunionAmount() {
		return chinaunionAmount;
	}

	public void setChinaunionAmount(BigDecimal chinaunionAmount) {
		this.chinaunionAmount = chinaunionAmount;
	}

	public BigDecimal getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getPayRole() {
		return payRole;
	}

	public void setPayRole(String payRole) {
		this.payRole = payRole;
	}

	public BigDecimal getPayUserId() {
		return payUserId;
	}

	public void setPayUserId(BigDecimal payUserId) {
		this.payUserId = payUserId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getPricePlan() {
		return pricePlan;
	}

	public void setPricePlan(String pricePlan) {
		this.pricePlan = pricePlan;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getWebOrderId() {
		return webOrderId;
	}

	public void setWebOrderId(String webOrderId) {
		this.webOrderId = webOrderId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public String getIdpuserId() {
		return idpuserId;
	}

	public void setIdpuserId(String idpuserId) {
		this.idpuserId = idpuserId;
	}

	

}

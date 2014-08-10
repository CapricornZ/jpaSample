/**
 *
 */
package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Andy
 */
@Entity
@Table(name = "T_SOMP_PREPAID_CARD_ORDER")
public class PrepaidCardOrder implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7435357374784374314L;

    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    
	@Column(name="CARD_NO")
	private String cardNo;
	
	@Column(name="VIN")
	private String vin;
	
	@Column(name="IDP_USER_ID")
	private String idpuserId;
	
	@Column(name="ACCOUNT_ID")
	private String accountId;
	
	@Column(name="SUBSCRIBERID")
	private String subscriberId;
	
	@Column(name="AMOUNT")
	private BigDecimal amount;
	
	@Column(name="CREATE_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="PURCHASE_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date purchaseDate;
	
	@Column(name="ACTIVATED_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date activateDate;
	
	@Column(name="PACKAGE_ID")
	private String packageId;
	
	@Column(name="PACKAGE_NAME")
	private String packageName;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="PACKAGE_START_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date packageStartDate;
	
	@Column(name="PACKAGE_END_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date packageEndDate;
	
	@Column(name = "PAYMENT_AMOUNT")
	private BigDecimal paymentAmount;//实际包的支付价格
	
	@Column(name = "GAA_ORDER_ID")
	private String gaaOrderId;//等于poratl里的webOrderId和transactionId
	
	@Column(name="PORTAL_ID")
    private Long portalId;//portal的order id
	
	
	
	

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getIdpuserId() {
		return idpuserId;
	}

	public void setIdpuserId(String idpuserId) {
		this.idpuserId = idpuserId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getActivateDate() {
		return activateDate;
	}

	public void setActivateDate(Date activateDate) {
		this.activateDate = activateDate;
	}

	public Date getPackageStartDate() {
		return packageStartDate;
	}

	public void setPackageStartDate(Date packageStartDate) {
		this.packageStartDate = packageStartDate;
	}

	public Date getPackageEndDate() {
		return packageEndDate;
	}

	public void setPackageEndDate(Date packageEndDate) {
		this.packageEndDate = packageEndDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getGaaOrderId() {
		return gaaOrderId;
	}

	public void setGaaOrderId(String gaaOrderId) {
		this.gaaOrderId = gaaOrderId;
	}

	public Long getPortalId() {
		return portalId;
	}

	public void setPortalId(Long portalId) {
		this.portalId = portalId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrepaidCardOrder other = (PrepaidCardOrder) obj;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		return true;
	}
	
}


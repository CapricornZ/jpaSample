package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_SOMP_Search_History")
public class SearchHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3375032540392818629L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "Keyword",length=128)
	private String keyword;//Search keyword
	
	@Column(name = "Category")
	private String category;//Search category
	
	@Column(name="City")
	private String city;//Search city
	
	@Column(name = "SearchRange", precision = 8, scale = 2)
	private BigDecimal searchRange;//Search range
	
	@Column(name = "Timestamp", nullable = false)
	private Date timestamp;//create time
	
	@Column(name="DeviceID",length=128, nullable = false)
	private String deviceID;
	
	@Column(name = "GovernmentID")
    private String governmentID;
	
	//20131212 yiruiYuan add new columns:IdpID
	@Column(name = "IdpID")
    private String idpID;
	
	@Column(name = "LastUpdate", nullable = false)
	private Date lastUpdate;
	
	@Column(name = "LastUpdateBy", nullable = false)
	private String lastUpdateBy;
	
	

	public String getIdpID() {
		return idpID;
	}
	public void setIdpID(String idpID) {
		this.idpID = idpID;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
	public BigDecimal getSearchRange() {
		return searchRange;
	}
	public void setSearchRange(BigDecimal searchRange) {
		this.searchRange = searchRange;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGovernmentID() {
		return governmentID;
	}
	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}
}

package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Andy
 * 
 */
@Entity
@Table(name = "T_SOMP_Managed_Content")
public class ManagedContent implements Serializable {
    private static final long serialVersionUID = 2618666027994068266L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "Category", length = 32, nullable = false)
    @Enumerated(EnumType.STRING)
    private ManagedContentCategoryType category;

	@Column(name = "Title", length = 64)
    private String title;
    
    @Column(name = "LangCode", nullable = false)
    @Enumerated(EnumType.STRING)
    private LangCodeType langCode;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "Content")
    private String content;

	@Column(name = "Timestamp", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date timestamp;

    @Column(name = "ApproveTime" )
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date approveTime;

    @Column(name = "PublishTime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date publishTime;

    @Column(name = "ExpireTime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date expireTime;

    @Column(name = "Status", length = 32, nullable = false)
    @Enumerated(EnumType.STRING)
    private ManagedContentStatus status;

    @Column(name = "LastModifiedBy", length = 32)
    private String lastModifiedBy;

    @Column(name = "ApprovedBy", length = 32)
    private String approvedBy;
    
    @Column(name = "OSType", length = 32)
    @Enumerated(EnumType.STRING)
    private OSType osType;
    
//    @Column(name="OSType", length = 32)
//    private String osType;
//   
    
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }
    
    public LangCodeType getLangCode() {
		return langCode;
	}

	public void setLangCode(LangCodeType langCode) {
		this.langCode = langCode;
	}
    
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    

    public ManagedContentCategoryType getCategory() {
	return category;
    }

    public void setCategory(ManagedContentCategoryType category) {
	this.category = category;
    }

    public ManagedContentStatus getStatus() {
	return status;
    }

    public void setStatus(ManagedContentStatus status) {
	this.status = status;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public Date getApproveTime() {
	return approveTime;
    }

    public void setApproveTime(Date approveTime) {
	this.approveTime = approveTime;
    }

    public Date getPublishTime() {
	return publishTime;
    }

    public void setPublishTime(Date publishTime) {
	this.publishTime = publishTime;
    }

    public Date getExpireTime() {
	return expireTime;
    }

    public void setExpireTime(Date expireTime) {
	this.expireTime = expireTime;
    }

    public String getLastModifiedBy() {
	return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
	this.lastModifiedBy = lastModifiedBy;
    }

    public String getApprovedBy() {
	return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
	this.approvedBy = approvedBy;
    }


    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
    public OSType getOSType() {
	    return osType;
    }
    
    public void setOSType(OSType osType) {
	    this.osType = osType;
    }

	@Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((approvedBy == null) ? 0 : approvedBy.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
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
	ManagedContent other = (ManagedContent) obj;
	if (approvedBy == null) {
	    if (other.approvedBy != null)
		return false;
	} else if (!approvedBy.equals(other.approvedBy))
	    return false;
	if (id != other.id)
	    return false;
	return true;
    }

}

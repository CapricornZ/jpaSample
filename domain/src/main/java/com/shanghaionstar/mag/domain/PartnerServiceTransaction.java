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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_Partner_Service_Tst")
public class PartnerServiceTransaction implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -5735084947304569602L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@ManyToOne
	@JoinColumn(name = "ServiceTransactionID")
	private ServiceTransaction serviceTransaction;

	@Column(name = "StartTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	@Column(name = "CompleteTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date completeTime;

    @Column(name = "Duration")
    private long duration;

	@Column(name = "PartnerNameType")
	@Enumerated(EnumType.STRING)
	private PartnerNameType partnerName;

	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
	private TransactionStatus status;

	@Column(name = "ErrorLog")
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String errorLog;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ServiceTransaction getServiceTransaction() {
		return serviceTransaction;
	}

	public void setServiceTransaction(ServiceTransaction serviceTransaction) {
		this.serviceTransaction = serviceTransaction;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public PartnerNameType getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(PartnerNameType partnerName) {
		this.partnerName = partnerName;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	public String getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(String errorLog) {
		this.errorLog = errorLog;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartnerServiceTransaction that = (PartnerServiceTransaction) o;

        if (id != that.id) return false;
        if (!completeTime.equals(that.completeTime)) return false;
        if (partnerName != that.partnerName) return false;
        if (serviceTransaction != null ? !serviceTransaction.equals(that.serviceTransaction) : that.serviceTransaction != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (status != that.status) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (serviceTransaction != null ? serviceTransaction.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + completeTime.hashCode();
        result = 31 * result + (partnerName != null ? partnerName.hashCode() : 0);
        result = 31 * result + status.hashCode();
        return result;
    }
}

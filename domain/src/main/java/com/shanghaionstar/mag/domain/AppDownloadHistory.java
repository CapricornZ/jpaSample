package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_SOMP_AppDownload_History")
public class AppDownloadHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5401823289119017639L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "AppID", nullable = false)
	private long appID;
	
	@Column(name = "StartTime", nullable = false)
	private Date startTime;//download start time
	
	@Column(name = "EndTime", nullable = false)
	private Date endTime;//download end time
	
	@Column(name = "Duration")
	private long duration;
	
	@Column(name = "LastUpdate", nullable = false)
	private Date lastUpdate;
	
	@Column(name = "LastUpdateBy", nullable = false)
	private String lastUpdateBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAppID() {
		return appID;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public void setAppID(long appID) {
		this.appID = appID;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
	
}

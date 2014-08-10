package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_SOMP_CLIENT_INFORMATION")
public class ClientInformation  implements Serializable{

	private static final long serialVersionUID = -1678006568609604096L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private long id;

	// 1: web 2: pc 3:android 4:ios 5:wp
	@Column(name = "deviceType" ,nullable = false)
	private int deviceType;

	@Column(name = "pushNum" ,nullable = false)
	private int pushNum;

	@Column(name = "contentDetail")
	private String contentDetail;

	@Column(name = "channelId")
	private Long channelId;

	@Column(name = "userId")
	private String userId;


	@Column(name = "CreateTime")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date CreateTime;

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getContentDetail() {
		return contentDetail;
	}


	public void setContentDetail(String contentDetail) {
		this.contentDetail = contentDetail;
	}

	public int getPushNum() {
		return pushNum;
	}


	public void setPushNum(int pushNum) {
		this.pushNum = pushNum;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public int getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}


	public Long getChannelId() {
		return channelId;
	}


	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}


	public Date getCreateTime() {
		return CreateTime;
	}


	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientInformation other = (ClientInformation) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ClientInformation [id=" + id + ", deviceType=" + deviceType
				+ ", pushNum=" + pushNum + ", contentDetail=" + contentDetail
				+ ", channelId=" + channelId + ", userId=" + userId
				+ ", CreateTime=" + CreateTime + "]";
	}

}

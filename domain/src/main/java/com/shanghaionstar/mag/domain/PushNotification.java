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

/***
 * 消息信息
 * 
 * @author xuxiajiang
 * 
 */
@Entity
@Table(name = "T_SOMP_Notification")
public class PushNotification implements Serializable {
	private static final long serialVersionUID = 2133981355877373305L;

	@Id
	@Column(name = "id")
	@GeneratedValue long id;

	@Column(name = "title")
	private String title;

	@Column(name = "contentDetail")
	private String contentDetail;

	@Column(name = "img")
	private String img;

	@Column(name = "isRead")
	private int isRead;


	@Column(name = "notificationContent")
	private String notificationContent;

	@Column(name = "SavedNotificationCreateTime")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date SavedNotificationCreateTime;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsRead() {
		return isRead;
	}
	
	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public String getNotificationContent() {
		return notificationContent;
	}

	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}

	public Date getSavedNotificationCreateTime() {
		return SavedNotificationCreateTime;
	}

	public void setSavedNotificationCreateTime(Date savedNotificationCreateTime) {
		SavedNotificationCreateTime = savedNotificationCreateTime;
	}

	public String getContentDetail() {
		return contentDetail;
	}

	public void setContentDetail(String contentDetail) {
		this.contentDetail = contentDetail;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PushNotification other = (PushNotification) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

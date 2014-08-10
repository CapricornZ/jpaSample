package com.shanghaionstar.mag.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "VW_SOMP_VERIFY_SUBSCRIBER")
public class VerifySubscriber implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5330024784295865403L;

	@Column(name = "GOVERNMENT_ID", nullable = false, length = 32)
	private String governmentID;

    @Id
	@Column(name = "ACCOUNT_ID", length = 32)
	private String accountID;

	@Column(name = "PIN", length = 100)
	private String PIN;

	@Column(name = "ACCOUNT_STATUS", nullable = false)
	@Enumerated(EnumType.STRING)
	private AccountStatusType accountStatus;

	public String getGovernmentID() {
		return governmentID;
	}

	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public AccountStatusType getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatusType accountStatus) {
		this.accountStatus = accountStatus;
	}

}

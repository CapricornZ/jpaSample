/**
 *
 */
package com.shanghaionstar.mag.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Andy
 */
@Entity
@Table(name = "T_SOMP_PAYMENT_KEYS")
public class PaymentKeys implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7435357374784374314L;

    
	@Id
    @Column(name = "ID")
    private Long id;
    
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keyName == null) ? 0 : keyName.hashCode());
		result = prime * result
				+ ((keyValue == null) ? 0 : keyValue.hashCode());
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
		PaymentKeys other = (PaymentKeys) obj;
		if (keyName == null) {
			if (other.keyName != null)
				return false;
		} else if (!keyName.equals(other.keyName))
			return false;
		if (keyValue == null) {
			if (other.keyValue != null)
				return false;
		} else if (!keyValue.equals(other.keyValue))
			return false;
		return true;
	}

	@Column(name = "KEY_NAME")
    private String keyName;
    
	@Column(name="KEY_VALUE")
    private String keyValue;
	
	@Column(name="KEY_DESC")
	private String keyDesc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getKeyDesc() {
		return keyDesc;
	}

	public void setKeyDesc(String keyDesc) {
		this.keyDesc = keyDesc;
	}

	
}


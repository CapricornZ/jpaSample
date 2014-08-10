/**
 * 
 */
package com.shanghaionstar.mag.domain;


/**
 * @author solayang
 *
 */
public enum LangCodeType {
	EN_US,
	ZH_CN;
	
    public static LangCodeType fromValue(String v) {
        return valueOf(v);
    }
}

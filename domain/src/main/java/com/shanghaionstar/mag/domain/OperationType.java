package com.shanghaionstar.mag.domain;

/**
 * @author SYF
 * 
 */
public enum OperationType {

    CLICK, ACCEPT, REJECT, SUCCESS, FAILUUE;
    public static OperationType fromValue(String v) {
        return valueOf(v);
    }
}

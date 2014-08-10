package com.shanghaionstar.mag.domain;
/**
 * @author HY
 *
 */
public enum OSType {

    ANDROID_SMALL,
    ANDROID_LARGE,
    IPHONE_SMALL,
    IPHONE_LARGE,
    IPAD_SMALL,
    IPAD_LARGE,
    OTHER;
    public static OSType fromValue(String v) {
        return valueOf(v);
    }
	
	
}

/**
 * 
 */
package com.mum.domain;

/**
 * @author ashok
 *
 */
public class Phone {
	private long phoneId;
	private int prefix;
	private int areaCode;
	private int number;

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

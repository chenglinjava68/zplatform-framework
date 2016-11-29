/* 
 * BankCardBean.java  
 * 
 * version TODO
 *
 * 2016年11月28日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.bean;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月28日 上午9:56:01
 * @since 
 */
public class BankCardBean implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8836929333561544123L;
	/**
	 * 银行卡卡号
	 */
	private String cardNo;
	/**
	 * 持卡人姓名
	 */
	private String cardKeeper;
	/**
	 * 银行卡类型
	 */
	private String cardType;
	/**
	 * 证件号
	 */
	private String certNo;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * cvn  Card Vеrification Number
	 */
	private String cvn;
	/**
	 * 卡有效期
	 */
	private String expired;
	/**
	 * 银联银行机构代码/人行联行号（内部使用，可以不用传值）
	 */
	private String bankCode;
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the cardKeeper
	 */
	public String getCardKeeper() {
		return cardKeeper;
	}

	/**
	 * @param cardKeeper the cardKeeper to set
	 */
	public void setCardKeeper(String cardKeeper) {
		this.cardKeeper = cardKeeper;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}
	/**
	 * @param certNo the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the cvn
	 */
	public String getCvn() {
		return cvn;
	}
	/**
	 * @param cvn the cvn to set
	 */
	public void setCvn(String cvn) {
		this.cvn = cvn;
	}
	/**
	 * @return the expired
	 */
	public String getExpired() {
		return expired;
	}
	/**
	 * @param expired the expired to set
	 */
	public void setExpired(String expired) {
		this.expired = expired;
	}
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
}

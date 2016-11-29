/* 
 * TradeBean.java  
 * 
 * version TODO
 *
 * 2016年11月28日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.bean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月28日 上午9:13:44
 * @since 
 */
public interface TradeBean {
	/**
	 * 取得交易序列号
	 * @return
	 */
	public String getTxnseqno();
	/**
	 * 设置交易序列号
	 * @param txnseqno
	 */
	public void setTxnseqno(String txnseqno);
	
	/**
	 * @return the merchNo
	 */
	public String getMerchNo();

	/**
	 * @param merchNo the merchNo to set
	 */
	public void setMerchNo(String merchNo);

	/**
	 * @return the memberId
	 */
	public String getMemberId();

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId);

	/**
	 * @return the coopInstiId
	 */
	public String getCoopInstiId();

	/**
	 * @param coopInstiId the coopInstiId to set
	 */
	public void setCoopInstiId(String coopInstiId);

	/**
	 * @return the txnAmt
	 */
	public Long getTxnAmt();

	/**
	 * @param txnAmt the txnAmt to set
	 */
	public void setTxnAmt(Long txnAmt);
	/**
	 * @return the merchOrderNo
	 */
	public String getMerchOrderNo();

	/**
	 * @param merchOrderNo the merchOrderNo to set
	 */
	public void setMerchOrderNo(String merchOrderNo);
}
/* 
 * SimpleTradeBean.java  
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
 * @date 2016年11月28日 上午9:14:12
 * @since 
 */
public class SimpleTradeBean implements TradeBean {

	private String txnseqno;
	private String merchNo;
	private String memberId;
	private String coopInstiId;
	private Long txnAmt;
	private String merchOrderNo;
	@Override
	public String getTxnseqno() {
		// TODO Auto-generated method stub
		return txnseqno;
	}
	@Override
	public void setTxnseqno(String txnseqno) {
		// TODO Auto-generated method stub
		this.txnseqno = txnseqno;
	}
	@Override
	public String getMerchNo() {
		return merchNo;
	}
	@Override
	public void setMerchNo(String merchNo) {
		this.merchNo = merchNo;
	}
	@Override
	public String getMemberId() {
		return memberId;
	}
	@Override
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String getCoopInstiId() {
		return coopInstiId;
	}
	@Override
	public void setCoopInstiId(String coopInstiId) {
		this.coopInstiId = coopInstiId;
	}
	@Override
	public Long getTxnAmt() {
		return txnAmt;
	}
	@Override
	public void setTxnAmt(Long txnAmt) {
		this.txnAmt = txnAmt;
	}
	@Override
	public String getMerchOrderNo() {
		return merchOrderNo;
	}
	@Override
	public void setMerchOrderNo(String merchOrderNo) {
		this.merchOrderNo = merchOrderNo;
	}
	
}

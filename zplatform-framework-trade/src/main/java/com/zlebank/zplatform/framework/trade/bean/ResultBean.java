/* 
 * ResultBean.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
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
 * @date 2016年11月24日 下午4:26:17
 * @since 
 */
public class ResultBean implements Serializable{

	private String errCode;
	private String errMsg;
	private boolean resultBool;
	private Object resultObj;
	private TradeBean tradeBean;
	
	public ResultBean(){
		this.resultBool=false;
	}
	
	public ResultBean(String errCode,String errMsg){
		this.resultBool=false;
		this.errCode=errCode;
		this.errMsg=errMsg;
	}
	
	public ResultBean(Object resultObj){
		this.resultObj=resultObj;
		this.resultBool=true;
	}
	
	
	
	public void setSuccessResultDto(Object resultObj){
		this.resultObj=resultObj;
		this.resultBool=true;
	}
	
	public void setErrorResultDto(String errMsg){
		this.resultBool=false;
		this.errCode="9999";
		this.errMsg=errMsg;
	}
	
	public void setErrorResultDto(String errCode,String errMsg){
		this.resultBool=false;
		this.errCode=errCode;
		this.errMsg=errMsg;
	}
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public boolean isResultBool() {
		return resultBool;
	}
	public void setResultBool(boolean resultBool) {
		this.resultBool = resultBool;
	}

	public Object getResultObj() {
		return resultObj;
	}

	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	public TradeBean getTradeBean() {
		return tradeBean;
	}
	public void setTradeBean(TradeBean tradeBean) {
		this.tradeBean = tradeBean;
	}
	
}


/* 
 * AstractAsyncTrade.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.async;

import com.zlebank.zplatform.framework.trade.bean.ResultBean;
import com.zlebank.zplatform.framework.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月24日 下午3:23:11
 * @since 
 */
public abstract class AstractAsyncTrade implements AsyncTrade {

	/**
	 * 保存交易日志（核心和渠道）
	 * @param tradeBean
	 */
	public abstract void saveTradeLog(TradeBean tradeBean);

	/**
	 * 发送交易报文
	 * @param tradeBean
	 */
	public abstract ResultBean sendTradeMessage(TradeBean tradeBean);

	/**
	 * 更新交易日志（渠道）
	 * @param tradeBean
	 */
	public abstract void updateTradeLog(TradeBean tradeBean);

	/**
	 * 处理交易结果
	 * @param tradeBean
	 * @return
	 */
	public abstract ResultBean dealWithTradeResult(TradeBean tradeBean);

	/**
	 *
	 * @param tradeBean
	 * @return
	 */
	public ResultBean pay(TradeBean tradeBean) {
		saveTradeLog(tradeBean);
		return sendTradeMessage(tradeBean);
	}

	/**
	 *
	 * @param tradeBean
	 */
	public void asyncTradeResult(TradeBean tradeBean) {
		// TODO Auto-generated method stub
		updateTradeLog(tradeBean);
		dealWithTradeResult(tradeBean);
	}
	
	
}

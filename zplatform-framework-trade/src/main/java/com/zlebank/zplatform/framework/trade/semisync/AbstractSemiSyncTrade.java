/* 
 * AbstractSemiSyncTrade.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.semisync;

import com.zlebank.zplatform.framework.trade.bean.ResultBean;
import com.zlebank.zplatform.framework.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月24日 下午3:28:47
 * @since 
 */
public abstract class AbstractSemiSyncTrade implements SemiSyncTrade {

	/**
	 * 保存交易日志（核心和渠道）
	 * @param tradeBean
	 */
	public abstract void saveTradeLog(TradeBean tradeBean);

	/**
	 * 发送交易报文
	 * @param tradeBean
	 */
	public abstract void sendTradeMessage(TradeBean tradeBean);

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
	public abstract void dealWithTradeResult(TradeBean tradeBean);

	/**
	 *
	 * @param tradeBean
	 * @return
	 */
	public ResultBean pay(TradeBean tradeBean) {
		saveTradeLog(tradeBean);
		sendTradeMessage(tradeBean);
		updateTradeLog(tradeBean);
		ResultBean resultBean = queryTrade(tradeBean);
		dealWithTradeResult(tradeBean);
		return resultBean;
	}
	
	
}

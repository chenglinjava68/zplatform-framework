/* 
 * AsyncTrade.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.async;

import com.zlebank.zplatform.framework.trade.Trade;
import com.zlebank.zplatform.framework.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月24日 下午2:41:46
 * @since 
 */
public interface AsyncTrade extends Trade{

	/**
	 * 异步交易结果
	 * @param tradeBean
	 */
	public void asyncTradeResult(TradeBean tradeBean);
}

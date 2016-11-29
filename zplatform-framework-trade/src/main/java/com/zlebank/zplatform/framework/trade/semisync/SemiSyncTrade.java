/* 
 * SemiSyncTrade.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade.semisync;

import com.zlebank.zplatform.framework.trade.Trade;
import com.zlebank.zplatform.framework.trade.bean.ResultBean;
import com.zlebank.zplatform.framework.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月24日 下午2:43:05
 * @since 
 */
public interface SemiSyncTrade extends Trade{

	/**
	 * 交易查询,使交易结果同步返回
	 * @param tradeBean
	 * @return
	 */
	public ResultBean queryTrade(TradeBean tradeBean);
	
	/**
	 * 交易放入队列，由Task模块进行后续处理，或者自行处理
	 * @param tradeBean
	 */
	public void asyncQueueQueryTrade(TradeBean tradeBean);
}

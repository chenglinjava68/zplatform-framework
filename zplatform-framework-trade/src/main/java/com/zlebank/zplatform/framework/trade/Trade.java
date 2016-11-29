/* 
 * Trade.java  
 * 
 * version TODO
 *
 * 2016年11月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.framework.trade;

import com.zlebank.zplatform.framework.trade.bean.ResultBean;
import com.zlebank.zplatform.framework.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年11月24日 下午2:16:15
 * @since 
 */
public interface Trade {

	/**
	 * 交易支付
	 * @param tradeBean 交易请求bean
	 * @return 交易结果bean 
	 */
	public ResultBean pay(TradeBean tradeBean);
}

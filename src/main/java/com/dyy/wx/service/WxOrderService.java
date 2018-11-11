package com.dyy.wx.service;

import javax.servlet.http.HttpServletRequest;

import com.dyy.wx.entity.PayResult;
import com.dyy.wx.entity.PreOrderResult;

/**
 * @Description: 处理微信支付的相关订单业务
 */
public interface WxOrderService {
	
	/**
	 * 
	 * @Description: 调用微信接口进行统一下单
	 * @param body
	 * @param out_trade_no
	 * @param total_fee
	 * @return
	 * @throws Exception
	 */
	public PreOrderResult placeOrder(String body, String out_trade_no,String total_fee) throws Exception;
	
	/**
	 * 
	 * @Description: 获取支付结果
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public PayResult getWxPayResult(HttpServletRequest request) throws Exception;
	
}

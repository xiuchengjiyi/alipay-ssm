package com.dyy.service;

import com.dyy.pojo.Orders;

/**
 * 订单操作 service
 */
public interface OrdersService {

	/**
	 * 新增订单
	 * @param order
	 */
	public void saveOrder(Orders order);
	
	/**
	 * @Description: 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
	 */
	public void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount);
	
	/**
	 * 获取订单
	 * @param orderId
	 * @return
	 */
	public Orders getOrderById(String orderId);
	
}

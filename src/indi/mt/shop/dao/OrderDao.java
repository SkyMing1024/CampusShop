package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.Order;

public interface OrderDao {
	
	public List<Order> getOrderAll();
	
	
	public Integer getOrderCount();
	
	
	public long creatOrder(String pid);
}

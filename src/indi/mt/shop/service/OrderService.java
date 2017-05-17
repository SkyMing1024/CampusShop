package indi.mt.shop.service;

import java.util.List;

import indi.mt.shop.daoimpl.OrderDaoImpl;
import indi.mt.shop.domain.Order;

public class OrderService {
	
	static OrderDaoImpl orderDaoImpl = new OrderDaoImpl();
	
	public long creadOrder(String pid) {
		return orderDaoImpl.creatOrder(pid);
	}
	
	public Integer getOrderCount(){
		return orderDaoImpl.getOrderCount();
	}
	
	public List<Order> getOrderAll() {
		return orderDaoImpl.getOrderAll();
	}
	
}

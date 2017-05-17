package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.OrderDao;
import indi.mt.shop.domain.Order;

public class OrderDaoImpl extends BaseDao<Order>implements OrderDao {

	@Override
	public List<Order> getOrderAll() {
		String sql ="SELECT o.oid orderId,o.product,o.creat_date creatDate FROM `order` AS o";
		return queryList(sql);
	}

	@Override
	public long creatOrder(String pid) {
		String sql = "INSERT INTO `order` (product,creat_date) VALUES (?,CURRENT_DATE)";
		return insert(sql, pid);
			
	}

	@Override
	public Integer getOrderCount() {
		String sql = "SELECT COUNT(oid) FROM `order`";
		return getValue(sql);
	}

}

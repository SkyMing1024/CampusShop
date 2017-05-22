package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.ProductWithUserInfoDao;
import indi.mt.shop.domain.ProductWithUserInfo;

public class ProductWithUserInfoDaoImpl extends BaseDao<ProductWithUserInfo>implements ProductWithUserInfoDao {

	@Override
	public ProductWithUserInfo getProductWithUserInfo(int id) {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage,p.beloneto,p.cid2,"
				+ " p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime, "
				+ " u.area,u.college,u.`name`,u.tel,u.QQ,u.photo ,"
				+ "u.statephoto,(CASE u.state WHEN '0' THEN '未认证'	WHEN '1' THEN '待认证'	WHEN '2' THEN '已认证' 	END)AS state"
				+ " FROM products AS p INNER JOIN `user` AS u ON p.beloneto = u.id WHERE pid = ?";
		return query(sql, id);
	}

	@Override
	public List<ProductWithUserInfo> getProductWithUserInfoList() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage,p.beloneto,p.cid2,"
				+ " p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime, "
				+ " u.area,u.college,u.`name`,u.tel,u.QQ,u.photo ,"
				+ "u.statephoto,(CASE u.state WHEN '0' THEN '未认证'	WHEN '1' THEN '待认证'	WHEN '2' THEN '已认证' 	END)AS state"
				+ " FROM products AS p INNER JOIN `user` AS u ON p.beloneto = u.id ";
		return queryList(sql);
	}

}

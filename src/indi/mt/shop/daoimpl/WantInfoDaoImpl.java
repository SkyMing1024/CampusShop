package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.WantInfoDao;
import indi.mt.shop.domain.WantInfo;

public class WantInfoDaoImpl extends BaseDao<WantInfo>implements WantInfoDao {

	@Override
	public WantInfo getWantInfoByUserId(String id) {
		String sql = "SELECT want_id wantId,user_id userId,title,`desc`,want_price wantPrice,want_deal_area wantDealArea,creat_time creatTime "
				+ " FROM want_info WHERE user_id = ?";
		return query(sql, id);
	}

	@Override
	public List<WantInfo> getWantInfos() {
		String sql = "SELECT want_id wantId,user_id userId,title,`desc`,want_price wantPrice,want_deal_area wantDealArea,"
				+ " creat_time creatTime FROM want_info ORDER BY creat_time DESC";
		return queryList(sql);
	}

	@Override
	public void addWantInfo(WantInfo wantInfo) {
		String sql = "INSERT INTO want_info (user_id,title,`desc`,want_price,want_deal_area,creat_time) "
				+ " VALUES(?,?,?,?,?,CURRENT_DATE)";
		update(sql, wantInfo.getUserId(),wantInfo.getTitle(),wantInfo.getDesc(),wantInfo.getWantPrice(),wantInfo.getWantDealArea());
	}

	@Override
	public void deleteWantInfo(int id) {
		String sql="DELETE FROM want_info WHERE want_id = ?";
		update(sql, id);
	}

	@Override
	public void updateWantInfoToNew(int id) {
		String sql="UPDATE want_info SET creat_time=CURRENT_DATE WHERE want_id = ?";
		update(sql, id);
	}

}

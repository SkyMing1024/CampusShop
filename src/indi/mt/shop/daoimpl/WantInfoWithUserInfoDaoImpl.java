package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.WantInfoWithUserInfoDao;
import indi.mt.shop.domain.WantInfoWithUserInfo;

public class WantInfoWithUserInfoDaoImpl extends BaseDao<WantInfoWithUserInfo>implements WantInfoWithUserInfoDao {

	@Override
	public WantInfoWithUserInfo getWantInfoWithUserInfoByUserId(String userId) {
		String sql = "SELECT w.want_id wantId,w.user_id userId,w.title ,w.`desc`,w.want_price wantPrice, "
					+ " w.want_deal_area wantDealArea,w.creat_time creatTime,u.`name` userName,u.tel,u.QQ qq,u.photo "
					+ " FROM want_info AS w INNER JOIN `user` AS u ON w.user_id = u.id WHERE w.user_id = ? ORDER BY w.creat_time DESC";
		return query(sql, userId);
	}

	@Override
	public List<WantInfoWithUserInfo> getWantInfoWithUserInfos() {
		String sql = "SELECT w.want_id wantId,w.user_id userId,w.title ,w.`desc`,w.want_price wantPrice, "
				+ " w.want_deal_area wantDealArea,w.creat_time creatTime,u.`name` userName,u.tel,u.QQ qq,u.photo "
				+ " FROM want_info AS w INNER JOIN `user` AS u ON w.user_id = u.id  ORDER BY w.creat_time DESC";
		return queryList(sql);
	}

}

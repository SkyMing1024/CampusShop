package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.WantInfo;

public interface WantInfoDao {
	
	WantInfo getWantInfoByUserId(String id);
	
	List<WantInfo> getWantInfos();
	
	void addWantInfo(WantInfo wantInfo);
	
	void deleteWantInfo(int id);
	
	//重新擦亮求购信息
	void updateWantInfoToNew(int id);
	
}

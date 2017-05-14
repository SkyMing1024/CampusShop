package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.WantInfoWithUserInfo;

public interface WantInfoWithUserInfoDao {
	
	public WantInfoWithUserInfo getWantInfoWithUserInfoByUserId(String userId);
	
	public List<WantInfoWithUserInfo> getWantInfoWithUserInfos();
	
}

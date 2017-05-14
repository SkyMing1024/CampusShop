package indi.mt.shop.service;

import java.util.List;

import indi.mt.shop.daoimpl.WantInfoDaoImpl;
import indi.mt.shop.daoimpl.WantInfoWithUserInfoDaoImpl;
import indi.mt.shop.domain.WantInfoWithUserInfo;

public class WantInfoService {

	static WantInfoWithUserInfoDaoImpl wantInfoWithUserInfoDaoImpl = new WantInfoWithUserInfoDaoImpl();
	static WantInfoDaoImpl wantInfoDaoImpl = new WantInfoDaoImpl();
	
	public List<WantInfoWithUserInfo> getWantInfoWithUserInfoList(){
		
		return wantInfoWithUserInfoDaoImpl.getWantInfoWithUserInfos();
	}
}

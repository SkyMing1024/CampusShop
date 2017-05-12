package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.ProductWithUserInfo;

public interface ProductWithUserInfoDao {
	
	ProductWithUserInfo getProductWithUserInfo(int id);
	
	List<ProductWithUserInfo> getProductWithUserInfoList();
}

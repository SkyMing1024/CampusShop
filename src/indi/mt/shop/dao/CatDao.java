package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.Category;

public interface CatDao {
	
	Category getCatByCid2(int cid2);
	
	List<Category> getCats();
}

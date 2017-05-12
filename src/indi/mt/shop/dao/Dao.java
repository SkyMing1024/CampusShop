package indi.mt.shop.dao;

import java.util.List;

public interface Dao<T> {
	
	/**
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	long insert(String sql,Object...args);
	
	//包括增（无返回值），删，改
	void update(String sql,Object...args);
	
	T query(String sql,Object...args);
	
	List<T> queryList(String sql,Object...args);
	
	<V> V getValue(String sql,Object...args);
	
	//批量更新操作
	void batch(String sql,Object[]...args);
	
}

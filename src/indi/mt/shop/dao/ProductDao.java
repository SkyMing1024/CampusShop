package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.Product;

public interface ProductDao {
	
	public List<Product> searchProducts(String keyword);
	
	//擦亮
	public void refreshProduct(String pid);
	
	
	//根据用户id查找商品
	List<Product> getProductsByUserId(String uid );
	
	//根据pid查询单个商品
	Product getProductById(int pid);
	
	//查询全部在售商品
	List<Product> getProductsOnsale();
	
	//查询在售新品（12个）
	List<Product> getProductsNew();
	
	//按时间查询所有商品
	List<Product> getProductsOrderByTime(); 
	//按时间查询所有在售商品
	List<Product> getProductsOnsaleOrderByTime();
	
	//按价格查询所有商品
	List<Product> getProductsOrderByPrice();
	//按价格查询所有在售商品
	List<Product> getProductsOnsaleOrderByPrice();

	//按热度查询所有商品
	List<Product> getProductsOrderByReadTimes();
	//按热度查询所有在售商品
	List<Product> getProductsOnsaleOrderByReadTimes();
	
	List<Product> getProductsByUserPoints();
	
	List<Product> getProductsOnsaleByUserPoints();
	
	
	//cat1,商品大类
	List<Product> getProductsByCat1(int cat1);
	
	//cat2,商品小类
	List<Product> getProductsByCat2(int cat2);
	
	//查询全部商品
	List<Product> getProductsAll();
	
	//查询全部商品总数
	long getProductSum();
	
	//新增商品
	void addProduct(Product product);
	long addProductReturnKey(Product product);
	
	void deleteProductById(String pid);
	
	void updateProduct(Product product);
	
	//售出商品，将商品状态改为0
	void sellProduct(String pid);
	
	void addReadTimes(String pid);
	
	
}

package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.Product;

public interface ProductDao {
	
	Product getProductById(int pid);
	
	List<Product> getProductsOnsale();
	
	List<Product> getProductsNew();
	
	//cat1,商品大类
	List<Product> getProductsByCat1(int cat1);
	
	//cat2,商品小类
	List<Product> getProductsByCat2(int cat2);

	List<Product> getProductsAll();
	
	long getProductSum();
	
	//新增商品
	void addProduct(Product product);
	long addProductReturnKey(Product product);
	
	void deleteProductById(String pid);
	
	void updateProduct(Product product);
	
}

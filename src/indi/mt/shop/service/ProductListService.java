package indi.mt.shop.service;

import java.util.ArrayList;
import java.util.List;

import indi.mt.shop.daoimpl.ProductDaoImpl;
import indi.mt.shop.daoimpl.ProductWithUserInfoDaoImpl;
import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.ProductWithUserInfo;

public class ProductListService {
	
	static ProductDaoImpl productDaoImpl = new ProductDaoImpl();
	
	static ProductWithUserInfoDaoImpl productWithUserInfoDaoImpl= new ProductWithUserInfoDaoImpl();
	
	
	
	
	//根据pid删除商品
	public void deleteProductByPid(String pid){
		productDaoImpl.deleteProductById(pid);
	}
	
	//根据用户id查找商品
	public List<Product> getProductsByUserId(String id) {
		
		return productDaoImpl.getProductsByUserId(id);
	}
	
	
	public ProductWithUserInfo getProductWithUserInfoById(int pid){
		
		return productWithUserInfoDaoImpl.getProductWithUserInfo(pid);
	}
	
	public List<Product> getProductListBySearchKeyword(String keywor){
		List<Product> list = new ArrayList<>();
		
		return list ;
	}
	
	public List<Product> getProductsListOrder(String rank){
		List<Product> list = new ArrayList<>();
		switch (rank) {
		case "price":
			list = productDaoImpl.getProductsOnsaleOrderByPrice();
			break;
		case "time":
			list = productDaoImpl.getProductsOnsaleOrderByTime();
			break;
		case "point":
			list = productDaoImpl.getProductsOnsaleByUserPoints();
			break;
		case "readTimes":
			list = productDaoImpl.getProductsOnsaleOrderByReadTimes();
			break;

		default:
			break;
		}
		
		
		return list;
	}
	
	
	//根据cat类别查找productlist
	public List<Product> getProductListByCat(int cat){
		//ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		if(cat > 100){
			return productDaoImpl.getProductsByCat2(cat);
		}else{
			return productDaoImpl.getProductsByCat1(cat);
		}
	}
	
	public List<Product> getProductsAllOnsale(){
		
		return productDaoImpl.getProductsOnsale();
		
	}
	
}

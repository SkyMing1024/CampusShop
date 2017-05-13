package indi.mt.shop.service;

import java.util.ArrayList;
import java.util.List;

import indi.mt.shop.daoimpl.ProductDaoImpl;
import indi.mt.shop.domain.Product;

public class ProductService {
	
	
	public List<Product> getProductListBySearchKeyword(String keywor){
		List<Product> list = new ArrayList<>();
		
		
		return list ;
	}
	
	
	
	
	//根据cat类别查找productlist
	public List<Product> getProductListByCat(int cat){
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		if(cat > 100){
			return productDaoImpl.getProductsByCat2(cat);
		}else{
			return productDaoImpl.getProductsByCat1(cat);
		}
	}
	
}

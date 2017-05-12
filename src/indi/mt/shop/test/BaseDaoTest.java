package indi.mt.shop.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.google.gson.Gson;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.daoimpl.ProductDaoImpl;
import indi.mt.shop.domain.Product;

public class BaseDaoTest {
	
	private BaseDao baseDao = new BaseDao();
	
	private ProductDaoImpl productDaoImpl = new ProductDaoImpl();
	
	@Test
	public void testInsert() {
		String sql = "INSERT into admin (id,name,PASSWORD)VALUES(?,?,?)";
		long id =baseDao.insert(sql,5,"admin5",555);
		System.out.println(id);
	}

	@Test
	public void testUpdate() {
		String  sql ="UPDATE admin set name = ? ,password = ? WHERE id=?";
		productDaoImpl.update(sql, "admin4",444,4);
	}
	
	@Test
	public void testQuery1() {
		String sql = "SELECT creat_time creatTime FROM products where pid =  ? ";
		Product product = productDaoImpl.query(sql,4);
		System.out.println(product);
		//Gson gson = new Gson();
		//String json = gson.toJson(product);
		//System.out.println("json:"+json);
	}
	
	
	@Test
	public void testQuery() {
		String sql = "SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
					+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
					+" FROM products  where pid = ? ";
		Product product = productDaoImpl.query(sql,4);
		System.out.println(product);
		Gson gson = new Gson();
		String json = gson.toJson(product);
		System.out.println("json:"+json);
	}

	@Test
	public void testQueryList() {
		String sql = "SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
				+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
				+" FROM products   ";
		List<Product> pros = productDaoImpl.queryList(sql);
		for(int i = 0;i<pros.size();i++){
			System.out.println(pros.get(i));
		}
		Gson gson = new Gson();
		String json = gson.toJson(pros);
		System.out.println("json:"+json);
	}

	@Test
	public void testGetValue() {
		String sql1 = "SELECT COUNT(id)FROM admin";
		String sql2 = "SELECT creat_time creatTime FROM products where pid = ?";
		long str = productDaoImpl.getValue(sql1);
		System.out.println(str);
		
	}

	@Test
	public void testBatch() {
		String sql1 ="UPDATE products set read_times=? where pid=?";
		productDaoImpl.batch(sql1, new Object[]{1,1},new Object[]{2,2},new Object[]{3,3},new Object[]{4,4});
	}

}

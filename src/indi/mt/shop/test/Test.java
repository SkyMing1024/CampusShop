package indi.mt.shop.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import indi.mt.shop.dao.WantInfoDao;
import indi.mt.shop.daoimpl.AdminDaoImpl;
import indi.mt.shop.daoimpl.ProductDaoImpl;
import indi.mt.shop.daoimpl.UserDaoImpl;
import indi.mt.shop.daoimpl.WantInfoDaoImpl;
import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.WantInfo;
import indi.mt.shop.utils.JDBCTools;


public class Test {
	
	
	@org.junit.Test
	public void testGetWantInfos(){
		WantInfoDao wantInfo = new WantInfoDaoImpl();
		wantInfo.deleteWantInfo(8);
		
	}
	
	
	@org.junit.Test
	public void getWantInfoByUserId(){
		String id="201322146108";
		WantInfoDao wantInfo = new WantInfoDaoImpl();
		System.out.println(wantInfo.getWantInfoByUserId(id));
		
	}
	
	@org.junit.Test
	public void testUpdateUserPassword(){
		String id="201322146108";
		String newPassword="123456";
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		userDaoImpl.updateUserPassword(id, newPassword);
	
	}
	
	
	@org.junit.Test
	public void testDeleteAdminById(){
		AdminDaoImpl adminDaoImpl = new AdminDaoImpl();
		adminDaoImpl.deleteAdminById(6);
	}
	
	@org.junit.Test
	public void Test1(){
		Product p = new Product();
		p.setBuyPrice(200);
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		productDaoImpl.deleteProductById("190");
	}
	
	
	@org.junit.Test
	public void test() throws Exception {
		Connection connection = null;
		QueryRunner queryRunner = new QueryRunner();
		connection = JDBCTools.getConnection();
		String sql="SELECT 	products.pname,	products.sale_price,products.pimage,`user`.`name`,`user`.college "
				+ " FROM products INNER JOIN `user` ON products.beloneto = `user`.id";
			List<TestProduct> list = queryRunner.query(connection, sql, new BeanListHandler<TestProduct>(TestProduct.class));
			JDBCTools.releaseDB(null, null, connection);
	
			System.out.println(connection);
	}

}
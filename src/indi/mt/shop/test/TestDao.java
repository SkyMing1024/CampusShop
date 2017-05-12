package indi.mt.shop.test;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import indi.mt.shop.utils.JDBCTools;



public class TestDao {
	
	public List<TestProduct> geTestProduct() throws Exception{
		
			Connection connection = null;
			QueryRunner queryRunner = new QueryRunner();
			try {
				connection =  JDBCTools.getConnection();
				System.out.println("connnection连接:"+connection);
				String sql="SELECT products.pid, products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc, "
							+ "products.pimage,products.beloneto,products.cid2,products.read_times readTimes,products.isHot,"
							+ "products.creat_time creatTime FROM products ORDER BY creat_time DESC";
				List<TestProduct> list = queryRunner.query(connection, sql, new BeanListHandler<TestProduct>(TestProduct.class));
				return list;
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCTools.releaseDB(null, null, connection);
			}
			return null;
		
	}
	
	
}

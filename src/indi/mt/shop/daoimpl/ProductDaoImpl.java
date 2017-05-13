package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.ProductDao;
import indi.mt.shop.domain.Product;

public class ProductDaoImpl extends BaseDao<Product> implements ProductDao{
	
	
	
	@Override
	public Product getProductById(int pid) {
		String sql ="SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
				+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
				+" FROM products where pid = ?";
		return query(sql, pid);
	}
	
	//获取全部在售商品，state=1，表示在售
	@Override
	public List<Product> getProductsOnsale() {
		String sql ="SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
				+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
				+" FROM products  where state=1 ORDER BY creat_time desc";
		return queryList(sql);
	}
	
	
	//查询在售新品（12个）
	@Override
	public List<Product> getProductsNew() {
		String sql ="SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
				+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
				+" FROM products where state=1 ORDER BY creat_time desc LIMIT 12";
		return queryList(sql);
	}

	
	//获取全部商品
	@Override
	public List<Product> getProductsAll() {
		String sql="SELECT products.pid,products.pname,products.buy_price buyPrice,products.sale_price salePrice,products.pdesc,products.pimage, " 
				+" products.beloneto,products.cid2,products.read_times readTimes,products.state,products.isHot,products.creat_time creatTime "
				+" FROM products  ORDER BY creat_time desc";
		return queryList(sql);
	}
	
	//获取商品总数
	@Override
	public long getProductSum() {
		String sql = "SELECT COUNT(pid)FROM products";
		return getValue(sql);
	}

	//按小类查找商品
	@Override
	public List<Product> getProductsByCat1(int cat1) {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc, "
				+ " p.pimage,p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+ " FROM products p INNER JOIN category c ON p.cid2 = c.cid2 WHERE c.cid1 = ?" ;
		return queryList(sql, cat1);
	}
	
	//按大类查找商品
	@Override
	public List<Product> getProductsByCat2(int cat2) {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc, "
				+ " p.pimage,p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+ " FROM products p INNER JOIN category c ON p.cid2 = c.cid2 WHERE c.cid2 = ?" ;
		return queryList(sql, cat2);
	}

	@Override
	public void addProduct(Product product) {
		String sql = "INSERT INTO products (pid,pname,buy_price ,sale_price ,pdesc,pimage,beloneto,cid2,creat_time) "
					+" VALUES(FLOOR(10+(RAND()*200)),?,?,?,?,?,?,?,CURRENT_DATE)";
		update(sql, product.getPname(),product.getBuyPrice(),product.getSalePrice(),product.getPdesc(),
					product.getPimage(),product.getBeloneto(),product.getCid2());
		
	}

	@Override
	public long addProductReturnKey(Product product) {
		String sql = "INSERT INTO products (pid,pname,buy_price ,sale_price ,pdesc,pimage,beloneto,cid2,creat_time) "
				+" VALUES(FLOOR(10+(RAND()*200)),?,?,?,?,?,?,?,CURRENT_DATE)";
		return insert(sql,product.getPname(),product.getBuyPrice(),product.getSalePrice(),product.getPdesc(),
						product.getPimage(),product.getBeloneto(),product.getCid2());
	}

	@Override
	public void deleteProductById(String pid) {
		String sql = "DELETE FROM products WHERE pid = ?";
		update(sql, pid);
	}

	@Override
	public void updateProduct(Product product) {
		String sql="update products set pname=?,buy_price=? ,sale_price=?,"
				+ " pdesc=?,pimage=? WHERE pid=?";
		update(sql, product.getPname(),product.getBuyPrice(),product.getSalePrice(),product.getPdesc(),product.getPimage(),product.getPid());
	}

	@Override
	public List<Product> getProductsOrderByTime() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
					+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
					+" FROM products p ORDER BY creat_time desc";
		return queryList(sql);
	}

	@Override
	public List<Product> getProductsOnsaleOrderByTime() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+" FROM products p WHERE p.state=1 ORDER BY creat_time desc";
	return queryList(sql);
	}

	@Override
	public List<Product> getProductsOrderByPrice() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+" FROM products p  ORDER BY sale_price desc";
	return queryList(sql);
	}

	@Override
	public List<Product> getProductsOnsaleOrderByPrice() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+" FROM products p WHERE p.state=1 ORDER BY sale_price desc";
	return queryList(sql);
	}

	@Override
	public List<Product> getProductsOrderByReadTimes() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+" FROM products p  ORDER BY read_times desc";
		return queryList(sql);
	}

	@Override
	public List<Product> getProductsOnsaleOrderByReadTimes() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+" p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime "
				+" FROM products p WHERE p.state=1 ORDER BY read_times desc";
		return queryList(sql);
	}

	@Override
	public List<Product> getProductsByUserPoints() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+ " p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime"
				+ " FROM products  p INNER JOIN `user`  u ON p.beloneto = u.id "
				+ " ORDER BY u.point DESC";
		return queryList(sql);
	}

	@Override
	public List<Product> getProductsOnsaleByUserPoints() {
		String sql="SELECT p.pid,p.pname,p.buy_price buyPrice,p.sale_price salePrice,p.pdesc,p.pimage, "
				+ " p.beloneto,p.cid2,p.read_times readTimes,p.state,p.isHot,p.creat_time creatTime"
				+ " FROM products  p INNER JOIN `user`  u ON p.beloneto = u.id "
				+ " WHERE p.state = 1 ORDER BY u.point DESC";
		return queryList(sql);
	}
	
	
}

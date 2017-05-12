package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.AdminDao;
import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.domain.Admin;

public class AdminDaoImpl extends BaseDao<Admin>implements AdminDao {

	@Override
	public Admin getAdminById(int id) {
		String sql="SELECT id,`name`,`password`FROM admin WHERE id = ?";
		return query(sql, id);
	}

	@Override
	public Admin getAdminByName(String name) {
		String sql="SELECT id,`name`,`password`FROM admin WHERE name = ?";
		return query(sql, name);
	}

	@Override
	public List<Admin> getAdmins() {
		String sql="SELECT id,`name`,`password`FROM admin ";
		return queryList(sql);
	}

	@Override
	public void addAdmin(Admin admin) {
		String sql="INSERT into admin (name,PASSWORD)VALUES(?,?)";
		update(sql, admin.getName(),admin.getPassword());
	}

	@Override
	public void updateAdmin(Admin admin) {
		String sql = "UPDATE admin set name=?,password=? WHERE id=?";
		update(sql, admin.getName(),admin.getPassword(),admin.getId());
	}

	@Override
	public void deleteAdminById(int id) {
		String sql="DELETE FROM admin WHERE id = ?";
		update(sql, id);
		
	}

}

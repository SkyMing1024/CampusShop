package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.Admin;

public interface AdminDao {
	
	Admin getAdminById(int id);
	
	Admin getAdminByName(String name);
	
	List<Admin> getAdmins();

	void addAdmin(Admin admin);
	
	void deleteAdminById(int id);
	
	void updateAdmin(Admin admin);
	
}

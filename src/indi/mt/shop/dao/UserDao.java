package indi.mt.shop.dao;

import java.util.List;

import indi.mt.shop.domain.User;

public interface UserDao {
	
	User getUserById(String id);
	
	User getUserByIdPwd(String id,String pwd);
	
	User getUserByName(String userName);
	
	List<User> getUsers();
	
	long getUserSum();
	
	void addUser(User user);
	
	void updateUser(User user);
	
	void updateUserPassword(String id, String newPassword);
	
	void addPointByRefresh(String pid);
	
	void addPointBySell(String pid);
	
	void addPointByReleaseProduct(String uid);
	
	void deleteUserById(int id);

	void  addUserStatePhoto(User user);
}

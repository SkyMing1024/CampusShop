package indi.mt.shop.service;

import indi.mt.shop.daoimpl.UserDaoImpl;
import indi.mt.shop.domain.User;

public class UserService {
	
	static UserDaoImpl userDaoImpl = new UserDaoImpl();
	
	
	public void  updateUserInfo(User user) {
		userDaoImpl.updateUser(user);
	}
	
	public void addPointBySell(String pid){
		userDaoImpl.addPointBySell(pid);
	}
	
	public void addPointByRealsePro(String pid){
		userDaoImpl.addPointByRealsePro(pid);
	}
	//擦亮后用户积分+2
	public void addPointByRefresh(String pid){
		userDaoImpl.addPointByRefresh(pid);
	}
	
	//用户注册
	public void regUser(User user) {
		userDaoImpl.addUser(user);
	}
	
	
	public User getUserById(String id){
		return userDaoImpl.getUserById(id);
	}
	
	public User getUserByIdPwd(String id,String pwd) {
		return userDaoImpl.getUserByIdPwd(id, pwd);
	}
	
	
}	

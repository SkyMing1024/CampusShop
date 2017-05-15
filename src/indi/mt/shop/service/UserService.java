package indi.mt.shop.service;

import indi.mt.shop.daoimpl.UserDaoImpl;
import indi.mt.shop.domain.User;

public class UserService {
	
	static UserDaoImpl userDaoImpl = new UserDaoImpl();
	
	public User getUserById(String id){
		return userDaoImpl.getUserById(id);
	}
	
	public User getUserByIdPwd(String id,String pwd) {
		return userDaoImpl.getUserByIdPwd(id, pwd);
	}
	
	
}	

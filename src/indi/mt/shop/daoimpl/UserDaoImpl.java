package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.UserDao;
import indi.mt.shop.domain.User;

public class UserDaoImpl extends BaseDao<User>implements UserDao {

	@Override
	public User getUserById(String id) {
		String sql="SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo "
				+ " FROM user where id = ?";
		return query(sql, id);
	}

	@Override
	public User getUserByName(String userName) {
		String sql="SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo "
				+ " FROM user where name = ?";
		return query(sql, userName);
	}

	@Override
	public List<User> getUsers() {
		String sql = "SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo FROM user ";
		return queryList(sql);
	}

	@Override
	public long getUserSum() {
		String sql = "SELECT COUNT(id) FROM user ";
		return getValue(sql);
	}

	@Override
	public void addUser(User user) {
		String sql="INSERT INTO user (id,name,password,tel)	VALUES (?,?,?,?)";
		update(sql, user.getId(),user.getName(),user.getPassword(),user.getTel());
	}
	
	//用户完善个人信息
	@Override
	public void updateUser(User user) {
		String sql="UPDATE user set email=?,area=?,college=?,grade=?,tel=?,QQ=?,photo=? WHERE id=?";
		update(sql, user.getEmail(),user.getArea(),user.getCollege(),user.getGrade(),user.getTel(),user.getQq(),user.getPhoto(),user.getId());
	}

	@Override
	public void updateUserPassword(String id, String newPassword) {
		String sql = "UPDATE user set password = ? where id=?";
		update(sql, newPassword,id);
	}
	
	@Override
	public void deleteUserById(int id) {
		String sql="DELETE FROM user where id = ?";
		update(sql, id);
	}


}

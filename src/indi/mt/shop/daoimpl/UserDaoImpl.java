package indi.mt.shop.daoimpl;

import java.util.List;

import indi.mt.shop.dao.BaseDao;
import indi.mt.shop.dao.UserDao;
import indi.mt.shop.domain.User;

public class UserDaoImpl extends BaseDao<User>implements UserDao {

	@Override
	public User getUserById(String id) {
		String sql="SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo,point "
				+ " FROM user where id = ?";
		return query(sql, id);
	}

	@Override
	public User getUserByName(String userName) {
		String sql="SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo ,point "
				+ " FROM user where name = ?";
		return query(sql, userName);
	}

	@Override
	public List<User> getUsers() {
		String sql = "SELECT id,name,password,email,area,college,grade,tel,QQ qq,photo ,point FROM user ";
		return queryList(sql);
	}

	@Override
	public long getUserSum() {
		String sql = "SELECT COUNT(id) FROM user ";
		return getValue(sql);
	}

	@Override
	public void addUser(User user) {
		String sql="INSERT INTO user (id,password,qq)	VALUES (?,?,?)";
		update(sql, user.getId(),user.getPassword(),user.getQq());
	}
	
	//用户完善个人信息
	@Override
	public void updateUser(User user) {
		String sql="UPDATE user set name=?,email=?,area=?,college=?,grade=?,tel=?,QQ=? WHERE id=?";
		update(sql, user.getName(),user.getEmail(),user.getArea(),user.getCollege(),user.getGrade(),user.getTel(),user.getQq(),user.getId());
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

	@Override
	public User getUserByIdPwd(String id, String pwd) {
		String sql = "SELECT u.id,u.email,u.`password`,u.`name`,u.area,u.college,u.grade,"
				+" u.tel,u.QQ,u.photo,u.point FROM `user` AS u WHERE u.id = ? AND u.`password` = ?";
		return query(sql, id,pwd);
	}

	public void addPointByRefresh(String pid){
		String sql="UPDATE `user` u ,products p SET point = point+2  WHERE u.id = p.beloneto AND p.pid = ?";
		update(sql, pid);
	}

	@Override
	public void addPointBySell(String pid) {
		String sql="UPDATE `user` u ,products p SET point = point+5  WHERE u.id = p.beloneto AND p.pid = ?";
		update(sql, pid);
	}

	@Override
	public void addPointByRealsePro(String pid) {
		String sql="UPDATE `user` u ,products p SET point = point+2  WHERE u.id = p.beloneto AND p.pid = ?";
		update(sql, pid);
	}
}

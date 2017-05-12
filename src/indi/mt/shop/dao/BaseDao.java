package indi.mt.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mysql.jdbc.Statement;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Reflection;

import indi.mt.shop.utils.JDBCTools;
import indi.mt.shop.utils.ReflectionUtils;

public class BaseDao<T> implements Dao<T>{
	
	private QueryRunner queryRunner=new QueryRunner();
	
	private Class<T> clazz;
	
	public BaseDao() {
		clazz = ReflectionUtils.getSuperGenericType(getClass());
	}
	
	@Override
	public long insert(String sql, Object... args) {
		long id=0;
		Connection connection = null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet = null;
		try {
			connection = JDBCTools.getConnection();
			preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			if(args != null){
				for(int i = 0; i<args.length;i++){
					preparedStatement.setObject(i+ 1 , args[i]);
				}
			}
			preparedStatement.executeUpdate();
			resultSet=preparedStatement.getGeneratedKeys();
			if(resultSet.next()){
				id = resultSet.getLong(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(resultSet, preparedStatement, connection);
		}
		
		return id;
	}

	@Override
	public void update(String sql, Object... args) {
		Connection connection = null;
		try {
			connection=JDBCTools.getConnection();
			queryRunner.update(connection, sql, args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(null, null, connection);
		}
		
	}

	@Override
	public T query(String sql, Object...args) {
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(null, null, connection);
		}
		return null;
	}

	@Override
	public List<T> queryList(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(null, null, connection);
		}
		return null;
	}

	@Override
	public <V> V getValue(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			return (V) queryRunner.query(connection, sql, new ScalarHandler<>(), args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(null, null, connection);
		}
		
		return null;
	}

	@Override
	public void batch(String sql, Object[]... args) {
		Connection connection = null;
		try {
			connection = JDBCTools.getConnection();
			queryRunner.batch(connection, sql, args);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.releaseDB(null, null, connection);
		}
		
		
	}

}

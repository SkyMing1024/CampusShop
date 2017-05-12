package indi.mt.shop.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
	private static String user;

	private static String password;

	private static String url;
	static {
		try {
			
			ClassLoader classLoader = DBConnection.class.getClassLoader();
			InputStream is = classLoader.getResourceAsStream("db.properties");
			Properties props = new Properties();
			props.load(is);
			url = props.getProperty("jdbcUrl");
			user = props.getProperty("user");
			password = props.getProperty("password");
			Class.forName(props.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("exception1");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("exception2");
		}
	}

	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(url, user, password);
	}

	public static void close(ResultSet rs, Statement stat, Connection conn)
			throws Exception {
		if (rs != null) {
			rs.close();
		}
		if (stat != null) {
			stat.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	public static void close(Statement stat, Connection conn) throws Exception {
		if (stat != null) {
			stat.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(DBConnection.getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


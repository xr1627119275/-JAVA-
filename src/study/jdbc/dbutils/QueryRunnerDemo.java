package study.jdbc.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import study.jdbc.JDBCUtilsConfig;
import study.jdbc.User;

public class QueryRunnerDemo {
	private static Connection con = JDBCUtilsConfig.getConnection();

	public static void main(String[] args) throws Exception {
		// insert();
		// update();
		// delete();
		// arrayHandler();
		// arrayListHandler();
		// beanHandler();
		// beanListHandler();
		// columnListHandler();
		// scalarHandler();
//		 mapHandler();
		mapListHandler();
	}

	private static void mapListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		List<Map<String, Object>> lists = qr.query(con, sql, new MapListHandler());
		for (Map<String, Object> map : lists) {
			for (String key : map.keySet()) {
				System.out.print(key + " " + map.get(key)+" ");
			}
			System.out.println();
		}

	}

	private static void mapHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		Map<String, Object> map = qr.query(con, sql, new MapHandler());
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	private static void scalarHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select count(*) from user";
		Object object = qr.query(con, sql, new ScalarHandler<Object>());
		System.out.println(object);

	}

	private static void columnListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		List<Object> lists = qr.query(con, sql, new ColumnListHandler<Object>("name"));
		for (Object object : lists) {
			System.out.println(object);
		}

	}

	private static void beanListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		List<User> lists = qr.query(con, sql, new BeanListHandler<User>(User.class));
		for (User users : lists) {
			System.out.println(users);
		}
	}

	private static void beanHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		User user = qr.query(con, sql, new BeanHandler<User>(User.class));
		System.out.println(user);

	}

	private static void arrayListHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		List<Object[]> list = qr.query(con, sql, new ArrayListHandler());
		for (Object[] obj : list) {
			for (Object object : obj) {
				System.out.print(object);
			}
			System.out.println();
		}
	}

	private static void arrayHandler() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from user";
		Object[] result = qr.query(con, sql, new ArrayHandler());
		System.out.println(result.length);
		for (Object obj : result) {
			System.out.println(obj);
		}
	}

	private static void delete() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "delete from user where id = ?";
		Object[] params = { "2" };
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}

	private static void update() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "update user set name=? where id=?";
		Object[] params = { "abc", "2" };
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}

	private static void insert() throws Exception {
		QueryRunner qr = new QueryRunner();
		String sql = "insert into user(name) values (?);";
		Object[] params = { "make" };
		int row = qr.update(JDBCUtilsConfig.getConnection(), sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}

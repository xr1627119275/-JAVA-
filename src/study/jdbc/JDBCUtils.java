package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils {

	private JDBCUtils() {
	}

	private static Connection con;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/xr";
			String username = "root";
			String password = "132757";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException("数据库链接失败");
		}
	}

	public static Connection getConnection() {
		return con;
	}

	public static void close(Connection con, Statement stat, ResultSet set) {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception

			}
		}
		if (set != null) {
			try {
				set.close();
			} catch (Exception e) {
				// TODO: handle exception

			}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (Exception e) {
				// TODO: handle exception

			}
		}

	}

}

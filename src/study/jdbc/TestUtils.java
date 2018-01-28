package study.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestUtils {
	public static void main(String[] args) throws Exception {
//		JDBCUtils();
		JDBCUtilsConfig();
	}

	private static void JDBCUtilsConfig() throws Exception{
		Connection connection = JDBCUtilsConfig.getConnection();
		System.out.println(connection);
	}

	private static void JDBCUtils() throws Exception{
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement pst = connection.prepareStatement("select * from user");
		ResultSet set = pst.executeQuery();
		while (set.next()) {
			System.out.println(set.getString("name") + "   ");
		}
		JDBCUtils.close(connection, pst, set);
	}
}

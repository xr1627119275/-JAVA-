package study.jdbc.datasource;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceDemo {
	public static void main(String[] args) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/xr");
		dataSource.setUsername("root");
		dataSource.setPassword("132757");
		try {
			Connection con = dataSource.getConnection();
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败");
		}
	}
}

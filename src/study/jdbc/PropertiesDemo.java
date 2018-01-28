package study.jdbc;

import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception{
		InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		String driverClass = pro.getProperty("driverClass");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, username, password);
	}
}

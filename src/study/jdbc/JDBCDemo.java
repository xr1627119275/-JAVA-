package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;



public class JDBCDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xr", "root", "132757");
//		Statement stat = con.createStatement();
		
//		int row = stat.executeUpdate("insert into user(name) values('Test');");
//		System.out.println(row);
//		ResultSet rs = stat.executeQuery("select * from user;");
//		ArrayList array = new ArrayList<>();
//		while(rs.next()) {
//			array.add(rs.getInt("id"));
//			array.add(rs.getString("name"));
//		}
		PreparedStatement prep=con.prepareStatement("select * from user where id=? and name=?;");
		prep.setObject(1, "2");
		prep.setObject(2, "peter"); 
		ResultSet rs =prep.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"..."+rs.getString("name"));
		}
		prep.close();
		con.close();
	}
}

package study.jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDemo {
	public static void main(String[] args) throws Exception{
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from user;");
		ResultSet rSet = pst.executeQuery();
		List<User> lists = new ArrayList<User>();
		while (rSet.next()) {
			User user = new User(rSet.getInt("id"),rSet.getString("name"));
			lists.add(user);
		}
		JDBCUtils.close(con, pst, rSet);
		for(User user:lists) {
			System.out.println(user);
		}
		
	}
}

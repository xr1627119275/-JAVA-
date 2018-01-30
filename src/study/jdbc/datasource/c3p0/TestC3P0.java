package study.jdbc.datasource.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class TestC3P0 {
	@Test
	public void testAddUser1() {
		Connection conn = null;
		PreparedStatement pstemt = null;
		try {
			conn = C3P0Utils.getConnection();
			pstemt = conn.prepareStatement("insert into user values(null,?);");
			pstemt.setString(1, "nihaoya1");
			int b = pstemt.executeUpdate();
			System.out.println(conn);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void testAddUser() {
		Connection conn = null;
		PreparedStatement pstemt = null;
		DataSource dataSource = new ComboPooledDataSource();
		try {
			conn = dataSource.getConnection();
			pstemt = conn.prepareStatement("insert into user values(null,?);");
			pstemt.setString(1, "nihaoya");
			int b = pstemt.executeUpdate();
			System.out.println(conn);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}

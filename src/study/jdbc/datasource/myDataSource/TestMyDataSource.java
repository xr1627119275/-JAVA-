package study.jdbc.datasource.myDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

public class TestMyDataSource {
	
	public void testAddUser() {
		Connection conn = null;
		PreparedStatement pstemt = null;
		MyDataSource dataSource = new MyDataSource();
		try {
			conn = dataSource.getConnection();
			pstemt = conn.prepareStatement("insert into user values(null,?);");
			pstemt.setString(1, "nihaoya");
			int b = pstemt.executeUpdate();
			System.out.println(conn);
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			dataSource.backConnection(conn);
			
			try{
				pstemt.close();
			}catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	
	@Test
	public void testAddUser1() {
		Connection conn = null;
		PreparedStatement pstemt = null;
		MyDataSource1 dataSource = new MyDataSource1();
		try {
			conn = dataSource.getConnection();
			pstemt = conn.prepareStatement("insert into user values(null,?);");
			pstemt.setString(1, "nihaoya");
			int b = pstemt.executeUpdate();
			System.out.println(conn);
			System.out.println(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			
			try{
				conn.close();
				pstemt.close();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}

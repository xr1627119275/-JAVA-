package study.jdbc.datasource.myDataSource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import study.jdbc.JDBCUtilsConfig;

public class MyDataSource1 implements DataSource {
	private static LinkedList<Connection> pool = new LinkedList<Connection>();
	
	static {
		for (int i = 0; i < 5; i++) {
			Connection conn = JDBCUtilsConfig.getConnection();
			MyConnection myconnection = new MyConnection(conn, pool);
			pool.add(myconnection);
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		if(pool.size()==0) {
			for (int i = 0; i < 5; i++) {
				conn = JDBCUtilsConfig.getConnection();
				MyConnection myconnection = new MyConnection(conn, pool);
				pool.add(myconnection);
			}
		}else {
			conn = pool.remove(0);
		}
		return conn;
	}
	public void backConnection(Connection con) {
		pool.add(con);
	}
	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}

package study.jdbc.datasource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class QueryRunnerDemo {
	private static QueryRunner qRunner=new QueryRunner(JDBCUtils.getDataSource());
	
	public static void main(String[] args) throws Exception {
		List<Object[]> lists= qRunner.query("select * from user", new ArrayListHandler());
		for(Object[] objects:lists) {
			for(Object object:objects) {
				System.out.println(object);
			}
		}
	}
}

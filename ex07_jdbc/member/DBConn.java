package ex07_jdbc.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	static Connection conn;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";	
	String user = "hr";
	String password = "hr";
	
	public static Connection getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("로딩 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch (ClassNotFoundException e) {
			System.out.println("로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql 실패");
			e.printStackTrace();
		}
				
		return conn;
	}
	
	
	
}

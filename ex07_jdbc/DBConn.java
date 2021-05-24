package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	
	static Connection conn;
	
	//컨넥션을 리턴하는 메서드 
	public static Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url이는 바뀔수 있다 xe: 서비스데이터
		String user = "hr";
		String password = "hr";
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");	//
			//컨넥션 객체 생성 
			conn = DriverManager.getConnection(url,user,password);	//url , user , passwrod connection 통로 만들기 
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 생성 실패");
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
}

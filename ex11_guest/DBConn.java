package ex11_guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	//싱글톤패턴 : 인스턴스를 하나만 생성해서 재사용 한다 
	private static Connection conn = null;
	
	public static Connection getConn() {
		//컨넥션을 리턴하는 메서드 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";			//url이는 바뀔수 있다 xe: 서비스데이터
		String user = "hr";
		String password = "hr";
		
		try {
			//만약 컨넥션이 객체가 null라면 
			if(conn ==null || conn.isClosed()) {	//순서지켜야됨 conn이 끊어졌다면 ...
				//드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");	//
				//컨넥션 객체 생성 
				conn = DriverManager.getConnection(url,user,password);	//url , user , passwrod connection 통로 만들기 
				System.out.println("db 연결 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션 생성 실패");
			e.printStackTrace();
		}
		return conn;
		
	}
	
	//접속 해제 메서드 
	
	public static void dbClose () {
		
		try {
			if(conn!=null && conn.isClosed() ) {
				conn.close();
				System.out.println("db연결 해제");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}

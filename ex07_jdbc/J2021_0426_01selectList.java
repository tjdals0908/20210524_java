package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J2021_0426_01selectList {
	
	static Connection conn = null; //필드: 자동 초기화 

	public static void main(String[] args) {
	//	Connection conn = null; //지역변수 반드시 초기화 필요 
		
		
		//오라클 db연결 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");	//로컬 호스트는 바뀔수있다 다른컴퓨터면 그주소 ip
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		
		if(conn == null )return ;	//컨넥션 실패시 종료
	
		//db 정보 select 
		ResultSet rs =null;
		Statement stmt= null;
		List<Countries> list = new ArrayList<>();
		
		try {
		    stmt = conn.createStatement();
			String sql = "SELECT*FROM COUNTRIES";
			rs = stmt.executeQuery(sql); //조회   executeQuery는 조회
			while(rs.next()) {
				String country_id =rs.getString("country_id");
				String country_name =rs.getString("COUNTRY_name");  
				int region_id = rs.getInt("REGION_id"); 
				Countries cot =new Countries(country_id,country_name,region_id);
				list.add(cot);
			}

		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}finally {			//예외가발생하든지 안하든지 무조건 실행 	//finally은 무조건 connection을 끊어줘야 되기때문에 finally 실행 해야함 
			try {
				if (rs != null) rs.close();
				if (stmt!= null)stmt.close();
				if (conn!=null) conn.close();

			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
		//출력 
		
//		for(int i=0; i<list.size(); i++) {
//			Countries c = list.get(i);
//			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
//		}
		
		for(Countries s : list) {
			System.out.println(s.getCountry_id()+" "+s.getCountry_name()+" "+s.getRegion_id());
	
		}
		
	}
}
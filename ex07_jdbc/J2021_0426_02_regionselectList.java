package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J2021_0426_02_regionselectList {

	public static void main(String[] args) {

		//컨넥션 객체 얻기
		
		Connection conn =  DBConn.getConn();
		List<RegionsDTO> list = new ArrayList<>();
		
		try {
			Statement stmt = conn.createStatement();	//문장을 주고받을수있는 Statement 생성
			String sql = "SELECT*FROM REGIONS ORDER BY REGION_ID";     //sql 문장 작성 - sql에서 실행되는지 확인하기 
			ResultSet rs = stmt.executeQuery(sql);		// sql문장을 실행한 결과값 만들기
			
			while(rs.next()){	//rs 의 데이터가 있을때가지 계속...				//반복문 돌리기 
				int region_id = rs.getInt("region_id");							//결과값 sql의 필드명을 변수로 만들기
				String region_name = rs.getString("region_name");				// 결과값 sql의 필드명을 변수로 만들기 
				
				RegionsDTO rdto = new RegionsDTO();	//객체 생성 ...but 객체 생성은 꼭 안에넣어야한다 
				rdto.setRegions_id(region_id);
				rdto.setRegions_name(region_name);
				list.add(rdto);						//객체를 계속 생성하고 넣어야 한다 , 객체가 생성하는게 밖에 있으면 한 객체만 만들어져서 값이 똑같아짐
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 예외");
			e.printStackTrace();
		}
		for(RegionsDTO dto : list) {
			System.out.println(dto.getRegions_id()+" "+dto.getRegions_name());
		}
	}

}

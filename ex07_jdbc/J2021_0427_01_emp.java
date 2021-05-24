package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J2021_0427_01_emp {

	public static void main(String[] args) {

		//사원 테이블에서 년봉이 10000이상인 사원의
		//employe_id,first_name ,salary 3개 조회 
		//년봉의 내림차순으로 정렬

		Connection conn =  DBConn.getConn();
		//		List<RegionsDTO> list = new ArrayList<>();
		List<EmployeeDTO> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,HIRE_DATE\r\n" + 
					"FROM EMPLOYEES\r\n" + 
					"WHERE SALARY >100\r\n" + 
					"ORDER BY SALARY DESC";   
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()){	
				int employee_id = rs.getInt("EMPLOYEE_ID");
				String frist_name = rs.getString("FIRST_NAME");
				int salary = rs.getInt("SALARY");
				Date hire_date = rs.getDate("hire_date");

				EmployeeDTO edto = new EmployeeDTO();
				edto.setEmployee_id(employee_id);
				edto.setFirst_name(frist_name);
				edto.setSalary(salary);
				edto.setHire_date(hire_date);
				
				list.add(edto);

				//				int employee_id = rs.getInt("EMPLOYEE_ID");							
				//				String frist_name = rs.getString("FIRST_NAME");		
				//				int salary = rs.getInt("SALARY");
				//
				//				RegionsDTO rdto = new RegionsDTO();	
				//
				//				rdto.setEmployee_id(employee_id);
				//				rdto.setFirst_name(frist_name);
				//				rdto.setSalary(salary);
				//				list.add(rdto);						
			}

		} catch (SQLException e) {
			System.out.println("sql에러");
			e.printStackTrace();
		}

		for(EmployeeDTO r :list) {
			System.out.println("salary:"+r.getSalary()+", "+"first_name:"+r.getFirst_name()+", "+"employee_id:"+r.getEmployee_id()+", "+"hire_date:"+r.getHire_date());

		}

	}

}

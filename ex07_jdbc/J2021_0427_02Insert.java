package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J2021_0427_02Insert {

	public static void main(String[] args) {
	
		//오라클에 데이터 추가 : insert 
		
		PreparedStatement pstmt = null;
		Connection conn =DBConn.getConn();
//		Statement stmt =null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("상품코드?");
		String itemcode = scan.next();  
		scan.nextLine();
		
		System.out.println("상품이름?");
		String itemname = scan.nextLine();   
		
		System.out.println("상품가격");
		int price = scan.nextInt();         
		
//		String sql = "INSERT INTO ITEM(ITEMCODE,ITEMNAME,PRICE)VALUES("
//				+ "'" + itemcode +" ', ' " + itemname + "', " + price + ")"; 1방법) 이방법으로 하면 복잡하기 대문에 
		String sql = "INSERT INTO ITEM(ITEMCODE,ITEMNAME,PRICE)VALUES(?,?,?)"; //2방법)	(?,?,?) 으로 하는게 간편 
		System.out.println(sql);
				
		try {
			pstmt = conn.prepareStatement(sql);
			//sql문의 ? 값 대치
			pstmt.setString(1, itemcode);
			pstmt.setString(2, itemname);
			pstmt.setInt(3, price);
			
			int cnt = pstmt.executeUpdate();	//적용된 건수를 반환
			System.out.println(cnt+"건 추가");
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}

}

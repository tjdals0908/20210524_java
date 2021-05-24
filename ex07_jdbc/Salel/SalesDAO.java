package ex07_jdbc.Salel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.member.DBConn;
import ex07_jdbc.member.MemberDTO;

public class SalesDAO {
	
//	Map<String,Object> map; //매출 한건 데이터 저장 
//	map=new HashMap<>();
	
	Map<String,Object> map = new HashMap<>();
	
	//일일상품 판매리스트
	
	List<Map<String,Object>> dayItemSalesList(){
		
		List<Map<String,Object>> list = new ArrayList<>();
//		List<ResultSet> rlist = new ArrayList<>() ;
		
		//db 컨넥션 생성
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE, S.SEQ");
		
		try {
			pstmt= conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate =rs.getString("SALEDATE");
				int seq = rs.getInt("SEQ");
				String itemcode = rs.getString("ITEMCODE");
				String itemname = rs.getString("ITEMNAME");
				int qty = rs.getInt("qty");
				int amount =rs.getInt("amount");
//				System.out.println(saledate + itemcode+itemname+qty+amount);
				map.put("saledate", saledate);
				map.put("seq",seq );
				map.put("itemcode", itemcode);
				map.put("itemname",itemname );
				map.put("qty",qty );
				map.put("amount",amount);
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
// 일일상품별 집계 판매
	
	List<Map<String, Object>> dayItemSum() {
		List<Map<String,Object>> list = new ArrayList<>();
		
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE,S.ITEMCODE,MAX(I.ITEMCODE)ITEMNAME,SUM(S.QTY)QTY,SUM(S.AMOUNT)AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE=I.ITEMCODE) ");
		sb.append("GROUP BY S.SALEDATE, S.ITEMCODE ");
		sb.append("HAVING SUM(S.QTY)>3 ");
		sb.append("ORDER BY S.SALEDATE,AMOUNT DESC ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs= pstmt.executeQuery();
			while(rs.next()) {
				
				String saledate =rs.getString("SALEDATE");
				String itemcode = rs.getString("ITEMCODE");
				String itemname = rs.getString("ITEMNAME");
				int qty = rs.getInt("qty");
				int amount =rs.getInt("amount");
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname",itemname );
				map.put("qty",qty );
				map.put("amount",amount);
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	
	//일일 상품별 집계판매
	
	List<Map<String, Object>>  dayItemsalesTotal(String saledate){
		List<Map<String,Object>> list = new ArrayList<>();
				
		Connection conn= DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMOUNT,0) AMOUNT, NVL(I.BIGO,' ') BIGO, I.REGDATE ");
		sb.append("FROM ITEM I LEFT JOIN ");
		sb.append("(SELECT ITEMCODE, SUM(AMOUNT) AMOUNT "); 
		sb.append("FROM SALES ");
		sb.append("WHERE SALEDATE = ? "); 
		sb.append("GROUP BY ITEMCODE) S ");
		sb.append("ON I.ITEMCODE = S.ITEMCODE ");
		sb.append("ORDER BY I.ITEMCODE ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1,saledate);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				Map<String,Object> map = new HashMap<>();
				
//				String itemcode =rs.getString("ITEMCODE");
//				String itemname= rs.getNString("ITEMNAME");
//				int price = rs.getInt("PRICE");
//				int amount = rs.getInt("AMOUNT");
//				String bigo = rs.getString("BIGO");
//				String regdate = rs.getString("REGDATE");
				
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getInt("price"));
				map.put("amount", rs.getInt("amount"));
				map.put("bigo", rs.getString("bigo"));
				map.put("regdate", rs.getString("regdate"));
				list.add(map);
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
//뷰를 이용해서 
	
	
	List<Map<String, Object>>  dayItemsalesView(String saledate){
		List<Map<String,Object>> list = new ArrayList<>();
		
		
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();

		
		sb.append("SELECT*FROM DAY_ITEM_SALES_VIEW ");
		sb.append("WHERE SALEDATE ='?");
			
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1,saledate);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				
				Map<String, Object> map = new HashMap<>();
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getInt("price"));
				map.put("amount", rs.getInt("amount"));
				map.put("bigo", rs.getString("bigo"));
				map.put("regdate", rs.getString("regdate"));
				map.put("saledate", rs.getString("saledate"));
				list.add(map);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

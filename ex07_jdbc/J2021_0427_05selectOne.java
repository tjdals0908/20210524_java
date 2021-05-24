package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.crypto.Data;

public class J2021_0427_05selectOne {

	public static void main(String[] args) {

		//한건만 조회 
		
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet  rs = null;
		
		ItemDTO idto = null;
		String itemcode="8801";
		
		String sql ="SELECT*FROM ITEM\r\n" + 
				"WHERE ITEMCODE = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			rs = pstmt.executeQuery();
			if (rs.next());{		//데이터가 있다면 
				String itemnmae = rs.getString("itemname");
				int price = rs.getInt("price");
				String bigo = rs.getString("bigo");
				Date regdate = rs.getDate("regdate");
				
				idto= new ItemDTO(itemcode, itemnmae, price, bigo, regdate);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(idto.getItemname()+" "+idto.getItemcode()+" "+idto.getPrice()+" "+idto.getRegdate());
	}

}

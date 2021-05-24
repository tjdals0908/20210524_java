package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import ex07_jdbc.member.MemberDTO;

public class GuestDAOImpl implements GuestDAO{
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public int insert(GuestDTO gdto) {
		Connection conn = DBConn.getConn();
		// 추가
		int cnt=0;
		String sql="INSERT INTO GUEST(SEQ,NAME,EMAIL,PASSWD,CONTENT)\r\n" + 
				"VALUES(GUEST_SEQ.NEXTVAL,?,?,?,?)";
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		// 수정
		int cnt=0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;

		String sql="UPDATE GUEST\r\n" + 
				"SET NAME =?,\r\n" + 
				"EMAIL = ?,\r\n" + 
				"PASSWD = ?,\r\n" + 
				"CONTENT = ?\r\n" + 
				"WHERE SEQ = ?";
		try {
			pstmt= conn.prepareStatement(sql);

			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		// 삭제
		int cnt=0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM GUEST\r\n" + 
				"WHERE SEQ = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		return cnt;
	}


	@Override
	public GuestDTO selectOne(int seq) {
		// 한건조회
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestDTO gdto = null;

		String sql="SELECT *\r\n" + 
				"FROM GUEST\r\n" + 
				"WHERE SEQ =?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String passwd = rs.getString("passwd");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				gdto= new GuestDTO(seq,name ,email ,passwd,content,regdate );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return gdto;
	}


	@Override
	public List<GuestDTO> selectList() {
		// 전체조회
		List<GuestDTO> glist = new ArrayList<GuestDTO>();

		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		String sql ="SELECT *FROM GUEST";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				int seq = rs.getInt("seq");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String passwd = rs.getString("passwd");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");

				GuestDTO gdto = new GuestDTO(seq,name,email,passwd,content,regdate);
				glist.add(gdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return glist;
	}





}

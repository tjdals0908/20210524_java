package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import ex07_jdbc.Countries;

//단위 테스트 
class JunitTest {
	MemberDAO mdao = new MemberDAO();
	@Test
	void testSelectList() {
		List<MemberDTO> mlist = mdao.selectList();
		System.out.println(mlist);
		assertNotEquals(0 ,mlist.size());	//데이터가 없으면 실패
	}

	@Test
	void testSelectOne() {
		String userid = "park";		
		MemberDTO mdto = mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto);	//mdto 가 null이 아닐때 성공
	}
	
	@Test
	void testInsert() {
		String userid = "parkl";		
		String passwd = "1111";		
		int brithyear = 2006;		
		
		MemberDTO mdto = new MemberDTO(userid,passwd,brithyear);
		int cnt = mdao.insert(mdto);
		//cnt 0이 아니면 성공 
		//assertNotEquals(0, cnt);

		//cnt가 (1)같으면 성공 
		assertEquals(1, cnt);
	}
	@Test
	void testUpdate() {
		String userid = "java";
		String passwd = "2222";
		int birthyear = 2010;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}
	@Test
	void testDelete() {
		String userid = "java";
		int cnt = mdao.delete(userid);
		assertEquals(1, cnt);
	}
	
	
	

}

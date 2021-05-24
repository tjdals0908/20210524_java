package ex11_guest;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testInsert() {							// 추가 
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO("홍길동","Hong@naver.com","1111","가입인사");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt+"건추가");
	}

	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOImpl();
		int seq = 1;							//입력한 번호 수정 

		GuestDTO gdto = new GuestDTO(seq,"이순신","Lee@naver.com","2222","가입인사");
		int cnt = gdao.update(gdto);
		System.out.println(cnt+"건 수정");
	}

	@Test
	void testDelete() {
		GuestDAO gdao = new GuestDAOImpl();
		int seq=1;								//입력한번호 삭제
		
		int cnt = gdao.delete(seq);
		System.out.println(cnt+"건 삭제");
	}

	@Test
	void testSelectOne() {						//입력한 번호 조회
		GuestDAO gdao = new GuestDAOImpl();
		int seq = 1;
		GuestDTO gdto = gdao.selectOne(seq);
		System.out.println(gdto);
		
	}
	@Test
	void testSelectList() {						//전체조회
		GuestDAO gdao = new GuestDAOImpl();
		List<GuestDTO> glist = gdao.selectList();
		System.out.println(glist);
		
	}

}

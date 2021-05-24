package ex07_jdbc.Salel;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import ex07_jdbc.member.MemberDTO;

class JunitTest {

	@Test
	void test() { //--일일 상품 판매 리스트

		SalesDAO  sdao = new SalesDAO();
		//출력 
		List<Map<String, Object>> mlist = sdao.dayItemSalesList();
		for(Map<String, Object> map: mlist) {
//			System.out.println(map);
			System.out.println(map.get("saledate"));
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("qty"));
			System.out.println(map.get("amount"));
			System.out.println(map.get("seq"));
		}
	}
	
	@Test
	void test1() {	//일일상품별 집계 판매
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> mlist = sdao.dayItemSum();
		
		for( Map<String, Object> map : mlist ) {
			System.out.println(map);
		}
				
		
	}
	
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		String saledate = "2021-4-30";
		
		
		List<Map<String, Object>> list= sdao.dayItemsalesTotal(saledate);
			System.out.println(list);
			
		for(Map<String, Object> map: list) {
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("qty"));
			System.out.println(map.get("amount"));
			System.out.println(map.get("seq"));
		}

	}
	
	@Test
	void test3() {
		SalesDAO sdao = new SalesDAO();
		
		String saledate = "2021-4-28";
		
		List<Map<String, Object>> list= sdao.dayItemsalesView(saledate);
		
		System.out.println(list);
		
		
	}
	
	
	
	
	
	
	

}

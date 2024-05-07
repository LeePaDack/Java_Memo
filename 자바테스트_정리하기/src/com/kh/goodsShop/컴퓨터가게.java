package com.kh.goodsShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 컴퓨터가게 {

	public static void main(String[] args) {
		// 모든 제품으로 HashMap
		
		// 상품추가 put
		// 노트북 700000
		// 데스크탑 20000
		// 모니터 5000
		// 마우스 3000
		// 키보드 2000
		HashMap<String, Integer> goods = new HashMap<>();
		goods.put("노트북", 700000);
		goods.put("데스크탑", 20000);
		goods.put("모니터", 5000);
		goods.put("마우스", 3000);
		goods.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품 목록");
		
		// Entry 사용해서 출력
		
		for(Map.Entry<String, Integer> e : goods.entrySet()) {
			String 제품 = e.getKey();
			int 가격 = e.getValue();
			System.out.println("제품 : " + 제품 + ", 가격 : " + 가격);
		}
		
		// 특정 물품의 가격 출력
		// Scanner 로 입력받아서 확인가능
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 물건을 적으세요 : ");
		String 찾는물건 = sc.nextLine();
		System.out.println(찾는물건 + " 가게에 있습니까?");
		
		// containsKey 존재하는지 존재하지 않는지 if 문 사용해서 확인 후 
		// 존재한다면 네 존재합니다
		// 존재하지 않는다면 현재 훔절입니다
		
		if(goods.containsKey(찾는물건)) {
			int 제품가 = goods.get(찾는물건);
			System.out.println("존재합니다. " + 제품가 + "입니다.");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
	
	}
	
}

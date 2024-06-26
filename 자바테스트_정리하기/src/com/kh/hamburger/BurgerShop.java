package com.kh.hamburger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BurgerShop {

	public static void main(String[] args) {
		// ArrayList 사용 주문리스트
		
		// new HamburgerOrder("동그라미","치즈버거");
		// new HamburgerOrder("안세모","베이컨버거");
		// new HamburgerOrder("박네모","상하이버거");
		// new HamburgerOrder("금각진","치킨버거");
		// new HamburgerOrder("동그라미","빅맥");
		
		ArrayList<HamburgerOrder> 주문리스트 = new ArrayList<>();
		
		주문리스트.add(new HamburgerOrder("동그라미","치즈버거"));
		주문리스트.add(new HamburgerOrder("안세모","베이컨버거"));
		주문리스트.add(new HamburgerOrder("박네모","상하이버거"));
		주문리스트.add(new HamburgerOrder("금각진","치킨버거"));
		주문리스트.add(new HamburgerOrder("동그라미","빅맥"));
		
		// toString 출력
		System.out.println(주문리스트);
		
		// ArrayList 에 담긴 중복으로 된 사람들을 중복으로 주문하지 못하게 하고 싶습니다.
		// HashSet
		System.out.println("중복있습니다.");
		System.out.println("처음 주문으로 중복주문을 처리하겠습니다.");
		
		// HashSet 사용해서 중복 주문을 방지하기 위한 set  중복 주문 방지
		// 중복된 주문 정보 제거하는거 출력
		
		Set<String> 중복고객제거 = new HashSet<>(); // 중복 확인을 위한 인스턴스 생성
		
		// 중복 고객을 제거한 다음 중복되지 않는 고객만 ArratList 에 다시 담기
		
		List<HamburgerOrder> 중복제거주문 = new ArrayList<>(); // 중복고객을 제거한 내용만 담을 예정
		
		// for each 문을 활용해서 중복이 있는지 한바퀴 돌면서 확인한 다음
		// 중복이 되지 않는 내용만 추가
		for(HamburgerOrder 주문 : 주문리스트) {
			// 존재하는 고객만 추가하겠다 라는 의미이기 때문에 추가가 안됨
			//if(중복고객제거.contains(주문.get고객명())) {
			if(!중복고객제거.contains(주문.get고객명())) { // 고객이 존재하지 않는다면 주문 내용추가
				중복제거주문.add(주문);
				중복고객제거.add(주문.get고객명());
			}
		}
		
		System.out.println(중복제거주문); // 중복제거주문 에는 처음에 주문한 리스트만 받을 수 있게 됨
		
		
		
	}
	
}

package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PizzaShop {

	public static void main(String[] args) {
		// 주문 목록을 저장할 ArrayList  주문 리스트
		/* 
		고영희 페페로니
		박철진 마르게리타
		안영식 슈프림
		고영희 파인애플
		박철진 치즈	
		*/
		// 고객과 피자리스트를 한번에 묶을 ArrayList 생성
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희", "박철진", "안영식", "고영희", "박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페페로니", "마르게리타", "슈프림", "파인애플", "치즈"));
		
		// for 문을 활용해서 주문 추가
		for(int i = 0; i < 고객리스트.size(); i++) {
			PizzaOrder order = new PizzaOrder(고객리스트.get(i), 피자리스트.get(i));
			주문리스트.add(order);
		}
		System.out.println(고객리스트);
		System.out.println(피자리스트);
		System.out.println(주문리스트);
		
		// HashSet 사용해서 중복 주문을 방지하기 위한 set  중복 주문 방지
		
		// 주문추가 PizzaOrder 를 사용해서 주문을 추가함
		
		// 주문한 내용 전체 보기 toString
		
		
		// 중복된 주문 정보 제거하는거 출력  for each
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

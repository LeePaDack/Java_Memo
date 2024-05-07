package com.kh.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// ArrayList , HashSet 함께 사용하기
public class ListSetEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// 값 추가
		list.add("Pizza");
		list.add("Hamburger");
		list.add("Subway");
		list.add("Pizza");
		
		// HashSet 선언 초기화
		// 객체를 통해 인스턴스 만듦
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Pizza");
		hashSet.add("Hamburger");
		hashSet.add("Subway");
		hashSet.add("Pizza");
		
		System.out.println(list);
		System.out.println(hashSet);
		
		// 키에 숫자도 O  중복 X
		HashMap<Integer, String> hashMap = new HashMap<>();
		System.out.println("안녕하세요. 과일가게에 오신 것을 환영합니다.");
		hashMap.put(1, "Mango");
		hashMap.put(2, "F_H");
		hashMap.put(3, "M_S");
		
		System.out.println(hashMap);
		hashMap.put(1, "Grape");
		System.out.println(hashMap);
		
		
		
	}
	
}

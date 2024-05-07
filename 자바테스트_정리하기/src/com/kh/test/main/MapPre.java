package com.kh.test.main;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	public static void main(String[] args) {
		// Map 또한 마찬가지로 인터페이스 이기 때문에 
		// 인스턴스 느낌으로 사용하려면 
		// Map<String, Integer> map = new HashMap<>(); 과 같이 사용해야함
		
		Map<String, Integer> map = new HashMap<>();
		// 순서가 보장되지 않음
		map.put("Apple", 2000);
		map.put("Banana", 3000);
		map.put("Cherry", 1000);
		
		System.out.println(map);
		
		// 주의 !
		map.put(" Banana", 500);
		
		System.out.println(map);
		
		map.put("Banana ", 1000);
		
		System.out.println(map);
		// " " 안에 공백 확인 , 순서 보장 X
		
		
		
	}
	
}

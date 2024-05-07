package com.kh.propertiesPre;

import java.util.Map;
import java.util.Properties;

public class PropertiesPre {
	
	public static void main(String[] args) {
		Properties 설정 = new Properties();
		
		// 속성 설정
		설정.setProperty("이름", "김다섯");
		설정.setProperty("나이", "15"); // 모든 표기는 숫자 또한 " " 작성
		설정.setProperty("사는곳", "서울");
		
		// 특정 값 조회하기
		String 이름조회 = 설정.getProperty("이름");
		System.out.println("이름 : " + 이름조회);
		
		// 전체 조회하기
		System.out.println("=== 전체 조회 ===");
		// Properties 또한 Map.Entry 사용해서 전체조회를 할 수 있음 
		// Properties 는 문자열로 작성하긴 하지만 Object 기반으로 가지고옴 
		for (Map.Entry<Object, Object> e : 설정.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println("키 : " + key + ", 값 : " + value);
		}
		
		
		
		
	}
	
}

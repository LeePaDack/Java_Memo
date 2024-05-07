package com.kh.propertiesPre;

import java.util.Map;
import java.util.Properties;

public class UserSetting {

	public static void main(String[] args) {
		// Properties 객체와 인스턴스 생성 = setting
		Properties setting = new Properties();
		// 속성 설정
		// name "john"
		// age "17"
		// city "Seoul"
		setting.setProperty("name", "John");
		setting.setProperty("age", "17");
		setting.setProperty("city", "Seoul");
		
		// city 조회하기
		// 조회내용 출력
		String 도시조회 = setting.getProperty("city");
		System.out.println("city : " + 도시조회);
		
		// 전체조회하기 Map.Entry<Object, Object>  key  value 출력
		for(Map.Entry<Object, Object> e : setting.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println("키 : " + key + ", 값 : " + value);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

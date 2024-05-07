package com.kh.basicEx;

// 안쓰는 것 청소해서 정리하기
/*
더이상 사용되지 않는 객체나 변수를 자동으로 정리하는 방식
 */
public class GarbageCollector {
	// main 메서드 들어가기 전에 작성하는 변수가 전역변수
	public static void main(String[] args) {
		// 지역변수 { } 안에 들어와서 작성을 했기 때문
		String address = "https://";
		System.out.println(address);
		
		address += "www.naver.com";
		System.out.println(address);
		
		
		
	}
	
}

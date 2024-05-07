package com.kh.basicEx;

public class GarbageCollector그림판 {
	
	public static void main(String[] args) {
		String Ph_number = "010"; // 가비지 컬렉션에 의해 Heap 에서 사라짐
		System.out.println(Ph_number); // 가비지 컬렉션에 의해 Heap 에서 사라짐
		
		Ph_number += "-1234-5678";
		System.out.println(Ph_number);
		
		
		
		
	}
	
}

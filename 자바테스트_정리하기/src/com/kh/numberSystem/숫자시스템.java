package com.kh.numberSystem;

public class 숫자시스템 {
	
	public static void main(String[] args) {
		int 숫자 = 42;
		
		// 42 라는 숫자를 2진수로 변환
		// 정수로 된 숫자 -> 문자열로 변환해서 모두 출력해서 보기위해 String 변환
		String 이진수 = Integer.toBinaryString(숫자);
		System.out.println(이진수);
		
		// 42 라는 숫자를 8진수로 변환
		String 팔진수 = Integer.toOctalString(숫자);
		System.out.println(팔진수);
		
		// 42 라는 숫자를 10진수로 변환 (2진수로 변환한 값을 가져와서 10으로 변환)
		String 이진수2 = "101010"; // 42
		int 십진수 = Integer.parseInt(이진수2, 2);
		System.out.println(십진수);
		
		// 어떤 진수(2, 8 ,16) -> 10진수 parseInt 를 사용해서 변경
		
		// 8진수를 10진수로 변환
		String 팔진수2 = "52"; // 8진법 52 == 42
		/* ㅊ 한자로 ¹ 가능
		        4       2
		     4 * 8^1  2 * 8^0
		      32         2
		      나머지를 역순으로 나열하면 52
		 */
		int 십진수8 = Integer.parseInt(팔진수2, 8);
		System.out.println(십진수8); // 42(십진수) = 52(팔진수)
		
		// 십육진수를 십진수로 변환
		String 십육진수 = "2A";
		/*
		16진법에서 A 는 10  2 는 2
		2A16 = 2 * 16^1 + A * 16^0
		2A16 = 2 * 16 + 10 * 1 = 42
		 */
		int 십진수16 = Integer.parseInt(십육진수, 16);
		System.out.println(십진수16);
		
		
	}
	
}

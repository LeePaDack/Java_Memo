package com.kh.test.main;

public class Test2 {

	public static void main(String[] args) {
		/*
		2 단에서 5 단까지의 구구단의 결과 중 홀수인 것만 출력하기    단, for 문을 이용
		 */
	
		for(int dan = 2; dan <= 5; dan++) {
			for(int num = 1; num <= 9 ; num++) {
				if(num * dan % 2 == 1) {
					System.out.println(dan + " * " + num + " = " + (num * dan));
				}
			}
		}
		
		
	
	
	
	}
	
}

package com.kh.test.main;

public class Test8 {

	public static void main(String[] args) {
		// 삼항연산자 익히기
		
		// 두 수 중에서 큰 수 구하기
		
		int num1 = 10;
		int num2 = 20;
		
		String bigger = (num1 > num2) ? "num1 is bigger" : "num2 is bigger";
		System.out.println(bigger);
		
		// 짝수 홀수
		int num3 = 15;
		String oe = (num3 % 2 == 0) ? "짝" : "홀";
		System.out.println(oe);
		
		
		// 성인 미성년자 판별하기
		int age1 = 18;
		String 결과 = (age1 > 20) ? "성인" : "미성년자";
		System.out.println(결과);
		
		
		// 과목 점수에 따라 합격 불합격 판별하기
		int kor = 80;
		int eng = 75;
		int math = 90;
		String result = (kor >= 60 && eng >= 60 && math >= 60) ? "pass" : "fail";
		System.out.println(result);
		
		
		// 두 수가 서로 같은지 다른지
		int num4 = 10;
		int num5 = 20;
		String result2 = (num4 == num5) ? "same" : "not same";
		System.out.println(result2);
		
	}
	
}

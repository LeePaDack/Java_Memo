package com.kh.test.main;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		// while 이용해서 1 부터 100 까지의 모든 정수들의 합과 평균 구하기
		int sn = 1;
		int sum = 0;
		int count = 0; // 반복한 횟수
		
		while(sn <= 100) {
			sum += sn;
			count++;
			sn++;
		}
		
		// 평균 구하기
		double avg = (double) sum / count;
		System.out.println("숫자합 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		// while 문을 사용해서 switch 문 계속 숫자 작성하게 만들어주고
		// case 3: 종료 만들어주기
		
		
		// switch 문 실행해보기
		Scanner sc = new Scanner(System.in);
		String hw;
		
		// while 에 true 대신 true 가 담겨져 있는 변수 하나 만들어주고
		// 변수 값을 true -> false 로 만들어준 후 종료시키기
		
		boolean ctn = true;
		
		while(ctn) {
			System.out.print("숫자 작성 : ");
			int date = sc.nextInt();
			
			switch(date) {
			case 1:
				hw = "월요일 : 업무";
				break;
			case 2:
				hw = "화요일 : 공부";
				break;
			case 3:
				System.out.println("종료");
				ctn = false;
				break;
			default :
				hw = "휴식";
				break;
			}
			
			// System.out.println("일정 : " + hw);
		}
	}
	
}

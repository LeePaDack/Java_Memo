package com.kh.test.main;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		1 부터 9 까지 ㄱ밧을 스캐너로 각각 입력받아
		더하기 빼기 곱하기 몫 출력하기
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자를 입력하세요 (1 ~ 9) : ");
		int num1 = sc.nextInt();
		if(num1 < 1 || num1 > 9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요.");
			return;
		}
		
		System.out.print("두 번째 숫자를 입력하세요 (1 ~ 9) : ");
		int num2 = sc.nextInt();
		if(num2 < 1 || num2 > 9) {
			System.out.println("1 부터 9 사이의 정수를 입력하세요.");
			return;
		}
		
		// if 굳이 안써도 될듯 oo 
		if (num1 < 10 && num1 >= 1 && num2 < 10 && num2 >= 1) {
			int sum = num1 + num2;
			System.out.println("sum : " + sum);
			
			int minus = num1 - num2;
			System.out.println("minus : " + minus);
			
			int mul = num1 * num2;
			System.out.println("mul : " + mul);
			
			int div = num1 / num2;
			System.out.println("div : " + div);
		}
	
	}
	
}

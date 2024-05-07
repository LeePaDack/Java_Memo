package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		키보드 1 개의 정수형 int 데이터를 받아 
		1 ~ 100 사이의 값일 때만 2 의 배수인지 아닌지를 출력 처리한다
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		
		int num = sc.nextInt();
		
		// 만약 숫자가 1 ~ 100 사이일 때 연산자
			// 2의 배수인지 아닌지 if else 확인
		
		// 1 ~ 100 사이가 아니면 1 ~ 100 사이 값만 입력해주세요. 출력
		
		if(num >= 1 && num <= 100) {
			if(num % 2 == 0) {
				System.out.println("2 의 배수입니다.");
			}
			else {
				System.out.println("2 의 배수가 아닙니다.");
			}
		}
		else {
			System.out.println("1 ~ 100 사이 값만 입력해주세요.");
		}
		
		System.out.println("/////// if  else if  else ////////");
		int num1 = 5;
		
		if(num1 > 0) {
			System.out.println("양수입니다.");
		}
		else if(num1 < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
		
		
	}
}

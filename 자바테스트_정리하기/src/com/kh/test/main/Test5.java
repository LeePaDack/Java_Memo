package com.kh.test.main;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요 (1 ~ 9) : ");
		int num1 = sc.nextInt();
/*		if (num1 < 1 || num1 > 9) {
			System.out.println("1 에서 9 입력");
			return;
		} */
		System.out.print("두 번째 수를 입력하세요 (1 ~ 9) : ");
		int num2 = sc.nextInt();
/*		if (num2 < 1 || num2 > 9) {
			System.out.println("1 에서 9 입력");
			return;
		}*/
		
		if (num1 < 10 && num1 >= 1 && num2 < 10 && num2 >= 1) {
			int mul = num1 * num2;
			if(mul < 10) {
				System.out.println("한자리 수 입니다.");
			}
			else if(mul >= 10 && mul <= 99) {
				System.out.println("두자리 수 입니다.");
			}
		}
		else {
			System.out.println("1 ~ 9 입력");
		}
	
	}
		
}

package com.kh.test.main;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수를 입력하세요 (1 ~ 5) : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("입력이 정상적으로 되었습니다.");
				break;
			case 2:
				System.out.println("조회가 시작되었습니다.");
				break;
			case 3:
				System.out.println("수정이 되었습니다.");
				break;
			case 4:
				System.out.println("삭제가 되었습니다.");
				break;
			case 5:
				System.out.println("정상적으로 종료되었습니다.");
				return;
			default :
				System.out.println("다시 입력해주세요");
				break;
			}
			sc.close();
		}
		
		
		
		
		
		
		
		
	}

}

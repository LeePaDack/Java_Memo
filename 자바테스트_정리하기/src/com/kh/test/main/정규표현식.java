package com.kh.test.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한글을 입력하세요 : ");
		String 입력 = sc.nextLine();
		
		// 예를 들어서 반복하는 패턴이 가 - 힣 한글이라면
		if(Pattern.matches("^[가-힣]$",입력)) {
			System.out.println("한글 맞음");
		}
		else {
			System.out.println("한글 아님");
		}
		
		
		
		// 전화번호 0-9 입력하는 스캐너 진행해보기
		
		System.out.println("전화번호를 - 없이 입력하세요 : ");
		String num = sc.nextLine();
		
		if(Pattern.matches("^[0-9]$", num)) {
			System.out.println("입력한 문자열은 전화번호 형식입니다.");
			// Integer.paraInt(_
		}
		else {
			System.out.println("전화번호 형식이 아닙니다.");
		}
		
		
	}
	
}

package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("학년 입력 :");
		int grade = sc.nextInt();
		System.out.print("반 입력 : ");
		int clss = sc.nextInt();
		System.out.print("번호 입력 : ");
		int number = sc.nextInt();
		System.out.print("성별 입력 (M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 입력: ");
		double score = sc.nextDouble();
		
		Student std = new Student(name, grade, clss, number, gender, score);
		
		std.information();
		
		
	}
	
}

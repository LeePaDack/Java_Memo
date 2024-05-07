package com.kh.test.main.oop;

public class Main {

	// 최종으로 실행할 메인 메서드
	public static void main(String[] args) {
		Dog happy = new Dog();
	// 객체 |  ~~~  인스턴스 ~~~ 
		Dog love = new Dog();
		
		Dog hope = new Dog();
		
		// happy, love, hope 인사소리 듣기
		// 인터페이스 메서드에 작성한 makeSound 를 Dog 에서 재작성한 소리로 변경해서 듣는것
		happy.makeSound();
		love.makeSound();
		hope.makeSound();
		hope.eat();
		
		
		
	}
	
}

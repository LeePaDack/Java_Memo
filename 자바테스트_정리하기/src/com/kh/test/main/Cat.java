package com.kh.test.main;
// extends Animal
public class Cat extends Animal {
// super 이용해서 Cat 에서 부모클래스 있는 필수생성자 호출
	
	public Cat(String name) {
		super(name);
	}
	
	// 메서드 오버라이딩 "고양이가" + getName() + "야옹"
	@Override
	public void makeSound() {
		System.out.println("고양이가" + getName() + "야옹");
	}

}
package 자바_예제문제실습;
/*
캡슐화 원칙에 맞게 구현하기
// 필드
String 동물이름;
int 나이;

// 메서드
	// Getter
	// Setter
	// 기본 생성자
	// 필수 생성자
	// @Override toString 활용해서 문자열 출력하기

 */
public class Animal {
	private String name;
	private int age;
	
	// getter setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 기본
	public Animal() {
	}
	
	// 필수
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString
	@Override
	public String toString() {
		return "동물이름 = " + name + ", 동물나이 = " + age;
	}
	
	
	
	
	
	
	
	
	
	
}

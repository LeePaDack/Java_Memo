package 자바_예제문제실습;
/*
캡슐화
String 사람이름 김영희
int 나이 10

생성자
toString

PersonMain person.txt 저장
 */
public class Person {
	private String 사람이름 = "김영희";
	private int 나이 = 10;

	public Person() {
	}

	public Person(String 사람이름, int 나이) {
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}

	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이;
	}
	
	
	
	
	
}

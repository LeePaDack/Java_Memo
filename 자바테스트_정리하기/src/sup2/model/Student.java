package sup2.model;

public class Student {
// 필드
	private String name;
	private int grade;
	private int clss;
	private int number;
	private char gender;
	private double score;

	
// 메서드
	// 필수 생성자
	public Student(String name, int grade, int clss, int number, char gender, double score) {
		this.name = name;
		this.grade = grade;
		this.clss = clss;
		this.number = number;
		this.gender = gender;
		this.score = score;
	}
	
	public void information() {
		System.out.println("학생이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + clss);
		System.out.println("번호 : " + number);
		String chgender = (gender == 'M') ? "남학생" : "여학생";
		System.out.println("성별 : " + chgender);
		System.out.println("성적 : " + score);
	}
	
	
	
	
	
}

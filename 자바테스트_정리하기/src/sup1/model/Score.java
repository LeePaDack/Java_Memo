package sup1.model;

public class Score {
// 필드
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	
// 메서드
	// 필수 생성자
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// void
	public void result() {
		total = kor + eng + math;
		avg = total / 3;
		
		String 결과 =(kor >= 50 && eng >= 50 && math >= 50 && avg >= 50) ? "합격" : "불합격";
		
		System.out.println("국어점수 : " + kor + ", 영어점수 : " + eng + ", 수학점수 : " + math);
		
		System.out.println(결과);
		
	}
	
	
	
	
	
	
	
	
	
	
}

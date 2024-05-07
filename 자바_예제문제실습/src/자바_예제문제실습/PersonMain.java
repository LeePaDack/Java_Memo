package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	
	public static void main(String[] args) {
		
		PersonMain 사람정보파일만들기 = new PersonMain();
		사람정보파일만들기.fileSave("person.txt");
		
	}
	
	public void fileSave(String 파일이름) {
		// File FileWriter BufferedWriter 사용해서 파일 작성하고 저장
		File file = new File(파일이름);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person ps = new Person("김영희", 10);
			
			bw.write(ps.toString());
			bw.close(); // 다 쓴 내용을 저장하기 를 하기도 함
			System.out.println("성공적으로 저장");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

	
}

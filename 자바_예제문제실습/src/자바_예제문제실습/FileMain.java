package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
기존에 있던 animal.txt 파일에 코뿔소 ~ 코끼리친구코뿔소를 이어서 작성하려는데 작성이 안됨
동물이름=멧돼지, 나이=3
밑에 코뿔소, 10 코끼리친구코뿔소가 이어서 저장되게 만들어주기
 */
public class FileMain {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt",true); // ,true 가 이어쓰기라는 뜻 ***
			BufferedWriter bw = new BufferedWriter(fw);
			
			fw.write("\n코뿔소 , 10\n");
			fw.write("코끼리친구 코뿔소");
			
			fw.close();
			
			System.out.println("실행완료");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

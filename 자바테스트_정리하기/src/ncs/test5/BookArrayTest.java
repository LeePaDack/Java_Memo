package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		// for each 문으로 출력
		for(Book b : bArray) {
			System.out.println("[제목] : " + b.getTitle() + ", [저자] : " + b.getAuthor()
								+ ", [가격] : " + b.getPrice() + ", [출판사] : " + b.getPulblisher()
								+ ", [할인률] : " + b.getDiscountRate() + ", [할인가] : " + b.get할인가());
		}
		
		
	}
	
}

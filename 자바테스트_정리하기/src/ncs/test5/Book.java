package ncs.test5;

public class Book {
// 필드
	private String title;
	private String author;
	private int price;
	private String pulblisher;
	private double discountRate;
	
	// getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPulblisher() {
		return pulblisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPulblisher(String pulblisher) {
		this.pulblisher = pulblisher;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	// 기본 생성자
	public Book() {

	}

	// 필수 생성자
	public Book(String title, String author, int price, String pulblisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pulblisher = pulblisher;
		this.discountRate = discountRate;
	}

	// 할인률과 정상가격을 확인해서 할인가를 알고 싶을 때 작성하는 메서드
	public int get할인가() {
		// 할인하는 계산 방식
		double discountAmount = price * discountRate;
		
		// 정상가에서 할인이 들어간 금객
		int 할인가격 =(int)(price - discountAmount);
		return 할인가격;
	}
	
	
	
	@Override
	public String toString() {
		return "Book title=" + title + ", author=" + author + ", price=" + price + ", pulblisher=" + pulblisher
				+ ", discountRate=" + discountRate;
	}
	
}

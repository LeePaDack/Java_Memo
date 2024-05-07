package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
// 필드
	private String productName; 
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
// 메서드
	// Getter Setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	// 기본생성자
	public Inventory() {
	}
	
	// 필수생성자
	// 핸드폰 이름 출시일 재고량            판매와 판매후 남은 재고는 알 수 없기 떄문에 지워줌
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmount = getAmount;
		//this.inventoryAmount = inventoryAmount;
	}

	// toString
	@Override
	public String toString() {
		
		// 날짜 형식을 변경
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		String 문자열반환 = dateFormat.format(putDate);
		String 출고일변환 = dateFormat.format(getDate);
		int 남은재고 = putAmount - getAmount;
		
		return "제품명 = " + productName + ", 입고일 = " + 문자열반환 +
				", 출고일 = " + 출고일변환 + ", 상품재고 = " + putAmount + ", 판매량 = " 
				+ getAmount + ", 남은재고 = " + 남은재고;
	}
		

	
	
	
}

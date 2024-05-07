package com.kh.variableEx;
/*
(자료)형변환
	데이터 타입을 변환하는 것
	변환에는 자동으로 변환하는 형변환
	       강제로 변환하는 형변환
	       
	자동으로 형변환이 가능한 경우는 자료형의 byte 가 서로 같거나
	변환하는 결과가 변환 전 byte 보다 클 경우 자동으로 형변환 가능
	큰 byte 에서 작은 byte 로 넘어갈 때는 큰 그릇에서 작은 그릇으로 이동하기 때문에
	강제로 넣어줘야함 (강제로 넣을 경우 데이터 손실 발생 가능성 있음)

	자동형변환 () 를 생략해도 되고 생략하지 않아도 됨
		Ex) int num = 10;
			double rNum = (double) 10;   <- (double) 생략되도 가능
			
	강제형변환 () 를 무조건 넣어줘야함
		Ex) double rNum = 1.0;
			int num = (int) rNum;    <- (int) 를 필수로 작성
			
	메서드 호출을 통한 형변환 
	String -> 숫자자료형
		
		객체자료형.parse자료형(변환할값);
		
		Integer.parseInt(변환할Stirng변수);
		Double.parseDouble(변환할String변수);
		Byte.parseByte(변환할String변수);
		Short.parseShort(변환할String변수);
		Float.parseFloat(변환할String변수);
		Long.parseLong(변환할String변수);
		
	숫자자료형 -> String
		
		객체자료형.toString(변환할숫자변수);
		
		Integer.toString(변환할숫자변수);
		Double.toString(변환할실수변수);
		Byte.toString(변환할숫자변수);
		Short.toString(변환할숫자변수);
		Float.toString(변환할실수변수);
		Long.toString(변환할숫자변수);
		
		
		
		
			
		일부 데이터들은 메서드를 통해 값 변환이 진행됨
		
		문자열 String 으로 담은 값을 숫자 계열로 변경하고 싶을 때 많이 사용
		
		Ex) 문자열을 정수로 변환하길 원한다면
			String Number = "01012345678";
			Integer.parseInt(Number);  <- 숫자로 변경

		정수는 맨 앞에 0 을 자동으로 제거시킨 후 진행
		

 */
public class 형변환 {

}

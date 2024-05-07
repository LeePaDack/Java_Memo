package com.kh.test.main;

public class ParseStringPre2 {

	public static void main(String[] args) {
		
		// 1. String 으로 받은 핸드폰 번호를 정수르 변경
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		
		// 2. String 으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		// 3. 정수로 받은 핸드폰 번호를 String 으로 변환
		int phoneNumber2 = 102345678;
		String str1 = Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		// 4. 실수로 받은 점수를 String 으로 변경
		double Score2 = 72.5;
		String str2 = Double.toString(Score2);
		System.out.println(str2);
		
		// 5. 문자열에서 - 하이픈 제거
		String phoneNumber3 = "010-1234-5678";
		// replace : 어떤 값을 모두 변경
		// "" 안에 아무것도 작성해주지 않으면 삭제라는 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-", "");
		System.out.println("하이픈이 제거된 핸드폰 번호 : " + 하이픈제거);
		
		// 6. 주민번호에서 하이픈 제거
		String Id = "010010-1322456";
		String 하이픈제거2 = Id.replace("-", " ");
		System.out.println("하이픈이 제거된 주민번호 : " + 하이픈제거2);
		
		// charAt()
		// 주민등록번호에서 하이픈을 제거하고 성별을 추출하기
		String Id2 = "245612-3456798";
		String 하이픈제거3 = Id2.replace("-", "");
		char gender = 하이픈제거3.charAt(6);
		System.out.println(gender);
		
		// 삼항연산자를 사용해서 성별 번호가 1, 3 이면 ? "남성" : "여성";
		String 성별 = (gender == '1' || gender == '3')? "남성" : "여성";
		System.out.println(성별);
		
		// 주민번호에서 - 제거 후 삼항연산자를 사용해서 성별 추출
		String Id3 = "200101-4567891";
		String 주민번호3 = Id3.replace("-","");
		System.out.println(주민번호3);
		char gender3 = 주민번호3.charAt(6);
		System.out.println(gender3);
		String 성별3 = (gender3 == '1' || gender3 == '3') ? "남성" : "여성";
		System.out.println(성별3);
		
		// 주민번호가 앞에는 6자리가 맞는지 확인하고 뒤에는 7자리가 맞는지 확인 
		String Id4 = "870101-2345678";
		
		boolean is주민 = 
				(Id4.length() == 14) && // 1. 주민등록번호가 - 포함해서 14 자리가 맞는지 확인
				(Id4.charAt(6) == '-') && // 2. 생년월일작성후 - 이 들어가 있는지 확인
				(Id4.substring(0, 6).matches("[0-9]+")) && // 3. 앞에 6 자리가 숫자로만 이루어져 있는지
				(Id4.substring(7).matches("[0-9]+")); // 4. 뒤에서 7번부터 모두 숫자로 이루어져 있는지		
		
		System.out.println("주민번호가 제대로 작성이 이루어졌나요? : " + is주민);
		
		
	}
	
}

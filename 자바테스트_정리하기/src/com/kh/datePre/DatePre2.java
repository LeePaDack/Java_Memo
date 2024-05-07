package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {

	public static void main(String[] args) {
		Date now = new Date();
		// 날짜 형식 0000년 00월 00일
		// - 이외에 다른 글자를 넣게되면 시 분 초 값을 읽어오지못함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE");
		
		// 날짜를 문자열로 format 형식
		String formatK = sdf.format(now);
		// 출력
		System.out.println(formatK);
		// 문자열을 날짜로 parse 를 사용해서 변경
		try {
			Date parseDate = sdf.parse(formatK);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}

package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		// Date 는 최초1회만해줌
		System.out.println(now);
		System.out.println("////////////");
		// Date 로 현재 날짜를 받아서 년 월 일 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = sdf.format(now);
		System.out.println(formatDate);
		
		System.out.println("////////////");
		// 문자열(SimpleDateFormat - String) -> 날짜(Date) 변경
		// Date parseDate2
		String 문자열 = "2024-04-30";
		try {
			Date parseDate2 = sdf.parse(문자열);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("////////////");
		// 시 : 분 : 초 출력
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String formatTime = sdf1.format(now);
		System.out.println(formatTime);
		
		System.out.println("////////////");
		// 년 월 일 시 분 초 출력
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = sdf2.format(now);
		System.out.println(formatDateTime);
		
		System.out.println("////////////");
		String 문자열1 = "2024-05-03 11:14:04";
		try {
			Date parseDate3 = sdf2.parse(문자열1);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}

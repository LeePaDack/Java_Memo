package com.kh.sandwich;

import java.util.ArrayList;
import java.util.HashSet;

public class 샌드위치가게 {
	
	public static void main(String[] args) {
		// 주문리스트 ArrayList
		
		// 김하나 BLT
		// 이둘 터키
		// 김하나 치킨
		// 이셋 에그마요
		// 김하나 베지터블
		ArrayList<샌드위치> 주문리스트 = new ArrayList<>();
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이셋", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));
		
		// 고객명 HashSet
		HashSet<String> 고객명 = new HashSet<>();
		
		// 중복제거리스트 ArrayList
		ArrayList<샌드위치> 중복제거리스트 = new ArrayList<>();
		
		// 중복여부를 확인하고 중복되지 않은 주문만 리스트에 추가
		for(샌드위치 sd : 주문리스트) {
			if(!고객명.contains(sd.get고객명())) {
				중복제거리스트.add(sd);
				고객명.add(sd.get고객명());
			}
		}
		// 중복제거리스트 출력  세로로
		for(샌드위치 list : 중복제거리스트) {
			System.out.println(list);
		}
		
	}
	
}

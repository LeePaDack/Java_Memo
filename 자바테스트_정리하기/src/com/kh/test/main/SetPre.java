package com.kh.test.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPre {

	public static void main(String[] args) {
		// set 같은 경우 인터페이스 이기 때문에 단독으로 사용하지는 못하지만 
		// Set 셋 = new Set<>(); X 불가능
		// Set 셋 = new HashSet<>(); O 가능
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");
		
		System.out.println("HashSet : " + set1);
		
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(5);
		set2.add(2);
		set2.add(8);
		
		System.out.println("TreeSet : " + set2);
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("Movie");
		set3.add("Drama");
		set3.add("TV");
		
		System.out.println("LinkedHashSet : " + set3);
		
		// clear  remove  isEmpty  O 
		
		// set  get  X   사용해서 값을 수정하거나 가져올 수 없음

	}

}

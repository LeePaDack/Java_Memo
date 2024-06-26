package com.kh.collectionEx;
/*
Map - 인터페이스 / HashMap TreeMap LinkedMap 클래스를 사용해야함

Properties 키(key) 값(value) 문자열 형태로 저장되는 클래스
일반적으로 속성파일을 읽거나 쓰는데 사용
주로 텍스트 파일로 저장됨
키와 값이 모두 문자열

메서드
	load() : 파일을 대기
	store() : 파일을 저장
	getProperty() : 값 전달
	setProperty() : 값 저장
	loadFromXML() : xml 파일을 대기
	storeToXML() : xml 파일을 저장
	파일안에 주석을 작성할 수 있음, 주석은 # or ! 사용

	Properties 키와 값을 설정할 때 한글로 작성해서 파일로 저장할 경우
	한글이 유니코드 형태로 보일 수 있으므로 (Ex) \U5BC)
	영어 작성을 권장함
	
	Properties 는 설정파일이고, 자바에서 코드로 작성을 해서 파일로 보낼때는 
		       " " 사용해서 키와 값을 넣지만 추후 저장되는 값은 무조건 String 이 아니기 때문에
		       Object 를 사용해서 전체조회를 할 수 있음
	
	전체조회 사용 코드 예제
	
	for(Map.Entry<Object,Object> e : 설정파일.entrySet()){
		Object key = e.getKey();  // 키 가져오기
		Object value = e.getValue();  // 값 가져오기
	}


 */
public class Properties {

}

package 자바_예제문제실습;

import java.util.ArrayList;

public class ArrayMovie {
	
	public static void main(String[] args) {
		// 영화를 넣을 ArrayList 생성 
		ArrayList<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie("Avengers","Action"));
		movieList.add(new Movie("Mad Max","Thriller"));
		movieList.add(new Movie("Tom and Jerry","Animation"));
		
		
	}
	
}

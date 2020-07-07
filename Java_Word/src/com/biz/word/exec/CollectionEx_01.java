package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {

	public static void main(String[] args) {
		
		String nation = "KOREA";
		String[] nations = nation.split(""); // 알파벳 단위로 분해해서 배열nations에 저장해줌
		
		// Arrays			static 메서드가 있어서 .으로 불러줄 수 있었다. 배열을 리스트로 변환하는 친구
		// Arrays.asList(배열) : 배열을 List형 데이터로 변환
		List<String> words = Arrays.asList(nations);
		// Collections 클래스의 기능을 몇가지 사용하기 위해서
		// 배열을 List형 데이터로 변환했다.
		
		// sort라는 메서드를 사용해주면 오름차순(기본값)으로 정렬
		// collections의 기능이 디버깅 확인 내용만 확인하고 싶을 때
		
		// String, Integer, Long, Float, Character, Boolean과 같은
		// Wrapper class를 포함하는 List 데이터를
		// 오름차순 정렬하는 매우 간단한 메서드이다.
		// Collections의 sort() method는 내부 알고리즘이 Quick Sort 이므로
		// 사용하는데 아무런 제약이 없이 사용해도 된다.
		Collections.sort(words); // sort코드 중에 가장 빠른 Q코드 // return이 필요없음! 변경해주는거
		System.out.println(words); // 오름차순, 알파벳으로 정렬을 해줌

		// List에 포함된(VO도 마찬가지) item들을 뒤죽박죽하게 섞는 기능을 수행한다.
		Collections.shuffle(words);
		System.out.println(words);
	}
}

package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {

	public static void main(String[] args) {
		
		// 객체(인스턴스)들의 묶음 객체
		// List<제네릭:Generic> 리스트에 포함된 객체가 무엇인가를 명시
		List<String> strList; // String 객체(문자열)이 요소로 포함된 리스트다. 선언은 List로 선언하고
		
		// 뒤에 생성자에는 ArrayList로
		strList = new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라만세");
		
		int size = strList.size();
		for(int i = 0 ; i < size ; i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		
		// 다시 리스트에 추가했기 때문에 다시 size 재정의
		// 항상 size값을 어떤 변수에 담고 for문을 반복해야함
		// 위에서 add가 될수도 있고 빼질수도 있어서
		// 내가 그 size를 모르니까!
		size = strList.size();
		
		for( int i = 0 ; i < size ; i++) {
			// 위 코드와는 다르게 한줄로 줄여서 출력할 수 있음
			System.out.println(strList.get(i));
		}
		
		// size를 한번만 조회를 하면 알아볼 수 있는데
		// 얘는 for문이 반복되는 동안 size() method가 계속 반복이돼서
		// 위의 코드와 다르게 상당히 비효율적이다.
		// 그래서 우리는 size를 먼저 알아보고 for문을 반복하자!
		/*
		 * for 문이 strList개수만큼 반복 수행되는 동안
		 * 계속해서 size() method를 호출하여 연산을 수행하도록 한다.
		 * strList 개수가 for 반북몬 내에서 변경되지 않는 경우
		 * 매우 불필요한 연산 반복 수행하는 결과가 된다.
		 */
		for( int i = 0 ; i < strList.size() ; i++) {
			// 위 코드와는 다르게 한줄로 줄여서 출력할 수 있음
			System.out.println(strList.get(i));
		}
		
		// 개수를 1번만 조회하고 for 반복문 수행하기
		// 이 코드는 개수를 1번만 조회하고 for 반복문을 수행하기 때문에
		// 위의 코드보다는 효율적이다 
		// 하지만 개수를 조회하는 코드를 생략하면 혹시 리스트 개수가 변경되었을 때
		// for 반복문 연산 수행에 문제가 될 수 있다.
		size = strList.size();
		for( int i = 0 ; i < size ; i++) {
			// 위 코드와는 다르게 한줄로 줄여서 출력할 수 있음
			System.out.println(strList.get(i));
		}
		
		// List 전체에 대해서 for 반복문을 수행할 경우
		// 사용할 수 있는 향상된 for, forEach문 라고 한다.
		// 1. strList 개수만큼 알아서 for가 반복된다.
		// 2. for가 반복되면서 strList.get(현재)를 str 변수에 할당
		// 3. for 반복문 내에서 str 변수 값을 읽어서 사용할 수 있다. >> 이러면 사이즈 조회도 할 필요 없이 사용할 수 있다.
		// >> 알아서 컴파일이 바로 위코드로 변환이 되서 우리가 이렇게만 적어줘도 알아서 
		for(String str : strList) {
			System.out.println(str);
		}
		
		// 배열도 향상된 for를 사용하여 반복문을 수행할 수 있다.
		int[] intArray = new int[100]; // intArray는 0~99까지 100개가진 배열
		for(int i : intArray) {
			System.out.println(i);
		}
	}
}

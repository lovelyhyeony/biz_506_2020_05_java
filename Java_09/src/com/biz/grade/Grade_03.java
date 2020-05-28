package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	/*
	 * 정수형 변수 1개 선언 초기화
	 * 임의의 정수를 변수에 할당
	 * 변수에 저장된 값에 55를 곱셈하라
	 * 또 다른 변수에 저장
	 * 최종결과값 Console에 표시
	 */
	
	public static void main(String[] args) {
		
		int intNum = 0;
		Random rnd = new Random();
		
		intNum = rnd.nextInt() ;
		int intM = intNum * 55 ;
		
		System.out.println(intM);
		
		
		
		
		
		
		
		
		
	}
}

package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {
		
		// 10개의 정수형 배열 선언하고 51~100 까지 임의수 생성후
		// 배열에 저장된 값중에서 짝수들만의 합을 Console에 표시하라는 코드
		int[] intNum = new int[10];
		int intSum = 0 ;
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			intNum[i] = rnd.nextInt(50) + 51 ;
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			if( intNum[i] % 2 == 0 ) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들만의 합 : " + intSum);
		
		
		
	}
}

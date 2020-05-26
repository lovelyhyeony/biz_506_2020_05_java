package com.biz.grade;

import java.util.Random;

public class Grade_13 {

	public static void main(String[] args) {
		
		//100개의 정수형 배열 선언 , 1~100까지 임의수를 생성,저장 후
		// 배열에 저장된 값 중에서 3의 배수 또는 5의 배수인 수들의 합을 나타내는 코드
		
		Random rnd = new Random();
		
		int[] intNum = new int[100];
		// 임의수를 저장하는 코드
		for(int i = 0 ; i < 100 ; i++ ) {
			intNum[i] = rnd.nextInt(100)+1;
		}
		// 연산부분
		int intSum = 0 ;
		for (int i = 0 ; i < 100 ; i++) {
			if(intNum[i] % 3 == 0 || intNum[i] % 5 == 0 ) {
				intSum += intNum[i];
			}
		}
		// 출력 부분 // 코드 분리 사용 생활화 
		System.out.println("3의 배수 또는 5의 배수인 수들의 합 : " + intSum);
		
		
		
		
	}
}

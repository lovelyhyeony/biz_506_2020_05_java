package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	public static void main(String[] args) {
		
		int intKor = 0 ;
		int intEng = 0 ;
		int intMath = 0 ;
		
		Random random = new Random(); // 임의의 값을 뽑을 때 사용하는 도구
		
		intKor = random.nextInt(100) + 1;
		intEng = random.nextInt(100) + 1;
		intMath = random.nextInt(100) + 1;
		
		int intSum = intKor;
		intSum += intEng ;
		intSum += intMath; // 변수에 누적하는 코드
		
		int intAvg = intSum / 3 ;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);
		
		
		
		
		
		
	}
	
	
}

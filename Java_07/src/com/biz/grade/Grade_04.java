package com.biz.grade;

import java.util.Random;

public class Grade_04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		//float floatKor = 0.0f;
		
		float floatKor = random.nextInt(50) + 51 ;
		float floatEng = random.nextInt(50) + 51 ;
		float floatMath = random.nextInt(50) + 51 ;
		
		float fSum = (floatKor + floatEng + floatMath) ;
		float fAvg = fSum / 3;
		
		System.out.println("총점 : " + fSum);
		System.out.println("평균 : " + fAvg);
		
		
		
		
		
		
		
		
	}
}

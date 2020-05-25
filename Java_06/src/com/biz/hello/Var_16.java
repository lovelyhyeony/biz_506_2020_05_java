package com.biz.hello;

import java.util.Random;

public class Var_16 {

	public static void main(String[] args) {
		// 임의의 숫자를 51~100까지 숫자를 집어넣고 평균과 총점을 구하는 코드
		Random rnd = new Random();
		int intKor = rnd.nextInt(50) + 51 ;
		int intEng = rnd.nextInt(50) + 51 ;
		int intMath = rnd.nextInt(50) + 51 ;
	
		// int sum =intKor + intEng + intMath
		// int avg = sum /3
		
		System.out.println("세 과목 총점 : " + (intKor + intEng + intMath));
		System.out.println("세 과목 평균 : " + ((intKor + intEng + intMath) / 3 ));
		
		
		
		
		
		
		
		
		
		
	}
}

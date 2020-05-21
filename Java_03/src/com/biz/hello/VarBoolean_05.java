package com.biz.hello;

import java.util.Random;

public class VarBoolean_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random(); //준비단계
		int num1 = rnd.nextInt(100); //선언초기화(저장,할당)
		boolean bVar = num1 % 2 == 0 ;
		if(bVar) {
			System.out.println(num1 + "은 짝수");
		}
		if(!bVar) {
			System.out.println(num1 + "은 짝수가 아님");
		}
		
		
		
	}
}

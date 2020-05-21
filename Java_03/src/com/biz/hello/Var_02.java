package com.biz.hello;

import java.util.Random;

public class Var_02 {
	// num1 , num2 1~100할당후 사칙연산만들어서 짝수인지 Console에 보여라
	public static void main(String[] args) {
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		
		boolean bVarP = (num1 + num2) % 2 == 0;
		boolean bVarM = (num1 - num2) % 2 == 0;
		boolean bVarT = (num1 * num2) % 2 == 0;
		boolean bVarD = (num1 / num2) % 2 == 0;
		
		if (bVarP) {
			System.out.println("덧셈결과는 짝수이다");
		}
		if (!bVarP) {
			System.out.println("덧셈결과는 짝수가 아니다");
		}
		if (bVarM) {
			System.out.println("뺄셈결과는 짝수이다");
		}
		
		if (!bVarM) {
			System.out.println("뺄셈결과는 짝수가 아니다");
		}
		
		if (bVarT) {
			System.out.println("곱셈결과는 짝수이다");
		}
		if (!bVarT) {
			System.out.println("곱셈결과는 짝수가 아니다");
		}
		
		if (bVarD) {
			System.out.println("나눗셈결과는 짝수이다");
		}
		
		if (!bVarD) {
			System.out.println("나눗셈결과는 짝수가 아니다");
		}
	}

}

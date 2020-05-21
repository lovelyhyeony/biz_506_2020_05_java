package com.biz.hello;

public class VarBoolean_03 {

	public static void main(String[] args) {
		int num1 = 33;
		int num2 = 55;
		if( (num1+num2) % 2 == 0) {
			System.out.println("덧셈결과는 짝수");
		}
		
		if( (num1-num2) % 2 == 0) {
			System.out.println("뺄셈결과는 짝수");
		}
		if( (num1*num2) % 2 == 0) {
			System.out.println("곱셈결과는 짝수");
		}
		if( (num2/num1) % 2 == 0) {
			System.out.println("나눗셈셈결과는 짝수");
		}
		// 앞에서 만든 코드보다 훨씬 짧아진 코드
		// 코드를  꼭 짧게 만든게 잘만든건 아니지만 짧게만드는게 좋긴햄
		
		
	}
}

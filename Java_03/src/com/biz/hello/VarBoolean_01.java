package com.biz.hello;

public class VarBoolean_01 {
	public static void main(String[] args) {
		
		int num1 = 34;
		
		boolean bVar1 = num1 % 2 == 0;
		
		if (bVar1) {
			System.out.println(num1 + "는 짝수이다.");
		}
		if (!bVar1) {
			System.out.println(num1 + "는 짝수가 아니다.");
		}
		
		
		
	}

}

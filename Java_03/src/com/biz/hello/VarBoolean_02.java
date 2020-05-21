package com.biz.hello;

public class VarBoolean_02 {

	/*
	 * 코드 작성할 때 들여쓰기 생활화
	 */
	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 5;

		//4개의 변수에 보관되어 있는 값이 짝수 인지 판단
		// boolean bVar1 = (numP % 2) ==0; <=짝수인가를 연산해보는 코드 
		//boolean + sysout (numP) : true인지 false인지 Console에 보이는 코드
		// 선언할 수 있을 만큼 선언함 (선생님이 알려준 부분은) (굉장히 길게 만든 코드) (공책부분 확인)
		boolean bVar1 = (num1 + num2) % 2 == 0;
		if (bVar1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + " 는 짝수이다");
		}
		if (!bVar1) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + " 는 짝수가 아니다");
		}

		bVar1 = (num1 - num2) % 2 == 0;
		if (bVar1) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + " 는 짝수이다");
		}
		if (!bVar1) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + " 는 짝수가 아니다");
		}

		bVar1 = (num1 * num2) % 2 == 0;
		if (bVar1) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2) + " 는 짝수이다");
		}
		if (!bVar1) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2) + " 는 짝수가 아니다");
		}

		bVar1 = (num1 / num2) % 2 == 0;
		if (bVar1) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + " 는 짝수이다");
		}
		if (!bVar1) {
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + " 는 짝수가 아니다");
		}

		
		
		
		
		
		
		
	}

}

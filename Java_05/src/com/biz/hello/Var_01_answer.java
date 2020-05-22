package com.biz.hello;

public class Var_01_answer {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		
		System.out.println(num1 + "단 구구단");
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		
		System.out.println("=================");
		
		++num1; //임의로 변경하지않고 ++만해줘도 됌 앞뒤 순서 상관없음 num1++;(가능)
		//연속된 값을 처리할때
		num2=1;
		System.out.println(num1 + "단 구구단");
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		System.out.printf("%d x %d = %d\n",num1,num2,num1 * num2 ++);
		
		System.out.println("=================");
		
		
		
		
		
		
		
		
		
	}

}

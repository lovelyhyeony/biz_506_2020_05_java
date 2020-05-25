package com.biz.hello;

import java.util.Random;

public class Var_01 {
	
	// 1~100 까지 *임의의* 정수를 만들어 변수에 저장하고
	// 변수에 저장된 정수가 3의 배수, 또는 5의 배수인지를 검사하여 Console에 보이는 명령문

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt(100) +1;
		
			if(num % 3 == 0) {
				System.out.println("3의 배수 : "+ num);
			}
			if(num % 5 == 0) {
				System.out.println("5의 배수 : " + num);
			}
		
		
		
		
		
		
		
		
		
	}
}

package com.biz.hello;

public class Var_02answer {

	public static void main(String[] args) {
		
		//코드를 어렵게 생각말고 단순하게 생각하자
		int sum = 0 ;
		
		for(int i = 0 ; i <= 100 ; i++) {
			if (i % 3 == 0) {
				sum += i ;
			}
		}
		System.out.println("3의 배수의 합 : " +sum);
		
		
		
	}
}

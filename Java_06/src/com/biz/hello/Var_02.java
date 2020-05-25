package com.biz.hello;

public class Var_02 {

	public static void main(String[] args) {

		
		// 1~100 *까지* 숫자중 3의 배수들만의 합
		int num = 0;
		int sum = 0;

		for (num = 0, sum = 0; num <= 100; num++) {
			if (num % 3 == 0) {
				sum += num;
			}
		}
		System.out.println("3의 배수들의 합 : " + sum);

		
		
	}
}

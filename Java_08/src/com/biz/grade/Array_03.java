package com.biz.grade;

public class Array_03 {

	/*
	 * 1 ~ 100 까지 범위의 수중 짝수의 개수는 몇 개인가
	 * 1 ~ 100 까지 범위의 수중 3의 배수의 개수는 몇 개인가
	 */
	public static void main(String[] args) {

		
		int Count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				//Count += 1;
				Count++; 
			}
		}
		System.out.println("짝수의 개수 : " + Count);

	
		Count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				Count++;
			}
		}
		System.out.println("3의 배수 : " + Count);

	}
}

package com.biz.classes;

import com.biz.classes.service.CalcService;

public class ClassEx_07 {

	public static void main(String[] args) {
		CalcService calcService = new CalcService();
		
		int intKor = 90 ;
		int intEng = 80;
		
		calcService.add(intKor, intEng); // 반드시 두개의 숫자값을 괄호안에 값을 넣어줘야함 원래 만들 때 그래서
		calcService.add(30, 40);
		
	
		int sum = calcService.even(1, 100); // 1~100
		System.out.println(sum);
		sum = calcService.even(100, 1000); // 100 ~1000
		System.out.println(sum);
		sum = calcService.even(2, 55); // 2 ~ 55
		System.out.println(sum);
		
		
		sum = calcService.prime(2, 100);
		System.out.println(sum);
		
		sum = calcService.prime(100, 1000);
		System.out.println(sum);
		
		sum = calcService.prime(5, 99);
		System.out.println(sum);
		
		sum = calcService.prime(4, 1000);
		System.out.println(sum);
		
	}
}


package com.biz.exec;

import com.biz.service.MethodService;

public class Ex_03 {

	public static void main(String[] args) {
		
		int num1 = 30;   
		// mService라는 인스턴스 생성
		MethodService mService = new MethodService(); 
		
		mService.print(num1);
		mService.print(50); // 메서드를 호출하려면 반드시 인스턴스를 생성해놓고 점(.)연산자로 호출해야함
		
		
		
	}
}

package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_13 {

	public static void main(String[] args) {
	
		BankVO[] bank = new BankVO[5];
		
		bank[0] = new BankVO();
		bank[1] = new BankVO();
		bank[2] = new BankVO();
		bank[3] = new BankVO();
		bank[4] = new BankVO();
		
		for(int i = 0 ; i < bank.length ; i++) {
			bank[i].setStrNum("001");
		}
		
		bank[0].setStrDate("2020-05-01");
		bank[1].setStrDate("2020-05-02");
		bank[2].setStrDate("2020-05-03");
		bank[3].setStrDate("2020-05-04");
		bank[4].setStrDate("2020-05-05");
		
		bank[0].setIntInput(5000);
		bank[2].setIntInput(5000);
		
		bank[1].setIntOutput(1000);
		bank[3].setIntOutput(1000);
		bank[4].setIntOutput(1000);
		
		// 기본형 변수들
		// primitive variable
		int num = 0 ; // num는 인티져형 변수다 // 인티져형 넘버 변수를 선언하고 클리어했다 // Integer형 변수num을 선언하고 0으로 clear
		long num1 = 0L; // 마찬가지 // long형 변수 num1을 선언하고 0으로 clear
		float num2 = 0.0f;
		double num3 = 0.0;
		boolean bYes = false ;
		char char1 = 'c'; // chararctor형 변수 num를 선언하고 문자 c를 저장
		
		// String(문자열)형 변수는 변수처럼 사용하지만 실제로는 일반변수와 달리
		// String 클래스로 만든 String형 인스턴스라고 해야함.
		String strName = "홍길동"; 
		// String strName = new String ("홍길동"); //실제로는 이렇게 컴파일됌 현재 배운것중에 String만
		
		String strNation = new String(); //원칙은 원래 이럼 String 클래스타입의 인스턴스
		
		// BankServiceV2 클래스를 사용해서
		// bankService라는 변수를 선언
		// bankService 변수를 "객체(Object)", "인스턴스(Instance)" 라고 한다. 
		BankServiceV2 bankService = new BankServiceV2(); //BankServiceV2 클래스를 사용해서 bankService라는 인스턴스를 생성
		// bankService인스턴스를 통해서
		// bankService() method를 호출하면
		// BankServiceV2클래스 내에 정의된 bankList() method 내의 코드들이 순서대로 실행된다.
		bankService.bankList();
		
		bankService.bankList(bank);
		
	}
	
	
}

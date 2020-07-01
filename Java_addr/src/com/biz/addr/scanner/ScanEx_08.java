package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================================================");
		System.out.println("자바 메뉴 시스템");
		System.out.println("======================================================");
		System.out.println("1.학생정보 입력처리");
		System.out.println("2.성적입력 처리");
		System.out.println("3.성적정보 처리");
		System.out.println("-1.종료");
		System.out.println("------------------------------------------------------");
		System.out.println("업무선택 >> ");
		
		String strMenu = scan.nextLine();
		int intMenu = 0;
		
		// 사용자를 배려하는 가장 좋은 개발자의 자세 **try-catch문 사용!!!!!!**
		// Exception Handling
		// exception이 발생할 가능성이 1/100만 라도 있으면
		// try-catch문을 사용하여 Handling(처리)를 수행하여
		// 사용자가 어플을 사용하는데 혼란, 어려움을 겪지 않도록 해주어야 한다.
		try {
			// TODO: handle exception
			// 지금부터 이코드를 실행해봐라
			intMenu = Integer.valueOf(strMenu);
			
		} catch (Exception e) {
			//exception 이 발생하면
			System.out.println("입력한 값 : " + strMenu);// 사용자가 잘못 입력한값을 다시 보여주면서 안내메시지같이 보여주는 
			System.out.println("업무 선택은 숫자 1 ~ 3 또는 -1만 가능!!!!");
			return; // exception이 발생했으니 더이상 다음으로 코드 진행을 하지말고 종료하라.
		}		
		
		if(intMenu == 1) {
			System.out.println("학생정보 입력처리");
		} else if (intMenu == 2) {
			System.out.println("성적정보 입력");
		} else if (intMenu == 3) {
			System.out.println("성적정보 출력");
		} else if (intMenu == -1) {
			System.out.println("야 퇴근이다!!!");
		} else {
			System.out.println("선택된 업무가 없음!!");
		}
		
		
	}
}

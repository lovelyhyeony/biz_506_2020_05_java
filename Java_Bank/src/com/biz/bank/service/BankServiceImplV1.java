package com.biz.bank.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.config.Lines;
import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {

	// scanner와 list클래스를 input, output에서 사용할 것이기 때문에 필드변수로 선언
	protected List<AccountVO> accList;
	protected Scanner scan;

	// 기본 생성자 안에 list와 scan 초기화하는 코드
	public BankServiceImplV1() {

		accList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
	}

	/*
	 * BankService interface에 선언되지 않은 method로
	 * BankServiceImplV1 클래스 내부에서만
	 * 사용하기 위해 구현한 method
	 * 
	 * 단, BankServiceImplV2 클래스를 상속받게 되면
	 * 	이 method를 사용할 수 있다.
	 * 
	 * protected 접근 제한자는 이 클래스를 생성하고 사용하는 곳(main())에서는
	 * 호출하거나 접근을 할 수 없다.
	 * 다만, 이 클래스를 상속받은 클래스에서는 제한적으로 호출하여
	 * 사용할 수도 있다.
	 */
	
	// 입금과 출금을 1개의 method로 구현하기
	protected void keyInput(String inout) {

		/*
		 * 3항 연산자 inout.equals("INPUT")
		 * 조건이 true이면 입금액 문자열을 title 변수에 저장하고
		 * 아니면 출금액 문자열을 title 변수에 저장하라
		 */
		String title = inout.equals("INPUT") ? "입금액" : "출금액";
		// ↓ 아래 if() 명령문과 동일한 기능을 수행한다.
		if (inout.equals("INPUT")) {
			title = "입금액";
		} else {
			title = "출금액";
		}

		System.out.printf("%s >> ", title);

		String strInput = scan.nextLine();

		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("숫자만 가능합니다. 다시 입력해주세요 :(");
			return; // return type을 boolean으로 했기 때문에 반드시 true나 false
		}

		if (inout.equals("OUTPUT")) {
			
			// 잔액계산
			int balance = 0;
			for (AccountVO accVO : accList) {
				
				balance += accVO.getInput();
				balance -= accVO.getOutput();
			}
			
			if (balance < intInput) {
				System.out.println("잔액이 부족합니다. :(");
				return ;
			}
		}
		
		AccountVO accVO = new AccountVO();

		// java.util.Date를 사용해야한다.
		// 현재 (OS)시스템의 날짜를 가져와서 객체로 생성
		// Date type형의 객체 생성
		Date date = new Date();

		// Date 형 객체를 String형 객체로 변환 괄호안에 있는 문자열은 정해져있는 type이다
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 2020-07-08
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // 11:39:00

		String curDate = dateFormat.format(date); // date에 담긴 현재 날짜를 문자열로 변환
		String curTime = timeFormat.format(date); // date에 담긴 현재 시각을 문자열로 변환

		// 2020-07-08 11:41:00 형식으로 날짜를 세팅하겠다.
		accVO.setDate(String.format("%s %s", curDate, curTime));

		
		// inout에 값이 INPUT문자열과 같으면
		// intInput에 값은 키보드로 입력받은 입금액들
		if(inout.equals("INPUT")) {
			accVO.setInput(intInput); // intInput이 금액이라는 소리가아니라 키보드로 입력받은 값이라는 것!!
			// INPUT이 아니면!!
			// 출금액을 적었을거니까 intInput에는 출금액들이 담긴다~!
		} else {
			accVO.setOutput(intInput); // 만약 아니면 출금액이 담겨있으니까 변수명은 상관이 없는 거다.
		}
		accList.add(accVO);

	}

	@Override
	public boolean inputBalance() {
		this.keyInput("INPUT");
		return true;
	} // >>>>> inputBalance method 종료 :)

	@Override
	public boolean outputBalance() {
		keyInput("OUTPUT");
		return true;
	} // >>>>> outputBalance method 종료 :)

	@Override
	public void listBalance() {

		// 숫자를 회계방식 문자열로 표현하기 위한 클래스도구 
		// 100,000,000						↓괄호안에는 정해진 형식 숫자를 세 단위로!
		DecimalFormat df = new DecimalFormat("##,###");
		String[] listTitle = {"거래일자","입금액","출금액","잔액"}; // 문자열 배열을 만들고 리스트제목을 멋있게 만들어봄
		
		System.out.println(Lines.dLine);
		System.out.println("001 계좌 입출금 내역서");
		System.out.println(Lines.dLine);
		
		// 20개 짜리 원고지 판을 만들어서 거래일자로 채우고 나머지를 빈칸으로 채워놔라하는 것 널찍널찍하게 값 들어감
		// -가 붙으면 왼쪽 정렬
		// 아님 왼쪽 정렬
		
		// %20s : 문자열을 표현하기 위해 20개의 칸을 만들고
		//		문자열을 채운 후 나머지는 빈칸으로 남겨두어라
		// 		문자열은 20개 칸에서 오른쪽으로 정렬하라
		// %-20s : 위와 같지만 왼쪽으로 정렬하라
		System.out.printf("%-15s\t|%17s\t|%17s\t|%17s\t|\n",listTitle[0],listTitle[1],listTitle[2],listTitle[3]);
		System.out.println(Lines.sLine);

		int balance = 0; // java1.7 이상에서 요렇게 쓸 수 있음!
		String strNum = "" ;
		
		for (AccountVO accVO : accList) {

			System.out.printf("%-20s\t|",accVO.getDate());
			
			System.out.printf("%20s\t|",df.format(accVO.getInput())); // 입금
			System.out.printf("%20s\t|",df.format(accVO.getOutput())); // 출금

			balance += accVO.getInput();
			balance -= accVO.getOutput();
			System.out.printf("%20s\t|\n",df.format(balance)); // 잔액
		}
		System.out.println(Lines.dLine);
		System.out.println("출력 완료 :) 아무키나 누르세요 :)");
		scan.nextLine();

	}

}

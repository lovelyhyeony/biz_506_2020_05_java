/*
 * BankService interface
 * inputBalance() : 입금처리
 * outputBalance() : 출금처리
 * listBalance () : 입출금 내역 출력
 */
package com.biz.bank.service;

/*
 * 은행의 내 계좌에 입출금을 처리를 할텐데
 * 초기의 내 계좌 잔액 100000으로 설정하고
 * inputBalance()를 호출하여 입금처리를 수행하고
 * outputBalance()를 호출하여 출금처리를 수행하고
 * 	출금을 할 때는 내 계좌의 잔액보다 큰 금액을 출금하려하면
 * 	출금이 안되도록 하고, 잔액보다 작은 금액을 출금하면
 * 	출금이 이루어지도록
 * listBalance()를 호출하여 현재까지의 입출금 내역과 잔액을 표시
 */
public interface BankService {
	
	// return type을 뭘 해야할지 모르겠다 할 때는 우선 void로 설정을 해놓고 생각!!
	
	// 입금 처리 
	public boolean inputBalance();
	
	// 출금 처리
	public boolean outputBalance();
	
	// 입출금 내역 출력
	public void listBalance();

}

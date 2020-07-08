/*
 * 객체 추상화
 * 다음과 같은 AccountVO 생성
 * 계좌번호 : num, "001-0001"
 * 거래일자 : date, "2020-07-0"
 * 입금액 : input, 15000
 * 출금액 : output, 14000
 * 
 * 각 필드의 type을 무엇으로해야할 지 고민
 * 변수는 private으로 설정
 * getter, setter method설정
 */
package com.biz.bank.domain;

/*
 * 은행업무 중에서 
 * 현금의 입출금과 관련된 업무를 "계정계(Acc)" 업무라고 한다.
 * ACC : 일반업무에서 회계와 관련된 약어로 많이 사용
 * 
 * 정보계 : 고객 정보를 기준으로 자산관리 업무
 * 여수신계 : 대출과 관련된 업무
 */
public class AccountVO {

	private String num;
	private String date;
	private int input;
	private int output;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	
}

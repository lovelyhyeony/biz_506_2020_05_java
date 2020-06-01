package com.biz.classes.model;
/*
 * 필드변수를 갖는 클래스 작성
 * private 으로, getter,setter 생성
 */

public class BankVO {

	private String strNum;
	private String strDate;
	
	private int intInput ;
	private int intOutput;
	private int intValance;
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public int getIntInput() {
		return intInput;
	}
	public void setIntInput(int intInput) {
		this.intInput = intInput;
	}
	public int getIntOutput() {
		return intOutput;
	}
	public void setIntOutput(int intOutput) {
		this.intOutput = intOutput;
	}
	public int getIntValance() {
		return intValance;
	}
	public void setIntValance(int intValance) {
		this.intValance = intValance;
	}
	
	
	
	
	
	
}

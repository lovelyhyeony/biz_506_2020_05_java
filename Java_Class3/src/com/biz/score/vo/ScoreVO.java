package com.biz.score.vo;

// 1.다음의 필드변수 선언
// 학번(문자열), 국어,영어,수학,음악점수(정수),총점,평균(정수)
// 2. 필드변수는 private으로 getter, setter 구현

public class ScoreVO {

	private String strNum;
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	
	private int intSum;
	private int intAvg;
	
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntMusic() {
		return intMusic;
	}
	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	
	
	
}

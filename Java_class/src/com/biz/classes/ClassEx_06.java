package com.biz.classes;

import com.biz.classes.model.scoreVO;

public class ClassEx_06 {

	public static void main(String[] args) {
		
		// Score클래스를 사용하여 score1,score2,score3 인스턴스 생성
		scoreVO score1 = new scoreVO();
		scoreVO score2 = new scoreVO();
		scoreVO score3 = new scoreVO();
		
		score1.setNum("01");
		score2.setNum("02");
		score3.setNum("03");
		
		score2.setName("이몽룡");
		score1.setName("홍길동");
		score3.setName("성춘향");
		
		score1.setIntKor(90);
		score2.setIntKor(88);
		score3.setIntKor(77);
		
		
		
		
		
		
	}
}

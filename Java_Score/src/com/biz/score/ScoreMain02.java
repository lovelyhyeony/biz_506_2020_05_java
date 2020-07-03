package com.biz.score;

import com.biz.score.service.ScoreService02;

public class ScoreMain02 {

	public static void main(String[] args) {

		// domain에 있는 ScoreService01에 있는 method들을 쓰겠다 해서 객체 생성을 해주면서
		ScoreService02 scoreService = new ScoreService02();
		
		// 무한반복문
		while(true) {
			// 스코어서비스에 인풋 메서드 호출해서 false값이 나오면 멈추라는
			if(!scoreService.inputScore()) {
				break;
			}
		}
		System.out.println("입력 완료");
		scoreService.scoreList(); // scoreService에 있는 scoreList() method호출해서 입력받은 data를 리스트로 console에 보여주는
	}
}

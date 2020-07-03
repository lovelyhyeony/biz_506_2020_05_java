package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV2;

public class ScoreEx_03 {
	public static void main(String[] args) {

		// 인터페이스를 이용해서 선언했기 때문에 뒤에있는 숫자만 바꿔줘도 실행되는 메서드가 달라짐!!
		ScoreService sService = new ScoreServiceImplV2() ;
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}
}

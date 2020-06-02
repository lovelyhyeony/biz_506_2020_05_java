package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV2 {

	// 필드변수를 선언해주므로써 메소드도 같이
	
	// ScoreServiceV2 클래스의 필드변수 선언
	// ScoreVO 클래스의 인스턴스 배열을 필드변수로 선언
	private ScoreVO[] scoreList;

	// scoreList 필드변수의 setter method()
	public void setScoreList(ScoreVO[] scoreList) {
		this.scoreList = scoreList;

	}

	public void scoreSum() {
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i].setSum( scoreList[i].getKor() + scoreList[i].getEng() + scoreList[i].getMath() );
			scoreList[i].setAvg( scoreList[i].getSum() / 3 );
		}
	}

	// score변수를 매개변수로 받지않고 사용하는 방법
	public void scoreList() {

		for (int i = 0; i < scoreList.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scoreList[i].getName(), 
					scoreList[i].getKor(),
					scoreList[i].getEng(), 
					scoreList[i].getMath(), 
					scoreList[i].getSum(), 
					scoreList[i].getAvg());
		}
	}
}

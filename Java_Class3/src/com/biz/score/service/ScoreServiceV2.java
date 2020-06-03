package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV2 {

	/*
	 * scores 인스턴스 배열을 필드변수로 선언한 이유
	 * Ex클래스에서 Service클래스에게
	 * 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할 때마다 scores 인스턴스 배열을 매개변수로
	 * 전달 할 수 있지만
	 * 한번만 변수로 전달해서 Service클래스가 scores인스턴스를
	 * 보관하도록 하고, 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함.
	 * 
	 * Ex클래스에서 요청들을 할 때마다 scores 인스턴스 배열을 매개변수로
	 * 전달을 하면 요청과 요청사이에서 다른 코드에 의해 scores 배열값이 
	 * 변형되어 결과가 엉뚱하게 나타나는 것을 방지하는 목적도 있다.
	 */
	// ScoreVO배열 scores필드변수 선언 이거 하나를 가지고 메서드에 공유하자는이야기
	private ScoreVO[] scores; // 선언만 해놓은거임 scores라는 필드변수에 
	




	// scoreSum 에다가 매개변수 넣어주고 this코드 넣어줌
	public void scoreSum(ScoreVO[] scores) {

		this.scores = scores;
		
		for (int i = 0; i < scores.length; i++) {
			int sum = this.scores[i].getIntKor();
			sum += this.scores[i].getIntEng();
			sum += this.scores[i].getIntMath();
			sum += this.scores[i].getIntMusic();

			this.scores[i].setIntSum(sum); 
		}

	}

	// scoreAvg 이라는 메서드 생성
	public void scoreAvg() {
		for (int i = 0 ; i < scores.length; i++) {
			int sum = this.scores[i].getIntSum();
			this.scores[i].setIntAvg(sum/4);
		}

	}

	// scoreList라는 메서드 생성
	public void scoreList() {
		
		LineService line = new LineService();
		String d_line = line.do_line(50);
		String s_line = line.single(50);
		
		System.out.println(d_line);
		System.out.println("성적리스트");
		System.out.println(d_line);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(s_line);
		
		// 점수 리스트를 표시할 때는 for 반복문을 이용해서 사용한다.
		// this. 현재 이 클래스에 선언된 이라는 뜻
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getStrNum(), //String 형
					scores[i].getIntKor(), // int 
					scores[i].getIntEng(), // int 
					scores[i].getIntMath(), // int 
					scores[i].getIntMusic(), // int 
					scores[i].getIntSum(), // int 
					scores[i].getIntAvg() // int 
					);
			
			
		}
		
		System.out.println(s_line);
		 
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumSum = 0 ;
		int avgSum = 0 ; 
		
		// 각 과목의 총점
		for(int i = 0 ; i < scores.length ; i++) {
			 sumKor += scores[i].getIntKor();
			 sumEng += scores[i].getIntEng();
			 sumMath += scores[i].getIntMath();
			 sumMusic += scores[i].getIntMusic();
			
			 sumSum += scores[i].getIntSum(); // 총점의 총점
			 avgSum += scores[i].getIntAvg(); // 평균의 총점
			 
		}
		
		int avgKor = sumKor / scores.length;
		int avgEng = sumEng / scores.length ;
		int avgMath = sumMath / scores.length;
		int avgMusic = sumMusic / scores.length ;
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","총점",
				sumKor,sumEng,sumMath,sumMusic,sumSum,0);
		System.out.println(d_line);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","평균",
				avgKor,avgEng,avgMath,avgMusic,0,avgSum/scores.length);
		System.out.println(d_line);
	}

}

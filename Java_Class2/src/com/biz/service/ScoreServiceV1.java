package com.biz.service;

import com.biz.model.ScoreVO;
// 이름점수들총점 평균 내보기
public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] scoreList) {
		
		LineService line = new LineService();
		int LineLength = 50;
		
		String d_line = line.do_line(LineLength);
		String s_line = line.single(LineLength);
		
		System.out.println(d_line);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(s_line);
		
		
		/*
		int[] sum = new int[scoreList.length] ;
		
		for (int i = 0 ; i < scoreList.length ; i++ ) {
			sum[i] = scoreList[i].getKor();
			sum[i] += scoreList[i].getEng();
			sum[i] += scoreList[i].getMath();
		} // 위험한 코드 <<이게 하고싶으면 ScoreVO에다가 필드 만들어놓고 저장해서 쓰는게 좋다
		*/
		
		
		// for() { } 내에서 선언된 sum, avg 변수는
		// for() { } 명령문이 종료되면 이후에 참조할 수 없다.
		for(int i = 0 ; i < scoreList.length ; i++) {
			int sum = scoreList[i].getKor();
			sum += scoreList[i].getEng();
			sum += scoreList[i].getMath();
			
			int avg = sum / 3;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scoreList[i].getName(),
					scoreList[i].getKor(),
					scoreList[i].getEng(),
					scoreList[i].getMath(),
					sum,avg
					);
		}
		
		System.out.println(d_line);
		
		
		
	}
}

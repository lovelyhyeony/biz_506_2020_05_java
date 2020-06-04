package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreEx_01 {

	/*
	 * 클래스를 리스트에 추가하기
	 * 리스트에 클래스 읽기
	 */
	public static void main(String[] args) {
		
		// 1. size() 0인 리스트를 생성
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// 2. 클래스를 인스턴스로 생성 // 최초에는 인스턴스로 선언과 생성을 해줘야함
		ScoreVO scoreVO = new ScoreVO();
		
		// 3. 인스턴스의 필드변수에 값을 Setting
		scoreVO.setNum("001");
		scoreVO.setKor(80);
		scoreVO.setEng(70);
		scoreVO.setMath(88);
		
		// 4. 리스트에 추가
		scoreList.add(scoreVO); 		
		//size() 1인 리스트에 값이 저장된 인스턴스가 추가
		
		// 새로운 인스턴스를 추가할 때
		// 5. 선언되어있는 인스턴스를 반드시 다시 초기 //그렇지않으면 값을 채우는데 의미가 없어짐 
		scoreVO = new ScoreVO(); // 초기화
		scoreVO.setNum("002");
		scoreVO.setKor(99);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		scoreList.add(scoreVO); // .add
		
		scoreVO = new ScoreVO(); // 초기화
		scoreVO.setNum("003");
		scoreVO.setKor(98);
		scoreVO.setEng(100);
		scoreVO.setMath(75); // 여기까지 클래스에 값추가하는 부분
		scoreList.add(scoreVO); // 리스트에 scoreVO저장 2번에 저장됨 size는 3개 //마지막에 .add
		
		// 값을 읽을 때
		// 1. 리스트에 위치를 지정하여 get(index) method로
		//		인스턴스를 추출하여 다른 인스턴스에 저장
		ScoreVO getScore = scoreList.get(0);
		
		// 2. 인스턴스로 부터 각 필드 변수 값을 읽기
		String num = getScore.getNum();
		int kor = getScore.getKor();
		int eng = getScore.getEng();
		int math = getScore.getMath();

		// 전체 리스트를 추출하기
		int scoreSize = scoreList.size();
		for(int i = 0 ; i < scoreSize ; i++) {
			
			getScore = scoreList.get(i);
			System.out.print(getScore.getNum() + "\t");
			System.out.print(getScore.getKor() + "\t");
			System.out.print(getScore.getEng() + "\t");
			System.out.println( getScore.getMath() );
		}
		
		
		
		
		
	}
	
}

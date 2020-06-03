package com.biz.score.exec;

/*
 * ScoreVO를 사용하여 성적을 보관할 scores배열 10개 생성
 * 1번부터 순서대로 학번 부여
 * 학생의 각 과목 점수를 Random클래스를 사용하여 51~100까지 중 임의의 점수로 생성하여 저장
 */
import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;
//테스트하기위한 ex공간엔 메인메서드가 있어야함
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		// 클래스 ScoreVO
		ScoreVO[] scores = new ScoreVO[10];
		
		for(int i = 0 ; i < scores.length ; i++) { //scres.leng = 변수-1까지
			scores[i] = new ScoreVO(); //초기화 생성코드
		}
		
		for(int i = 0 ; i < scores.length ; i++) { // 일련번호 만들기
			scores[i].setStrNum(""+(i+1));
		}
		
		Random rnd = new Random(); 
		
		// 51~100까지 임의의 점수 지정하기
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i].setIntKor(rnd.nextInt(50)+51);
			scores[i].setIntEng(rnd.nextInt(50)+51);
			scores[i].setIntMath(rnd.nextInt(50)+51);
			scores[i].setIntMusic(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV1 sService = new ScoreServiceV1();
		
		/*
		 * ScoreServiceV1에 선언되어 있는 ScoreVO[] scores는
		 * 아직 선언만 되고 초기화 등이 전혀 이루어지지 않은 상태
		 * 때문에 scores 인스턴스 배열이 초기화 되거나 값이 저장되지 않으면 
		 * 이후에 호출되는 method에서 NullPointerException이 발생하고 // Null이 났다 하면 내가 코드 빼먹은거임
		 * 코드가 진행되지 않는다.
		 */
		sService.setScoreList(scores);
		sService.scoreSum();
		sService.scoreAvg();
		sService.scoreList();
		
		/*
		 * ScoreServiceV1에서는 scores 배열을 주입하는 method
		 * setScore()라고 별도로 작성해두었는데
		 * 사용하기 위해 작성을 하는 과정에서
		 * setScore()를 먼저 호출해서 scores를 전달해야하는 것을
		 * 자주 잊게 되더라
		 * 그리하여 NullPointerException이 발생하는 경우가 많더라
		 * 
		 * 그래서 ScoreSerivceV2에서는 성적처리를 하는 과정에서 
		 * 반드시 호출할 수 밖에 없는 메서드들 중에
		 * 호출되는 순서로 봤을 때 항상 제일 먼저 호출할 것으로 생각되는
		 * scoreSum() method에 매개변수를 전달하는 역할을 수행하도록 코드를 변경했다.
		 */
		
		ScoreServiceV2 sService2 = new ScoreServiceV2();
		sService2.scoreSum(scores);  // setScoreList랑 scoreSum을 합친거임 set을 자꾸 까먹으니까
		sService2.scoreAvg(); 
		sService2.scoreList();
		
		
		
	}
}

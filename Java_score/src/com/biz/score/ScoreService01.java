package com.biz.score;
/*
 * ScoreVO 생성
 * 학번, 국어, 영어, 수학, 총점, 평균
 * ScoreService01생성
 * List<ScoreVO> scoreList 필드변수 정의
 * inputScore() method 정의
 * 키보드를 통해 
 * 학번, 국어, 영어, 수학점수 입력받아 ScoreList 변수에 저장
 * scoreList() method 정의
 * 성적리스트 출력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreService01 {

	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public boolean inputScore() {
		System.out.print("학번(중단:END) >> ");
		String strNum = scan.nextLine();
		
		System.out.println("입력값 : " + strNum);
		
		if (strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		
		System.out.print("총점 >> ");
		String strSum = scan.nextLine();
		
		System.out.print("평균 >> ");
		String strAvg = scan.nextLine();
		
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("국어는 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}

		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("영어는 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("수학은 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		int intSum = 0;
		try {
			intSum = Integer.valueOf(strSum);
		} catch (Exception e) {
			System.out.println("총점은 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		int intAvg = 0;
		try {
			intAvg = Integer.valueOf(strAvg);
		} catch (Exception e) {
			System.out.println("평균은 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		ScoreVO sVO = new ScoreVO();
		sVO.setStrNum(strNum);
		sVO.setIntKor(intKor);
		sVO.setIntEng(intEng);
		sVO.setIntMath(intMath);
		sVO.setIntSum(intSum);
		sVO.setIntAvg(intAvg);
		scoreList.add(sVO);
		
		return true;
	}
	
	public void scoreList() {
		
		ScoreVO sVO = new ScoreVO();
		
		System.out.println("=========================================");
		System.out.println("성적리스트");
		System.out.println("-----------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		int scoreSize = scoreList.size();
		
		for(int i = 0 ; i < scoreSize ; i++) {
			
			ScoreVO svo = scoreList.get(i);
			
			System.out.print(svo.getStrNum() + "\t");
			System.out.print(svo.getIntKor() + "\t");
			System.out.print(svo.getIntEng() + "\t");
			System.out.print(svo.getIntMath() + "\t");
			System.out.print(svo.getIntSum() + "\t");
			System.out.print(svo.getIntAvg() + "\t");
		}
		
		System.out.println("=========================================");
		
	}
	
	
}

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

	ScoreVO sVO = new ScoreVO();
	// 필드변수 정의
	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 키보드를 통해 학번, 국어, 영어, 수학 점수 입력받아 scoreList 변수에 저장하는 method
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
		
		// 위에서 문자열로 데이터 입력 받았기 때문에
		// int형으로 변환 시켜준다.
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
		
		// 총점과 평균 계산 부분
		int sum = sVO.getIntKor();
		sum += sVO.getIntEng();
		sum += sVO.getIntMath();
		
		float avg = (float)sum / 3;
		
		// 입력받은 값 리스트에 추가하는 부분
		sVO.setStrNum(strNum);
		sVO.setIntKor(intKor);
		sVO.setIntEng(intEng);
		sVO.setIntMath(intMath);
		sVO.setIntSum(sum);
		sVO.setFloatAvg(avg);

		scoreList.add(sVO);
		
		return true;
	}
	
	// 성적 리스트 출력하는 method
	public void scoreList() {
		
		
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
			System.out.print(svo.getFloatAvg() + "\n");

		}
		
		System.out.println("=========================================");
		
	}
	
	// com.biz.score >> ScoreService01 에있는 method들을 실행 해보는 
	// main method 해봄

	/*
	 * 	public static void main(String[] args) {
		
		ScoreService01 sS = new ScoreService01();
		
		while(true) {
			if(!sS.inputScore()) {
				break;
			}
		}
		System.out.println("입력 종료");
		sS.scoreList();
	}
	 */
	
}

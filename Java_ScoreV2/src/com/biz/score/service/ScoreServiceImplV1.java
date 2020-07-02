package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService*** 클래스를 정의할 때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된
 * method를 모두 implement해서 작성되어야 하는 규칙이 작동 하게 된다.
 * 따라서 모든 method의 이름이 통일되는 효과를 얻게 된다.
 * 
 * interface(ScoreService)를 implements하여 작성된 클래스는
 * interface에 정의된 method의 규칙을 그대로 준수하여 작성해야할 의무가 있는 클래스다.
 * 모양은 interface의 모양을 그대로 가지고 있으며
 * 하는일은 실제 클래스의 method에 구현되어 있다.
 */
public class ScoreServiceImplV1 implements ScoreService {

	// private 되어있던 필드변수를 protected로 변경
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean inputScore() {
		// TODO Auto-generated method stub
		
		ScoreVO sVO = new ScoreVO();
		
		System.out.print("학번(입력종료 : END) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		int intKor = 0 ; 
		try {
			intKor = Integer.valueOf(strKor);
		} catch(Exception e) {
			System.out.println("국어 점수는 숫자만 입력가능합니다.");
			System.out.println("국어 점수 0으로 입시저장합니다.");
		}
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();

		int intEng = 0 ; 
		try {
			intEng = Integer.valueOf(strEng);
		} catch(Exception e) {
			System.out.println("영어 점수는 숫자만 입력가능합니다.");
			System.out.println("영어 점수 0으로 입시저장합니다.");
		}
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		
		int intMath = 0 ; 
		try {
			intMath = Integer.valueOf(strMath);
		} catch(Exception e) {
			System.out.println("수학 점수는 숫자만 입력가능합니다.");
			System.out.println("수학 점수 0으로 입시저장합니다.");
		}
		
		sVO.setNum(strNum);
		sVO.setKor(intKor);
		sVO.setEng(intEng);
		sVO.setMath(intMath);
		
		scoreList.add(sVO);
		
		return true;
	} // >>>>>>>>>> inPutScore() method 종료 :) <<<<<<<<<<

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		
		int size = scoreList.size();
		for (int i = 0 ; i < size ; i++) {
			
			// 리스트에 저장된 값 추출하기
			ScoreVO sVO = scoreList.get(i);
			
			int intSum = sVO.getKor();
			intSum += sVO.getEng();
			intSum += sVO.getMath();
			
			/*
			 * sVO.setSum() method에 총점을 전달하므로써
			 * scoreList에 저장된 어떤 요소의 총점 변수에 값을 저장하는 효과를 낸다.
			 * 별도로 저장을 해주거나 하는 절차가 필요없다.
			 */
			sVO.setSum(intSum);
			// add를 안해준 이유는 sVO가 i를 가르키는 주소임!
			// get을 가지고와서 sVO에 저장해주고 sVO.set만 해주면 자동으로 intSum이 추가가 되더라
			
		}
	} // >>>>>>>>>> calcSum() method 종료 :) <<<<<<<<<<

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub

		int size = scoreList.size();
		for(int i = 0 ; i < size ; i++) {
			
			ScoreVO sVO = scoreList.get(i);
			
			float floatAvg = (float)sVO.getSum() / 3;
			sVO.setAvg(floatAvg);
			
		}
	} // >>>>>>>>>> calcSum() method 종료 :) <<<<<<<<<<

	@Override
	public void scoreList() {
		// TODO Auto-generated method stub
		System.out.println("==========================================");
		System.out.println("성적일람표");
		System.out.println("==========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------");
		
		int size = scoreList.size(); 
		for(int i = 0 ; i < size ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getSum() + "\t");
			System.out.print(vo.getAvg() + "\n");
			
		}
		System.out.println("==========================================");
	} // >>>>>>>>>> scoreList() method 종료 :) <<<<<<<<<<

}

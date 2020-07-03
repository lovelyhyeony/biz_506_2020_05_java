package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * 성적을 입력받아서 scoreList에 저장하고 
 * 성적리스트를 출력
 */
public class ScoreService02 {
	
	// 성적 리스트를 저장하기 위한 객체 생성
	List<ScoreVO> scoreList;
	
	// 키보드를 사용해서 값들을 입력받기 위한 객체 생성
	Scanner scan ;
	
	// scoreList, scan 객체를 선언했는데 사용할 수 있도록
	// 생성자에서 두 객체를 초기화 한다.
	// 이 과정을 생략하면 NullPointerException이 발생하기 쉽다.
	public ScoreService02() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을
	// 입력하게 되면 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		
		ScoreVO scoreVO = new ScoreVO(); // >> 
		
		System.out.print("학번(END:입력종료) >> ");
		String strNum = scan.nextLine();
		// 만약 END값을 넣으면 false값이 반한되기때문에
		// main클래스에 있는 while의 if조건문이 true를 타게 되면서
		// 바로 밑에있는 break명령문을 만나고 반복문을 빠져나가게 된다.
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		int intKor = 0;
		try {
			// 문자열로 받았기 때문에 문자열을 숫자로 바꿔주는 
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("국어는 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		// >> intKor는 0인 상태로 유지가 된다.
		
		// 만약 intKor에 저장된 점수가 false로반환이 된다면
		// Console창에 아래의 코드들이 출력된다.
		if(!scoreVO.setKor(intKor)) {
			System.out.println("국어 점수는 0 ~ 100 까지만 가능");
			System.out.println("국어 점수는 임시로 0으로 저장합니다.");
		}

		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		int intEng = 0;
		try {
			// 문자열로 받았기 때문에 문자열을 숫자로 바꿔주는 
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("영어는 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		// >> intEng는 0인 상태로 유지가 된다.
		
		System.out.print("수학 >> ");
		String strMath = scan.nextLine();
		
		int intMath = 0;
		try {
			// 문자열로 받았기 때문에 문자열을 숫자로 바꿔주는 
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("수학은 숫자만 가능합니다.");
			System.out.println("입력이 잘못되어 0으로 임시 저장합니다.");
		}
		// >> intMath는 0인 상태로 유지가 된다.
		
		// 키보드에 입력받은 점수를 int형으로 변환하여
		// 변수에 담겨서 온 상태
		// int형으로 변환된 점수를 ScoreVO에 일단 담기
		scoreVO.setNum(strNum);
		
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		
		// 총점계산 코드
		int sum = scoreVO.getKor();
		sum += scoreVO.getEng();
		sum += scoreVO.getMath();
		
		// 평균 계산을 float형으로 소수점까지 계산하기 위해서
		// 먼저 sum(총점)을 float형으로 변환하고
		// 나눗셈을 수행해서 결과를 도출한다.
		float avg = (float)sum / 3;
		
		scoreVO.setSum(sum);
		scoreVO.setAvg(avg);
		
		// >>>> 한 학생의 성적 입력받아 vo에 담기 완료
		
		// 한 학생의 성적을 List에 추가
		scoreList.add(scoreVO);
		
		return true; // boolean형이기 때문에 똑같은 type 반환
		
	} // >>>>>>> inputScore END :) <<<<<<<

	public void scoreList() {
		
		System.out.println("=======================================================");
		System.out.println("성적 일람표");
		System.out.println("=======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		
		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int size = scoreList.size();
		for( int i = 0 ; i < size ; i++) {
			// list에서 scoreVO 추출해야하기 때문에 sVO인스턴스 생성.
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.println(sVO.getAvg());
		}
		System.out.println("=======================================================");
	} // >>>>>>> scoreList END :) <<<<<<<
	
}

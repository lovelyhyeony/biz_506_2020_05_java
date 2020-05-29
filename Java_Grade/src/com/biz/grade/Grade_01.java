package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명 과목 5과목의 성적처리
 */
public class Grade_01 {
	public static void main(String[] args) {

		int stdCount = 20; // 값이 변동될 경우를 대비해서 []안에 숫자나 변수를 넣어줌

		// stdCount 만큼의 배열을 생성
		// 과목 수만큼 생성
		int[] intKor = new int[stdCount];
		int[] intEng = new int[stdCount];
		int[] intMath = new int[stdCount];
		int[] intMusic = new int[stdCount];
		int[] intPaint = new int[stdCount];

		// 임의의 점수를 만들기 위한 도구 생성
		Random rnd = new Random();

		// 학생들의 점수를 임의로 생성하여 배열에 저장하는 부분
		for (int i = 0; i < stdCount; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intMusic[i] = rnd.nextInt(50) + 51;
			intPaint[i] = rnd.nextInt(50) + 51;

		}

		// 학생별 총점과 평균 계산
		
		// 학생별 총점, 평균을 계산하여 저장할 배열 추가 생성
		int[] intStSum = new int[ stdCount ];
		int[] intStAvg = new int[ stdCount ];

		// 각학생의 총점, 평균을 계산하여 intStSum, intStAvg 에 저장
		for (int i = 0; i < stdCount; i++) {
			intStSum[i] = intKor[i];
			intStSum[i] += intEng[i];
			intStSum[i] += intMath[i];
			intStSum[i] += intMusic[i];
			intStSum[i] += intPaint[i];
			
			intStAvg[i] = intStSum[i] / 5;

		}

		// 과목별 총점, 평균 계산하기 위해 변수 선언
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		int intPaintSum = 0;

		// 20명 학생의 과목별 총점을 계산
		for (int i = 0; i < stdCount; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			intMusicSum += intMusic[i];
			intPaintSum += intPaint[i];
		}

		System.out.println("================================================================================");
		System.out.println("학생 성적 일람표");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("학번\t\t국어\t\t영어\t\t수학\t\t음악\t\t미술\t\t총점\t\t평균");
		System.out.println("--------------------------------------------------------------------------------");

		
		for (int i = 0; i < stdCount; i++) {
			System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", (i + 1), intKor[i], intEng[i], intMath[i], intMusic[i], intPaint[i], intStSum[i], intStAvg[i]);
		}

		System.out.println("--------------------------------------------------------------------------------");

		// printf 에서 formt 기호
		// %d : (Decimal)정수, 십진수 등을 표현하는 기호
		// %s : (String)문자열을 표현하는 기호
		// %c : (Character)문자 를 표현하는 기호
		// \t : tab(8칸) 만큼 빈칸을 만들어라
		// \n : Enter를 누른것처럼 줄바꿈을 하여라
		
		System.out.printf("\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", intKorSum, intEngSum, intMathSum, intMusicSum, intPaintSum);
		System.out.printf("\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", intKorSum / 20, intEngSum / 20, intMathSum / 20, intMusicSum / 20, intPaintSum / 20);

		System.out.println("================================================================================");
	}

}

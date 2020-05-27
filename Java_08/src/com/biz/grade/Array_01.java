package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		/*
		 * 1. 20명 학생의 국어, 영어, 수학, 음악점수를 저장하기 위한 배열선언 2. 각 배열에 51~100 점의 점수를 생성하여 저장 3. 각
		 * 학생의 점수 총점, 평균을 계산하고 4. 과목별 점수 총점, 평균을 계산하여 5. 성적리스트를 Console에 표시하시오
		 */

		
		int[] intKor = new int[20];
		int[] intEng = new int[20];
		int[] intMath = new int[20];
		int[] intMusic = new int[20];

		Random rnd = new Random();
		
		int i = 0;
		for (i = 0; i < 20; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
			intMusic[i] = rnd.nextInt(50) + 51; // 테이블 표
		}

		// 과목별로 총점을 계산하여 보관할 변수를 선언
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;

		System.out.println("==================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("----------------------------------");
		// 각 학생 총점과 평균
		for (i = 0; i < 20; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			intMusicSum += intMusic[i];

			int intAvg = (intKorSum + intEngSum + intMathSum + intMusicSum) / 4;

			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", i + 1, intKor[i], intEng[i], intMath[i], intMusic[i],
					(intKor[i] + intEng[i] + intMath[i] + intMusic[i]), intAvg);

		}

		// 과목별 총점과 평균

		System.out.println("=========================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n", intKorSum, intEngSum, intMathSum, intMusicSum);
		System.out.println("=========================");
		System.out.printf("평균\t%d\t%d\t%d\t%d\n", intKorSum / 20, intEngSum / 20, intMathSum / 20, intMusicSum / 20);

	}
}

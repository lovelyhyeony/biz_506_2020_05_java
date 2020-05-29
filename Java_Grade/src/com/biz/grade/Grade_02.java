package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명 5과목 성적처리
 * 학생수나 과목수가 변경될 경우의 코드들
 */
public class Grade_02 {

	public static void main(String[] args) {
		
		int stdCount = 20 ; // 학생 인원수
		int subCount = 5 + 2 ; // 과목 5개가 총점, 평균을 저장할 배열
		
		
		
		/*
		 * 
		 * 이 코드는 배열을 정해진 개수만큼 선언하고
		String[] subTitle = new String[SubCount];
		
		정해진 개수만큼 값을 채워넣는 방식
		subTitle[1] = "국어";
		subTitle[2] = "영어";
		subTitle[3] = "수학";
		subTitle[4] = "음악";
		subTitle[5] = "미술";
		*/
		
		/*
		 * 배열을 선언할 때 보관할 값의 개수가 얼마인지 확실치 않을 때
		 * 배열을 빈(blank) 크기 만큼만 선언하고
		 * {}; 를 사용하여, 값을 미리 저장하는 방법
		 * 이 방법을 사용하면, 배열의 개수가 변동 될 때
		 * 배열의 저장되는 값을 추가, 삭제하므로써 자동으로 배열이 생성된다.
		 * 
		 *  배열을 선언할 때 값으로 크기를 지정하는 방법
		 */
		String[] subTitle = new String[] {
				"학번","국어","영어","수학","음악","미술","총점","평균"
		};
		
		// score 배열을 stdCount만큼 만들어줌
		// int[][] score : score 배열을 가로세로방향으로 선언하겠다
		//				2차원 배열, Table Array
		// 20 x 5 개의 공간을 갖는 2차원 배열로 선언
		int[][] score = new int[ stdCount ][ subCount ];
		
		//score[0] = new int[subCount];
		//score[1] = new int[subCount];
		//score[3] = new int[subCount]; // 표형식의 배열 , 2차원 배열
		
		// 세로방향으로 5번 위치, 가로로 2번 위치에 값 90을 저장하라
		score[5][2] = 90;
		
		Random rnd = new Random();
		
		// i = index를 줄여서 임시로 사용하기 위한 변수명
		for(int i = 0 ; i < stdCount ; i++) { //세로방향이라 봄
			
			for(int j = 0 ; j < subCount ; j++ ) { //가로방향이라 봄 보통
				
				// 0,0 ~ 0,4
				// 1,0 ~ 1,4
				// 19,0 ~ 19,4 까지 반복되는 코드가 만들어질거임
				score[i][j] = rnd.nextInt(50) + 51;
			}
		}
	
		
		System.out.println("====================================");
		System.out.println("성적 일람표");
		System.out.println("------------------------------------");
		
		
		
		
		
		/*
		 * 배열.length : 배열의 개수가 몇개인지 알려주는 
		 * 		키워드 변수, 필드 변수, 멤버 변수
		 * 		배열의 개수가 궁금할 때 일일이 세어보지 않아도 알 수 있게 해주는 
		 * 		키워드 변수 이다.
		 */
		for(int i = 0 ; i < subTitle.length ; i ++ ) {
			System.out.printf("%s\t", subTitle[i]);
		} // 제목 부분 //엔터를 안해주고 빈칸만 해줫으니까 넘어가지않고 가로로 출력됌
		
		System.out.println("\n----------------------------------");
		
		for (int i = 0 ; i < stdCount ; i++) {
			System.out.printf("%d\t",i+1);
			
			for (int j = 0 ; j < subCount ; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}

package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.ScoreVO;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		// 메인에서는 바로 이렇게 초기화 해줘야함
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// socre.txt파일을 읽어서 무언갈 할텐데 그 파일을 경로와 함께 변수에 저장한것임
		String scoreFile = "src/com/biz/student/exec/score.txt";

		// File과 관련된 클래스는 객체로 선언하는 코드와
		// 객체를 초기화(생성)하는 코드를 분리한다.
		// 선언할 때는 null 값으로 clear만 수행하고 다음으로 진행한다.
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
		
			// 파일을 읽기위해 open하는 것 : 파일 열기와 같음
			fileReader = new FileReader(scoreFile);
			// open된 파일에 대한 정보가 담긴 fileReader객체를 
			// buffer에게 연결하여 파일을 읽도록 지시한 것.
			buffer = new BufferedReader(fileReader);
			
			// 파일을 읽기전에 파일 한줄의 문자열을 읽어 담을
			// 문자열 변수를 선언한다.
			// 파일을 읽어서 처리할 문자열은
			// 반복문 밖에서 선언하고 초기화 한 후 사용한다.
			String reader = "";
			while(true) {
				reader = buffer.readLine(); // buffer로부터 한줄씩 읽기
				if (reader == null) { // 파일 끝에 도달했으면 
					break; // 파일 읽기를 그만 멈추어라
				}
				
				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[0]);
				sVO.setKor(Integer.valueOf(scores[1]));
				sVO.setEng(Integer.valueOf(scores[2])); // 메서드에 메서드를
				sVO.setMath(Integer.valueOf(scores[3])); // 이렇게 변수를 만들지 않고 메서드 내에서 변환을 시켜줌 실무에서도 많이 사용!
				scoreList.add(sVO);
			}
			// while문이 끝나면 반드시 연 순서대로 닫아 준다!!
			buffer.close();
			fileReader.close();
			// >>>>> try method <<<<<
			
			// 파일이 없을때 익셉션 발생하는거
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(scoreFile + "파일을 읽기 위해 open하는 중 오류 발생 :(");
			return;
			
		} catch(NumberFormatException e) {
			System.out.println("점수를 숫자를 바꾸는 과정에서 오류 발생");
		
		// IO(input,output) : 입출력 장치로부터 무언가를 수행하는데 무언가 문제 발생
		// 버퍼리드라인에서 문제가생긴거임
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("버퍼로부터 데이터를 읽는데 문제가 발생 :(");
		} // try : 파일 읽기 END :)
		
		// scoreList에는 score.txt 파일에서 읽은 성적 리스트가 들어 있다.
		
		// scoreList에 학번 00010인 학생의 성적 사항을 찾아서 console에 출력
		int size = scoreList.size();
		
		for (int i = 0 ; i < size ; i++) {
			
			ScoreVO sVO = scoreList.get(i);
			
			if (sVO.getNum().equals("00010")) {
				
				System.out.println("학번:" + sVO.getNum());
				System.out.println("국어:" + sVO.getKor());
				System.out.println("영어:" + sVO.getEng());
				System.out.println("수학:" + sVO.getMath());
				
				break;
			}
		}
		
		for(ScoreVO sVO : scoreList) {
			
			if (sVO.getNum().equals("00010")) {
				
				System.out.println("학번:" + sVO.getNum());
				System.out.println("국어:" + sVO.getKor());
				System.out.println("영어:" + sVO.getEng());
				System.out.println("수학:" + sVO.getMath());
				
				break;
			}
		}
	}
}
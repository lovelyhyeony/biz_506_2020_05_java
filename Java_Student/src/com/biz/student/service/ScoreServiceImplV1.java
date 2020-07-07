package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.Student;

public class ScoreServiceImplV1 implements ScoreService {

	// 필드변수로 List선언
	private List<Student> studentList;
	private List<ScoreVO> scoreList;

	// 생성자 안에 List초기화 해주는 코드 넣어줌
	public ScoreServiceImplV1() {
		studentList = new ArrayList<Student>();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/biz/student/exec/student.txt";

		// FileReader 클래스로 fileReader 객체(인스턴스)를 선언하고 clear하기
		// 문자열, 숫자 등이 아닌 정체를 알 수 없는 클래스로 객체를 선언할 때는
		// 가급적 null로 clear를 시켜주는 것이 좋다.
		FileReader fileReader = null;

		// 로컬디스크에 저장된 파일을 읽을 때 FileReader만으로 읽을 수 있지만
		// 파일을 읽어들이는 성능상의 이점을 주기위해서 중간에 BufferedReader를
		// 연결하여 파일을 읽어들이는 것이 좋다.
		BufferedReader buffer = null;

		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";

			int cnt = 0;
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);

				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");

				Student std = new Student();
				std.setNum(students[SplitPos.STUDENT.ST_NUM]); // 학생 클래스 안에 있는 넘버 포지션 값
				std.setName(students[SplitPos.STUDENT.ST_NAME]); // 1번지에 있는 이름 값 세팅
				std.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				std.setDept(students[SplitPos.STUDENT.ST_DEPR]);
				studentList.add(std);
			}

			// 닫는 순서는 연 순서와 반대로!!
			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서 종료해주어야한다.
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/biz/student/exec/score.txt";

		FileReader fileReader = null;

		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";

			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				// :으로 나누어줌
				String[] scores = reader.split(":");

				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[SplitPos.SCORE.SC_NUM]); // 0번지에 있는 학번 값 세팅
				sVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR])); // score.txt안의 1번지는 국어 값 세팅
				sVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG])); // 마찬가지!!
				sVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));

				scoreList.add(sVO);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void clacSum() {

		for (ScoreVO sVO : scoreList) {

			int intSum = sVO.getKor();
			intSum += sVO.getEng();
			intSum += sVO.getMath();

			sVO.setSum(intSum);
			// scoreList.add에 안해줘도 되는 이유는
			// scoreList에 알아서 찾아가서 setting이 됌 자바에서는!!
		}

	}

	@Override
	public void calcAvg() {

		for (ScoreVO sVO : scoreList) {
			float floatSum =(float)sVO.getSum();
			float floatAvg = floatSum / 3;

			sVO.setAvg(floatAvg);
		}

	}

	@Override
	public void socreList() {
		// TODO Auto-generated method stub
		System.out.println("=============================================================");
		System.out.println("성적일람표");
		System.out.println("=============================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");


		// data의 Join
		// scoreList, studentList Join해서 데이터를 출력하는 코드
		for (ScoreVO sVO : scoreList) {

			System.out.print(sVO.getNum() + "\t");

			// score의 학번으로 studentList에서 찾기
			for (Student std : studentList) {

				// 학번이 같은 학생의 정보를 찾았으면
				// 정보를 표시!
				if (sVO.getNum().equals(std.getNum())) {
					System.out.print(std.getName() + "\t");
					break;
				}
				
			}
			// if 안에 안넣은 이유는 학생번호가 없을때 아예다 출력이 안나오기에
			// if 밖에 선언
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.printf("%5.2f\n",sVO.getAvg());
		}
		System.out.println("=============================================================");
	}
}
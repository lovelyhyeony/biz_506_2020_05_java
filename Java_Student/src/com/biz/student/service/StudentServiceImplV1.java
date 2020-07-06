package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.Student;

public class StudentServiceImplV1 implements StudentService {

	// 필드변수
	// class Scope의 변수를 선언하기
	// 여기(필드변수 영역)에 선언된 변수는
	// 현재 클래스의 모든 method들이 공유하고, 참조(쓰기, 읽기)가 가능하다.
	
	// 변수의 scope
	// 변수를 선언할 때 어디에 선언하느냐에 따라
	// 변수를 참조할 수 있느냐 없느냐가 결정된다.
	
	// 필드변수를 선언할 때 접근제한자를 public, private, protected중에 한가지로 설정할 수 있다.
	
	// 필드변수를 선언할 때 가급적 public으로 선언하는 것은 **지양**해야한다.
	// 필드변수를 public으로 선언해놓으면 외부에서 필드변수에 직접접근하여 값을 변형 시킬 수 있다.
	// 그러하면 예기치 못한 결과를 얻을 수 있다.
	
	// 필드변수를 private으로 선언하는 것은
	// 객체의 정보은닉, 캡슐화 패턴에 적합한 방식
	// 외부에서 접근하지 못하도록 차단하고 현재 클래스에 선언된 method에서만
	// 접근을 허용하는 것이다.
	// 혹시 필드변수를 외부에서 접근할 필요가 있는 경우는 getter, setter를 만든다.
	
	// 필드변수를 protected로 선언하기
	// protected는 private접근제한자와 거의 유사한 형태이다.
	// 만약 현재 클래스를 다른 클래스를 만들 때 상속(extends)하여 사용하려고 할 때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아서 사용하고자 할 때는
	// 변수를 protected로 선언한다.
	
	// 현재 클래스에서는 private처럼 작동하고 
	// 상속받은 클래스에서도 마치 자신이 변수를 선언한 것처럼 사용할 수 있게 된다.
	
	// 현재 클래스를 상속할 수 있도록 생각을 하고 구현을 한다면
	// 필드변수를 protected로 선언을 한다.
	
	// 만약 private으로 선언을 하면 상속받은 클래스에서
	// 이 변수들을 다시 선언 해주어야한다.
	protected List<Student> studentList; // studentList 필드변수 선언
	
	// 클래스 생성자
	// 클래스를 객체(인스턴스)로 만들 때 호출되는 method
	// 클래스를 객체로 생성할 때 1번 호출되는 method로 반드시 생성(초기화)가 필요한
	// 필드변수들을 여기에 생성하는 코드를 작성해준다. 
	public StudentServiceImplV1() {
		studentList = new  ArrayList<Student>(); // 기본 생성자 안에 List 초기화해주는 코드
	}
	
	@Override
	public boolean inputStudent() {
		
		Scanner scan = new Scanner(System.in); // 어차피 이 곳에서 scanner를 사용하기 때문에 여기다가 선언 및 초기화
		Student student = new Student();
		
		// 사용자가 END를 누르면
		// if문을 타고 false를 반환하게 해서
		// main이 있는 클래스에서 반복문을 종료하게 만들거임
		System.out.print("학번 (입력종료 : END) >> ");
		String strNum = scan.nextLine();
		
		if(strNum.equals("END")) {
			return false;
		}
		
		student.setNum(strNum); // 학번에 값 세팅
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();

		student.setName(strName); // 이름에 값 세팅
		
		System.out.print("학년 >> ");
		String strGrade = scan.nextLine();
		
		// Student에서 grade를 int로 선언했기 때문에
		// 문자열을 숫자형으로 변경해주는 try-catch문 작성
		// (모르고 문자를 입력 했을때를 방지하기 위함)
		// catch문을 타면 다시 처음부터 작성함
		// true값을 보내서
		
		// 유효성 검사
		// 현재 입력된 정보가 정상 범위(Validate)에 있는지 검사하여
		// 데이터를 사용할지 말지를 결정하고
		// 입력하는 사용자에게 통보하고 다른 행동을 취할 수 있도록 하는 것
		// 유효성검사는 개발자 입장에서 매우 귀찮은 단순노동일 경우가 많지만
		// 사용자입장에서는 유효성검사가 많으면 그만큼 잘못된 데이터를 입력하는 경우를 방지할 수 있다.
		int intGrade = 0 ;
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 가능 :(");
			System.out.println(student.getName() + "다시 입력 해주세요");
			return true;
		}
		
		if(intGrade < 1 || intGrade > 4) {
			System.out.println("학년은 1 ~ 4까지만 가능");
			System.out.println(student.getName() + "다시 입력 해주세요");
		}
		
		student.setGrade(intGrade); // 학년에 값 세팅
		
		System.out.print("전공 >> ");
		String strDept = scan.nextLine();
		
		student.setDept(strDept); // 전공에 값 세팅
		
		// 모든 입력이 정상처리 되었으면
		// List에 학생정보를 추가한다.
		studentList.add(student); // studentList에 입력된 값들 추가
		
		// 메서드 제일 끝의 return문은 한 학생의 정보가 모두 정상 입력이 되면
		// true를 return하여 다음 학생의 정보를 입력하도록
		// 호출한 곳에 통보(return)해야 하는데 이때 true를 return하도록 해야한다.
		return true;
	} // >>>>>>> inputStudent method 종료 :) <<<<<<<

	@Override
	public void studentList() {
		System.out.println("=============================================================");
		System.out.println("학생 정보");
		System.out.println("=============================================================");
		System.out.println("학번\t이름\t학년\t전공");
		System.out.println("-------------------------------------------------------------");
		
		int size = studentList.size();
		for(int i = 0 ; i < size ; i++) {
			
			Student student = studentList.get(i);
			
			System.out.print(student.getNum() + "\t");
			System.out.print(student.getName() + "\t");
			System.out.print(student.getGrade() + "\t");
			System.out.println(student.getDept());
			
		}
		System.out.println("=============================================================");
	} // >>>>>>> studentList method 종료 :) <<<<<<<

}

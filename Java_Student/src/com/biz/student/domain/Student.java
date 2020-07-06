/*
 * 객체추상화
 * 다음과 같은 StudentVO 생성
 * 학번 : num, "00001"
 * 이름 : name, "홍길동"
 * 학년 : grade, 3
 * 전공 : dept, "컴퓨터공학"
 * 
 * 각 필드의 type을 무엇으로 ?
 * 변수는 private > getter, setter method 설정
 */
package com.biz.student.domain;

/*
 * VO클래스는 실제로 프로젝트에서
 * 주로 다루게 될 Data를 추상화한 클래스
 * 주요 항목 : 필드변수가 매우 중요한 클래스
 * method 역할보다는 필드변수 역할이 주로 사용되는 클래스
 */
public class Student {
	
	private String num ; // "00001", 숫자형으로 하면 000을 부착할 수 없기때문에 String
	private String name;
	private int grade;
	private String dept;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
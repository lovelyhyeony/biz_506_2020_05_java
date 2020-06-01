package com.biz.classes.model;

/*
 * 클래스에는 변수, method가 존재한다.
 */
public class Student {
	// 클래스내의 method 밖에서 선언된 변수들
	// 멤버변수, 필드변수, 속성(Property)
	public String name;
	private int age;
	public String tel;
	private String addr;
	public int grade;
	
	String rem;
	
	// 임의로 생성한 method
	// setName() method라고 칭한다.
	// 현재는 하는일이 정해지지 않은 이름만 있는 상태
	// public : 접근제한자 라고 한다.
	//			누구나 접근할 수 있는 상태
	// private : 접근제한자 라고 한다.
	//			public과 반대되는 개념
	//			나 외에는 아무도 접근하지 마라는 이야기
	public void setName() {
		
	}

}

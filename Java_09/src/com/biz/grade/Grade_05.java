package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {

	public static void main(String[] args) {

		int Sum = 0;// 선언문 // 10 8승-1
		for (int i = 0; i < 1000000000; i++) {
			Sum = 100; // 할당문 가장마지막에 담겨있는 값이 나옴
		}
		// Sum이 100이 나온 이유는
		// for 반복문이 아무리 많이 실행되어도
		// 사칙연산이 없고 100을 할당하라는 할당연산자밖에 없기때문에 100이라는 결과가 나옴

		for (int i = 0; i < 10; i++) {
			System.out.println(Sum);
		} // 100이 열번이됌

		Student student = new Student(); // 스튜돈투 쿨랴스에서 스튜던트 객체

		// Student 클래스에 선언된 make() 메서드를 호출하라라는 코드
		student.make(); // 메이크메서드 호출
		String strN = student.getName(); // 겟네임메서드사용해서 할당
		/*
		 * public class Student {
		 * 
		 * 	String strName = "홍길동";
		 * 
		 * 		public void make() { strName = "이몽룡";
		 * 
		 * } // 이몽룡으로 괄호가끝나도 ?? strName = > 이몽룡
		 * 
		 * 		public String getName() { return strName;
		 * 
		 * }
		 * 
		 * }
		 */

		System.out.println(strN); // 콘솔에 보이라는

		
		Random rnd = new Random();
		rnd.nextInt();
		
		
		
		
		
		
		
		
		
	}

}

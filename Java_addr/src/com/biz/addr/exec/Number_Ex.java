package com.biz.addr.exec;

public class Number_Ex {

	public static void main(String[] args) {
		
		/*
		 * 숫자형 wrapper class의 valueOf() method를 사용하면
		 * 숫자형 문자열을 숫자형 데이터로 변환 시킬수 있다.
		 * 
		 * 오래된 java 버전에서는 valueOf(), parse*() method의 성능차이가 있었으나
		 * java 1.6 이상에서는 내부 메커니즘이 같아져 성능 차이가 없다.
		 */
		
		// Integer.valueOF() : 숫자형 문자열을 정수로 변환시키는 method
		Integer.valueOf("34"); // 정수 34
		
		Float.valueOf("34.3"); // 실수형로 변환시키는
		Double.valueOf("34.3");
		Long.valueOf("333333"); // 숫자형 문자열을 실제 숫자로 변환시켜주는 메서드들
		// >>>>>>>>>>>>>>>>> 1.5이후에 이걸 써도 아무런 문제 없으니까
		// >>>>>>>>>>>>>>>>> 우리가 사용할 것들은 valueOf
		
		// 두개의 성능이 같다.라고 보면 된다. 굳이 parse는 안써도 됌.
		
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("3333"); // >>>> 자바 1.5 이전부터 사용되던 method
		// >>>>>>>>>> 이런게 있다고 생각
		
		
		// 아래와 같은 경우는 모두 NumberFormatException을 일으키는 코드.
		Integer.valueOf(""); // >>> 가장 많이 문제가 되는 코드 (아무것도 없이 엔터만 누르는)
		
		Integer.valueOf("34 "); // 숫자 앞, 뒤에 white space 문제 (spacebar 빈칸이 들어가있는 경우)
		Integer.valueOf("A34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식처럼 보일 때
	}
}

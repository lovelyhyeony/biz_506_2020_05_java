package com.biz.classis;
/*
 * 1. Car 클래스는 main() method가 없다.
 * 2. 자동차 이름이라는 변수가 "클래스 선언명령문 : (public class Car)"
 * 		바로 선언과 초기화(자동차 문자열을 할당) 가 되어 있다.
 * 3. 변수 선언문 앞에 public 이라는 키워드가 부착돼 있다.
 * 4. 전진()...의 메서드 코드가 있다.
 * 		이 메서드 코드를 메서드 선언문
 * 5. Car 클래스를 만들어 사용하는 이유는 비슷한 기능을 한번만 만들고
 * 		여러곳에서 사용하기 위함
 */
public class Car { // Car 클래스 선언문
	
	
	public String 자동차이름 ="자동차" ; // 변수 선언문
	
	
	public void 주차() {
		System.out.printf("%s 가 주차합니다\n",자동차이름);
	}
	
	//메서드 선언문이다 라고함
	public void 전진() { // 전진()메서드 선언문
		
		System.out.printf("%s 가 전진합니다\n",자동차이름);

	}

	public void 후진() {
		System.out.printf("%s 가 후진합니다\n",자동차이름);
	}

	public void 멈춤() {
		System.out.printf("%s 가 멈춥니다\n",자동차이름);

	}

	public void 좌() {
		System.out.printf("%s 가 좌회전합니다\n",자동차이름);

	}

	public void 우() {
		System.out.printf("%s 가 우회전합니다\n",자동차이름);

	}

}

// 여기는 메인메서드가 없어서 실행해도 carmake02가 나옴
// 스스로 작동되지 않는 명령문들이 모여있다라고도 함
package com.biz.grade;

import java.util.Random;

public class Grade_02 {

	public static void main(String[] args) {
		
		// rnd : 인스턴스, 객체 라고 부른다.
		// 변수이면서 일반적인 변수와는 다른 성질을 갖는다.
		Random rnd = new Random();
		
		// 점, DOT (.) 연산자를 사용하여 또 다른 기능의 명령어를 연결하고
		// 명령문을 이룰 수 있다. // 변수와 같기에 혼자는 못씀 / rnd; X
		
		// 아래의 명령문은 아무일도 수행하지 않는 것처럼 보이지만
		// 실제로는 무언가 기능을 수행하게 된다.
		// 이 명령문은 Console 에 표시하는 기능이 없기 때문에
		// 		수행된 결과를 확인할 수 없을 뿐이다.
		
		// 점 연산을 사용하여 연결되는 명령문 중 () 가 부착되는 명령문을 method라고 부른다.
		
		rnd.nextInt();  // rnd 객체의 nextInt() method라고 부른다.
						//Random 클래스의 nextInt() method라고도 부른다.
		
		// 명령문이 수행된 결과를 Console에 나타내고 싶으면
		// 일단 어떤 변수와 연결하여 사용을 한다.
		// 아래의 코드는 nextInt() method를 실행한 후
		// 결과를 num라는 변수에 보관을 한다.
		int num = rnd.nextInt();
		System.out.println(num); // 비로소 변수에 담아서 변수에 있는 내용을 Console에 출력하면 rnd가 무슨 일을 했는지 알 수 있음		
		
		// nextInt()는 다른 (4칙)연산자와 혼합하여 연산을 수행할 수 있는데
		// 이때는 그 결과를 반드시 다른 변수에 보관해야한다.
		num = rnd.nextInt() / 10 ;
		
		// system, out, println()라는 3개의 명령어가 점(.)연산자로 연결되어 하나의 명령문이 된 형태
		// 이 명령문은 끝의 println() method의 괄호안에 있는 값, 연산결과, 변수에 담긴 값들을 Console에 보여주는 명령문이다.
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

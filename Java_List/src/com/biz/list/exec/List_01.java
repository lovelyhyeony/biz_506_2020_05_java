/*
 * com.biz.list : 3단계 패키지, Base Package
 * com.biz.list.exec : 4단계 패키지, 업무적인 분류를 나타내는 package
 */
package com.biz.list.exec;

// intList 이름으로 Integer형 리스트 선언
// Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가
// 리스트에 추가된 100개의 정수를 모두 덧셈하여 Console에 출력
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_01 {

	public static void main(String[] args) {
		
		// Random 클래스를 사용해서 뭔가 수행을 하기 위한 준비
		// 클래스
		// 	   Random클래스의 인스턴스(Instance), 객체(object) : rnd << = 줄여서 많이 사용 보통 random이라 지음 
		//			rnd 인스턴스를 사용가능하도록 초기화
		//			rnd 인스턴스를 초기화 하겠다라는 키워드 : new
		//				생성자(Constructor) method : Random()
		Random rnd = new Random(); //일종의 메서드 클래스하고 이름이 같은데 new 라는 키워드가 붙은 메서드를 부르는 이름이 따로 있음
		// Random 클래스를 사용해서 rnd 인스턴스를 선언하고
		// Random() 생성자를 호출하여 rnd 인스턴스를 초기화(새로 만들기 new)하라
		
		/*
		 * 다른 클래스와 좀 색다르게 선언하는 클래스와 초기화하는 생성자의 이름이 다른 형태를 갖는다.
		 * 클래스에  <Generic> 키워드를 포함하여 사용을 한다.
		 * Integer형 데이터를 포함할 intList를 선언하고  초기화 하는 코드
		 * Integer형 리스트 라고 부른다.
		 * 자바에서 기본 배열형 데이터를 사용하는데 어려움이 있어서
		 * JDK에서 제공해주는 도구를 사용하여 많은 개수의 데이터를 관리하기 위한 방법을 제공한다.
		 */
		List<Integer> intList = new ArrayList<Integer>();
		// 리스트를 처음 만들면 size() 값이 0인 데이터가
		// 아무것도 없는 리스트가 만들어진다.
		
		intList.add(90); // size() 1인 리스트가 되고 데이터가 1개 추가
		intList.add(100); // 리스트를 데이터 개수만큼 추가하여 사용
		
		
		
		
		
		for(int i = 0 ; i < 100 ; i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		int sum = 0 ; 
		for(int i = 0 ; i < 100 ; i++) {
			sum += intList.get(i);
		}
		
		System.out.println("덧셈 결과 : " + sum);
		
		
		
		
	}
}

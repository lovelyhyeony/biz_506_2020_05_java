package com.biz.list.exec;
/*
 * intList 이름으로 Integer형 리스트 선언
 * Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가
 * 리스트에 추가된 100개의 정수중 값이 55가 있으면 출력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		Random rnd = new Random();
		
		// 100개의 임의의 숫자 생성
		for(int i = 0 ; i < 100 ; i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		/*
		 * intList.get(i) method의 구조
		 * public int get (int i) {
		 * 			return x ;
		 * }
		 */
		// 리스트에 추가된 100개의 정수중 값이 55가 있으면 출력
		for(int i = 0 ; i < 100 ; i++) {
			int num = intList.get(i); // get에서 값을 뽑을때는 직접사용하지말고 변수에 값을 복사해놓고 해라!
			if(num == 55) {
				System.out.println(num);
			}
		}
		
		/*
		 * get메서드를 변수에 저장하라는 이유
		 * intList.get(i) method를 호출하여 값을 가져오는데
		 * 몇번 반복해서 실행해도 항상 같은 값이 return될 것이다.
		 * 그럼에도 불구하고 아래 코드는 같은 일을 두번 실행하여 결과를 얻고 있다.
		 * 짧은 코드이지만 상당히 비효율적인 코드가 될 수 있다 이런거 하나하나가 성능을 좌우할 수 있음
		 * intList.get(i) 를 변수에 일단 한번 저장하고 나머지 코드에서 사용을 하자
		 * 
		 * if(intList.get(i) == 55 ) {
		 * 		System.out.println(intList.get(i)
		 * }
		 * 이것보다는 위에 있는 코드로 가급적으로 써주는게 좋다.
		 */
		
		
		
		
		
		
	}

}

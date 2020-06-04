package com.biz.list.exec;

/*
 * intList 이름으로 Integer형 리스트 선언
 * Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가
 *3. 리스트에 추가된 100개의 정수 중 값이 55가 있으면 몇번째 위치에 있는지 출력
 * 
 *4. 100개의 정수중 55가 최초로 나타는 위치는(1곳)?
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		Random rnd = new Random();

		// 100개의 임의의 숫자 생성
		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		// 리스트에 추가된 100개의 정수중 값이 55가 몇번째 위치에 있는지 3번
		for (int i = 0; i < 100; i++) { // num에 55가 들어있는 값을 알고있는 변수는 i
			int num = intList.get(i);
			if (num == 55) {
				System.out.println(i); // i는 찾은 위치
			}

		}
		
		
		/*
		 * 검색 알고리즘(Search algorithem)
		 * 리스트(배열)의 처음부터 순차적으로 하나씩 비교하면서
		 * 값을 찾다가 값이 있으면 위치를 알려주고
		 * 검색을 중단하는 방식
		 * 리스트의 데이터가 무작위(순서가 없이)로 저장되어 있을 때
		 * 비교적 쉽게 찾을 수 있는 방식
		 * 하지만 찾고자 하는 값이 제일 마지막 위치에 있을 때는
		 * 전체 리스트를 모두 비교해야하기때문에 최악의 효율을 보인다.
		 * 값이 제일 처음에 있을 때는 최고의 효율을 보인다.
		 */
		// 4번 반복문을 끝내면됌..ㅠ
		for (int i = 0; i < 100; i++) { 
			int num = intList.get(i);
			if (num == 55) {
				System.out.println( i );
				break;  // 검색 알고리즘 순차 검색 가장 간단하고 가장 비효율적인..
			}

			
		}

		
		
		
		
		
		
		
		
		
	}

}

package com.biz.list.exec;

/*
 * intList 이름으로 Integer형 리스트 선언
 * Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가
 * 리스트에 추가된 100개의 정수중 짝수들만 출력
 * 리스트에서 짝수들의 개수는 몇개인지 출력
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_03 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		Random rnd = new Random();

		// 값을 지정하는 부분
		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		
		int count = 0;
		// 짝수를 찾으면서 개수까지 찾고 다섯개 되면 엔터치기
		for (int i = 0; i < 100; i++) {

			int num = intList.get(i);

			if (num % 2 == 0) {
				System.out.printf("%d\t", num);
				count++;
				if (count % 5 == 0) {
					System.out.println(); // 안에다가 집어넣어야지 홀수때문에 빈칸안나오고 다섯줄로 넘어가게 됌
				}
			}
			

		}

		System.out.println("\n짝수 개수 : " + count);

	}

	/*
	 * // 짝수 개수 int count1 = 0 ; for( int i = 0 ; i < 100 ; i++) { if(intList.get(i)
	 * % 2 == 0 ) { count1++; } } System.out.println("짝수 개수 : " + count1);
	 */

}

package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {

	public static void main(String[] args) {
		
		// size() 가 0인 intList가 새로 생성된다.
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		// int num = rnd.nextInt(); 여기에 선언하면 같은데이터만 나오는거라 for문안에 넣어줘야함
		// 100까지 만들라고 했으니까
		for(int i = 0 ; i < 100 ; i++) {
			
			// 1~100까지 난수(임의 숫자)를 발생하여
			int num1 = rnd.nextInt(100)+1;
			
			// intList에 추가하라
			intList.add(num1);
			
		}
		// size() 100이 되고 정수값이 100개 추가된 intList가 된다.
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			// i번째 위치 값을 읽어서 sum 변수에 누적하라는 이야기.
			sum += intList.get(i);
			// intList[i] // get안에 들어가는 i나 []에 i나 성질이 같음 index = 첨자(위치값)
		}
		
		System.out.println("합계 : " + sum);
		
		// 꼭 값 저장하는 부분 연산하는 부분 따로 따로 코드 작성해라
		
	}
}

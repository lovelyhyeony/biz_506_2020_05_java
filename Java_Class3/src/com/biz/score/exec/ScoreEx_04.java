package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("대한민국만세"); // 0번에다가 저장 총개수는 3개 size는 3 저장된 위치는 0
		strList.add("우리나라만세"); // 1
		strList.add("Republic of Korea"); // 2
		
		// get() method는 index에 해당하는 정수값을
		// 매개변수로 주입(전달)해주어야 하고
		// 다른 변수에 값을 복사해 올 수 있는 구조다.
		String s1 = strList.get(0); // add에 저장되어있는 문자열을 읽어들이기위해
		String s2 = strList.get(1);
		String s3 =strList.get(2);
		
		System.out.println(s1);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(900);
		
		int num1 = nums.get(0);
		System.out.println(num1); // 저장하고 끄집어 내는 방법
		System.out.println( nums.get(0) ); // 변수에 담지않고 바로 println한테 전달한 방법
		
		// 데이터가 1개이든 100개이든 실행하는 만큼 그 값을 얼마든지 추가할 수 있다는 이야기 =>List
		
		
		
		
	}
}

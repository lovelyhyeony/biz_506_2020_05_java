package com.biz.grade;

import java.util.Random;

public class Grade_14 {

	public static void main(String[] args) {
		
		int[] intNums = new int[6];
		Random rnd = new Random();
		//로또 번호 추첨 코드 중복되지않은 숫자만 찾아내는 코드 0이 나오지 않으려면 배우지 않은 명령어를 하나 추가해야함
		// 이 코드가 어떻게 작동되는지 분석해보자
		for(int i = 0 ; i < 6 ; i++) {
			
			int intNum = rnd.nextInt(45)+1;
			
			int index = 0 ;
			for(index = 0 ; index < 6 ; index++) {
				
				if(intNums[index] == intNum) {
					break;
				}
			}
			if(index == 6 ) {
				intNums[i] = intNum;
				
			}
		}
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(intNums[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}

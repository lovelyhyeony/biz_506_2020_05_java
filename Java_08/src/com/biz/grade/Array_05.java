package com.biz.grade;

import java.util.Random;

public class Array_05 {

	/*
	 * 100개의 배열을 만들고
	 * 1~100 까지 임의의 수를 배열 요소에 저장하고
	 * 100개의 배열을 Console에 표시하되
	 * 한줄에 5개씩 출력
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		// 100개의 배열에 값을 저장하는 구간
		for (int i = 0 ; i < 100 ; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		
		// 값을 출력하는 구간
		for(int i = 0 ; i < 100 ; i ++) {
			System.out.printf("%d\t",intNums[i]);
			if((i+1) % 5 == 0 ) {
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
	}
}

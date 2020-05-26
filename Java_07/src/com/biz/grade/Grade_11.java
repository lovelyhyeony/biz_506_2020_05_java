package com.biz.grade;

import java.util.Random;

public class Grade_11 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		Random rnd = new Random();

		//배열변수에 0~9까지 임의의 숫자를 넣어주는 코드
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		} 

		// intNum 배열에 저장된 정수가 짝수인지 판별하여 Console에 표시
		for (int i = 0; i < 10; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(i + "는 짝수 : " + intNum[i]);
			} else {
				System.out.println(i + "는 짝수가 아님 : " + intNum[i]);
			}
		}

	}
}

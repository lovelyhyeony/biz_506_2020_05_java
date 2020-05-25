package com.biz.hello;

import java.util.Random;

public class Var_01 {

	// 1~100까지 임의의 숫자를 3의 배수, 5의 배수인 경우에 Console에 나타내어라
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;

		if (num % 3 == 0) {
			System.out.println("3의 배수 : " + num);
		} else if (num % 5 == 0) {
			System.out.println("5의 배수 : " + num);
		}

	}

}

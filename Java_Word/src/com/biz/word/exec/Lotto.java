package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

	public static void main(String[] args) {
		
		// 로또번호
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 45 ; i++) {
			
			intList.add(i+1); // 1~45까지 순서대로 저장이 됌
		}
		
		Collections.shuffle(intList); // 값을 뒤죽박죽 섞기!
		
		System.out.println("행운을 드립니다 :)");
		for(int i = 0; i < 6; i++) {
			System.out.print(intList.get(i) + "\t");
		}
		System.out.println("\n꼭 부자 되세요 :)");
	}
}

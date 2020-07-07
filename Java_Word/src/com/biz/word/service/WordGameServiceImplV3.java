package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordGameServiceImplV3 extends WordGameServiceImplV1 {

	/*
	 * List, ArrayList와 같은 클래스류를 Collection이라고 한다. 다수의 데이터를 담을 수 있는 클래스들이며, VO들을 담아서
	 * 연산을 수행하는 목적으로 사용한다.
	 * 
	 * **Collection 클래스들은 Collections라는 클래스의 자손들이다.**
	 */

	// List<WordVO> wordList , count, game 상속
	// loadGame(), playGame(), gameOver() 모두 상속받음

	// playGame() 재정의 해보려고 한다.
	@Override
	public void playGame() {

		Scanner scan = new Scanner(System.in);
		count = 0;
		game = 0;
		while (true) {

			// shuffle()을 사용하여 wordList를 뒤섞고
			// 그 중 0번째 위치의 값을 추출한다. << 데이터가 있다면 숫자 0은 오류가 날 일이 없음!!!
			// 최소 1개만 있어도 0번지니까~
			Collections.shuffle(wordList); // Random클래스를 쓴 것 처럼 순서에 관계없이 뒤죽박죽 나오기때문에
			WordVO wordVO = wordList.get(0); // 새로운 값이 생성

			// vo에서 영단어를 추출하여 split()으로 분해한 후 words배열에 담기! 한번에 처리
			String[] words = wordVO.getEng().split("");
			List<String> wordList = Arrays.asList(words); // 배열을 리스트로 바꾸고
			Collections.shuffle(wordList); // wordList를 다시 뒤섞어준다.

			System.out.println("다음 알파벳을 단어 순서에 맞게 나열하시오(END : 끝)");
			System.out.print(wordList);
			String strInput = scan.nextLine();

			if (strInput.equals("END")) {
				break;
			}

			if (wordVO.getEng().equalsIgnoreCase(strInput)) {
				System.out.println("맞았습니다 :)");
				System.out.println(wordVO.getEng()); // 정상적인 영단어
				System.out.println(wordVO.getKor()); // 한글
				count++;
			} else {
				System.out.println("아쉽네요 :(");
				System.out.println(wordVO.getEng()); // 정상적인 영단어
				System.out.println(wordVO.getKor()); // 한글

			}

			// 힌트도 추가하고 등등 내가 업그레이드 시킬 수 있음
		}
	}

}

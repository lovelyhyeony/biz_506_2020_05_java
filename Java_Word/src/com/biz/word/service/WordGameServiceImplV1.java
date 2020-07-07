package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

// WordEx_01 코드 참조해서 만듬
public class WordGameServiceImplV1 implements WordGameService {

	protected List<WordVO> wordList;
	protected int game;
	protected int count;

	public WordGameServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	}

	// word.txt 파일에서 데이터를 읽어서 wordList 만들기
	@Override
	public void loadWord() {

		String wordFile = "src/com/biz/word/exec/word.txt";

		// 파일을 open하기 위한 객체
		FileReader fileReader = null;

		// fileReader와 연동하여 파일을 읽어올 때
		// 효율적으로 가져오기 위한 Helper class
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);

			// buffer는 파일을 읽어서 임시 버퍼영역에 보관한다.
			buffer = new BufferedReader(fileReader);

			// 클래스를 반복문 내에서 계속 생성하는 건 메모리상 매우 좋지 않음!!!
			// 그래서 밖에 선언 해주고 reader 인스턴스를 사용
			String reader = "";
			while (true) {

				reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				// 읽어들인 데이터를 콜론(:)을 기준으로
				// 문자열을 분해를 하여 words 배열에 담아달라
				String[] words = reader.split(":");

				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]); // = word[0] 0번지에 있는 영단어 담기
				wVO.setKor(words[SplitPosition.WORD_KOR]); // = word[1] 1번지에 있는 한글 담기

				wordList.add(wVO);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("단어장 파일 열기 오류");
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("단어장 읽기 오류");
			return;
		}

	} // >>>>> loadWord method 종료 :) <<<<<

	// 단어를 보여주고 게임 실행하기
	@Override
	public void playGame() {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = wordList.size();

		// 게임을 새로 시작할때마다 초기화 하자
		
		game = 0;
		count = 0;
		
		while (true) {

			int index = rnd.nextInt(size); // : 0 ~ (wordList-1) 만큼 중의 한 수

			System.out.println("다음에 해당하는 영어단어는?(END : 종료)");
			System.out.print(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();

			if (strEng.equals("END")) {
				break;
			}

			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다! 축하합니다 :)");
				count++;
			} else {
				System.out.println("아쉽네요 :(");
				System.out.println(wordList.get(index).getEng()); // 정답을 보여주는
			}
		}

	}

	// Game Over가 되었을 때 점수 등 보여주기
	@Override
	public void gameOver() {

		System.out.println("Game Over :)");
		System.out.printf("%d 번 게임중 %d번 맞음 :)", game, count);

	}

}

package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV1;

public class WordEx_02 {

	public static void main(String[] args) {
		
		WordGameService wGameService = new WordGameServiceImplV1();
		
		wGameService.loadWord();
		wGameService.playGame();
		wGameService.gameOver();
	}
}

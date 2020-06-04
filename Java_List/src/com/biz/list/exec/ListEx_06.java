package com.biz.list.exec;
/*
 * charList 이름으로 Character형 리스트 선언
 * Random 클래스 이용하여 100개의 임의의 알파벳 문자를 생성하여 리스트에 추가
 * 리스트에 추가된 100개의 문자중 'F'가 있으면 최초로 나타난 위치는?(1곳)
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class ListEx_06 {

	public static void main(String[] args) {
		
		// Character형 리스트
		// 문자 데이터를 포함하는 리스트
		List<Character> charList = new ArrayList<Character>();
		
		Random rnd = new Random();
		
		// 알파벳 개수 : 대소문자 각 26개
		char char1 = (char)(rnd.nextInt(26) + 'A') ; // A 의 char 코드값은 96 // 96 ~ 122 A~Z까지 임의의 문자를 만들어 내는 코드 강제형변환을 통해 int형을 캐릭터형으로 변형
		System.out.println(char1);
		
		System.out.println("=====");
		
		// 100개의 임의의 알파벳 문자를 생성
		for(int i = 0 ; i < 100 ; i++) {
			
			// 0 ~ 25까지 정수를 만들고 여기에 영문자 A의 char(ASCII) 코드값을 더하여
			// 'A' ~ 'Z' 중에서 임의 문자 1개를 생성하는 코드
			char char2 = (char)(rnd.nextInt(26) + 'A') ;
			charList.add(char2);
		}
		
		
		// 배열을 만들었을 때
		// 배열의 개수를 알고싶으면 배열.length를 읽어보면 된다.
		// for(int i = 0 ; i < 배열.length ; i++) {  }
		// 리스트에서는 리스트.size() method를 호출하면
		// 리스트의 개수를 알 수 있다.
		
		// 리스트에 추가된 100개의 문자 중 'F'가 있으면 최초로 나타난 위치
		for (int i = 0 ; i < charList.size() ; i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i + "번째에서 찾음");
				break;
			}
		}
		
		
		
		
		// 조금이라도 효율적인 코드를 만들기 위해서는 
		// size()메서드를 한번만 호출해서 인티져형 charSize변수에 저장해놓은것.
		// 이게 훨씬 더 효율적인 코드
		int charSize = charList.size();
		for(int i = 0 ; i < charSize ; i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i + "번째에서 찾음");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}

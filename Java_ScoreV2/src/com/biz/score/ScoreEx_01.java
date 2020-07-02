
package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		
		// 인터페이스를 사용하는 방법 ex) List< > = new ArrayList<>
		// 							실제코드가 담겨있는 V1를 이용해서 초기화함
		
		// interface를 implements하여 만들어진 클래스는
		// 선언을 할 때는 interface로 선언을 하고,
		//						초기화 할때는 실제 코드가 구현된 클래스로 초기화 한다.
		ScoreService sService = new ScoreServiceImplV1();
		
		sService.inputScore();
		sService.calcSum(); 
		sService.calcAvg(); // 여기에는 아무것도 없는데 인풋스코어 메서드랑 스코어리스트는 하는 일이 있으니까 해놔도 오류없이 잘 실행
		sService.scoreList();
		
		/*
		 * List interface는 ArrayList 클래스를 선언할 때 implements한 주체이다.
		 * 따라서 ArrayList형 객체(인스턴스)를 만들때는 
		 * 	선언은 List로 하고, 초기화는 ArrayList로 수행한다.
		 */
		List<String> strList = new ArrayList<String>(); // 이 코드로 많이 사용하라! // 일반 
		strList = new LinkedList<String>(); 
		strList = new Vector<String>();
		
		
		ArrayList<String> strList1 = new ArrayList<String>(); // 이거보다는
	}
}

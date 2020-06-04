package com.biz.list.service;
/*
 * List<ScoreVO>형으로 필드변수 선언
 * stSum() 메서드를 만들고 매개변수로 scoreList를 받아 필드변수에 세팅
 * stSum() 메서드에서 학생별 총점 계산
 * stAvg() 메서드를 만들고 학생별 평균 계산
 * scoreList() 메서드를 만들고 성적리스트 출력
 */
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	List<ScoreVO> scoresList;
	
	int scoreSize = scoresList.size();
	public void stSum(List<ScoreVO> scoresList) {
		
		this.scoresList = scoresList;
		
		}
		
	
	
	
	public void stAvg() {
		
	
		}
	}
	
	
	
	
	
	
	
	
	


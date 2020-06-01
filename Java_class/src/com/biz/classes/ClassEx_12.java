package com.biz.classes;

import com.biz.classes.model.BankVO;

/*
 * 클래스배열 선언 초기화 코드 하고 값저장
 */
public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] bank = new BankVO[5];
		
		bank[0] = new BankVO();
		bank[1] = new BankVO();
		bank[2] = new BankVO();
		bank[3] = new BankVO();
		bank[4] = new BankVO();
		
		bank[0].setStrNum("001");
		bank[1].setStrNum("002");
		bank[2].setStrNum("003");
		bank[3].setStrNum("004");
		bank[4].setStrNum("005");
		
		/*
		for(int i = 0 ; i < bank.length ; i++) {
			bank[i].setStrDate("2020-06-01");
		}*/
		bank[0].setStrDate("2020-06-01");
		bank[1].setStrDate("2020-06-01");
		bank[2].setStrDate("2020-06-01");
		bank[3].setStrDate("2020-06-01");
		bank[4].setStrDate("2020-06-01");
		
		bank[0].setIntInput(5000);
		bank[1].setIntOutput(1000);
		bank[2].setIntInput(5000);
		bank[3].setIntOutput(1000);
		bank[4].setIntOutput(1000);
		
		
		
		
		
	}
}

package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_13 {

	public static void main(String[] args) {
	
		BankVO[] bank = new BankVO[5];
		
		bank[0] = new BankVO();
		bank[1] = new BankVO();
		bank[2] = new BankVO();
		bank[3] = new BankVO();
		bank[4] = new BankVO();
		
		for(int i = 0 ; i < bank.length ; i++) {
			bank[i].setStrNum("001");
		}
		
		bank[0].setStrDate("2020-05-01");
		bank[1].setStrDate("2020-05-02");
		bank[2].setStrDate("2020-05-03");
		bank[3].setStrDate("2020-05-04");
		bank[4].setStrDate("2020-05-05");
		
		bank[0].setIntInput(5000);
		bank[2].setIntInput(5000);
		
		bank[1].setIntOutput(1000);
		bank[3].setIntOutput(1000);
		bank[4].setIntOutput(1000);
		
		
		
	}
	
	
}

package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {

	public void bankList(BankVO[] bankList) {
		
		LineService line = new LineService();
		
		String d_line = line.do_line(50);
		String s_line = line.single(50);
		
		System.out.println(d_line);
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		System.out.println(s_line);
		
		
		for(int i = 0 ; i < bankList.length ; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					bankList[0].getStrNum(),
					bankList[i].getStrDate()
					,bankList[i].getIntInput(),
					bankList[i].getIntOutput(),
					bankList[i].getIntValance());
		}
		
		System.out.println(d_line);
	}
}

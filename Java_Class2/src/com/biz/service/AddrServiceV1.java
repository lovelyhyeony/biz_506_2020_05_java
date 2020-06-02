package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {

	public void addrList(AddressVO[] addrList) {

		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("주소록");
		System.out.println(s_line);
		System.out.println("이름\t주소\t번호\t나이");
		System.out.println(s_line);
		
		for(int i = 0 ; i < addrList.length ; i++) {
			System.out.printf("%s\t%s\t%s\t%d\n"
					,addrList[i].getName()
					,addrList[i].getAddr()
					,addrList[i].getTel()
					,addrList[i].getAge());
		}
		
		System.out.println(d_line);
	}
}

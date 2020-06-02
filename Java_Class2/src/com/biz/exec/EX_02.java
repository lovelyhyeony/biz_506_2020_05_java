package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class EX_02 {

	public static void main(String[] args) {
		
		AddressVO[] address = new AddressVO[5];
		/*
		address[0] = new AddressVO();
		address[1] = new AddressVO();
		address[2] = new AddressVO();
		address[3] = new AddressVO();
		address[4] = new AddressVO();
		*/
		// 인덱스 부분만 변할때 for문을 이용해서 사용 가능하다
		for(int i  = 0 ; i < address.length ; i++) {
			address[i] = new AddressVO();
		}
		
		address[0].setName("홍길동");
		address[1].setName("이몽룡");
		address[2].setName("성춘향");
		address[3].setName("이의현");
		address[4].setName("유재석");
		
		address[0].setAddr("광주광역시");
		address[1].setAddr("대전광역시");
		address[2].setAddr("부산광역시");
		address[3].setAddr("서울특별시");
		address[4].setAddr("인천광역시");
		
		address[0].setTel("010-111");
		address[1].setTel("010-222");
		address[2].setTel("010-333");
		address[3].setTel("010-444");
		address[4].setTel("010-555");
		
		address[0].setAge(30);
		address[1].setAge(27);
		address[2].setAge(19);
		address[3].setAge(25);
		address[4].setAge(43);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		
		// 배열을 매개변수를 통해 method에게 전달할 때는 이름만 붙여주면 된다.
		addrService.addrList(address);
		
		
	}
	
}

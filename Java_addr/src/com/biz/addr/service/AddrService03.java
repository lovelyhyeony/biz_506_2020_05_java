package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService03 {

	private List<AddrVO> addrList;

	private Scanner scan;

	public AddrService03() {
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);
	}

	/*
	 * 현재 코드는 main에서 지정된 for반복문의 개수만큼 입력을 수행해야한다. 만약 입력하는 도중 입력을 중단하고 싶을 때 중단할 수 있도록
	 * 코드를 개선하자.
	 * 
	 * 입력하는 도중 이름항목에 이름대신 END문자열을 입력하면 입력을 중단한다.
	 */
	public boolean inputAddr() {

		System.out.print("이름(중단:END) >> ");
		String strName = scan.nextLine();

		System.out.println("입력값 : " + strName);
		// 만약 이름을 입력할 때 문자열 END를 입력하면
		// 더이상 진행하지말고 false를 return하고 method를 중단하라
		// if(strName == "END") {
		if (strName.equals("END")) {
			return false;
		}

		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();

		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();

		System.out.print("나이 >> ");
		String strAge = scan.nextLine();

		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			System.out.println("나이는 숫자만 가능합니다.");
			System.out.println("나이 입력이 잘못되어 0으로 임시 저장합니다.");
		}

		System.out.print("관계 >> ");
		String strNet = scan.nextLine();

		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName); // addrVO에 추가한거
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);
		addrList.add(addrVO); // 리스트에 추가한거

		return true;
	}

	public void addrList() {

		AddrVO addrVO = new AddrVO();

		System.out.println("=========================================");
		System.out.println("주소록");
		System.out.println("-----------------------------------------");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");

		// i < 5로 설정을 하게되면
		// 5명의 주소록을 표시할 때는 문제가 없으나
		// 만약 주소록 데이터의 개수가 변경되면 문제를 일으킨다.
		// addrList의 개수를 별도의 변수에담고
		int addrListSize = addrList.size();

		// size의 개수만큼 반복문을 수행하도록
		for (int i = 0; i < addrListSize; i++) {

			// vo에 리스트를 추출하도록 만듬
			AddrVO vo = addrList.get(i);

			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAddr() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.print(vo.getNet() + "\n");

		}
		System.out.println("=========================================");

	}
}
